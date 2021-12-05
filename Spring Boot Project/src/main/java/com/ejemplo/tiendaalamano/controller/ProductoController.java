package com.ejemplo.tiendaalamano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.service.IProducto;
import com.ejemplo.tiendaalamano.model.Producto;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/productos")
public class ProductoController {
	
	@Autowired
	private IProducto service;
	
	@GetMapping
	public List<Producto> all() {
		return service.findAll();
	}
	
	
	@GetMapping("{id}")
	public Optional<Producto> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping("{descripcion}")
	public List<Producto> showPorDescripcion(@PathVariable String descripcion) {
		return service.findByDescripcion(descripcion);
	}
	
	@ResponseStatus(code = HttpStatus.CREATED, reason ="Producto creado correctamente" )
	@RequestMapping(method =  RequestMethod.POST, consumes="application/JSON")
	public void save(@RequestBody Producto producto) {
		 service.save(producto);
	}
	
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Producto update(@PathVariable Long id, @RequestBody Producto producto) {
		Optional<Producto> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Producto productoUpdate = op.get();
					
			productoUpdate.setDescripcion(producto.getDescripcion());
			
			
			
			return service.save(productoUpdate);
		}
		
		return producto;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

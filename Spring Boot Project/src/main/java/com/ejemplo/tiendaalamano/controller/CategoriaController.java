package com.ejemplo.tiendaalamano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.service.ICategoria;
import com.ejemplo.tiendaalamano.model.Categoria;




@RestController
@RequestMapping("api/categorias-productos")
public class CategoriaController {
	
	@Autowired
	private ICategoria service;
	
	@GetMapping
	public List<Categoria> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Categoria> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@ResponseStatus(code = HttpStatus.CREATED, reason ="Categoria creada correctamente" )
	@RequestMapping(method =  RequestMethod.POST, consumes="application/JSON")
	public void save(@RequestBody Categoria categoria) {
		   service.save(categoria);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Categoria update(@PathVariable Long id, @RequestBody Categoria categoria) {
		Optional<Categoria> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Categoria categoriaUpdate = op.get();
					
			categoriaUpdate.setDescripcion(categoria.getDescripcion());
			
			
			
			return service.save(categoriaUpdate);
		}
		
		return categoria;
	}
	
	@DeleteMapping("{id}")
	public String delete(@PathVariable Long id) {
		 service.deleteById(id);
		 return "Registro Eliminado";
	}

}

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ejemplo.tiendaalamano.service.IMarca;
import com.ejemplo.tiendaalamano.model.Marca;




@RestController
@RequestMapping("/api/marcas")
public class MarcaController {
	
	@Autowired
	private IMarca service;
	
	@GetMapping
	public List<Marca> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Marca> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	
	@ResponseStatus(code = HttpStatus.CREATED, reason ="Marca creada correctamente" )
	@RequestMapping(method =  RequestMethod.POST, consumes="application/JSON")
	public void save(@RequestBody Marca marca) {
		 service.save(marca);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Marca update(@PathVariable Long id, @RequestBody Marca marca) {
		Optional<Marca> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Marca marcaUpdate = op.get();
					
		marcaUpdate.setDescripcion(marca.getDescripcion());
		marcaUpdate.setEstado(marca.getEstado());
		
			
			
			
			return service.save(marcaUpdate);
		}
		
		return marca;
	}
	
	@DeleteMapping("{id}")
	public String delete(@PathVariable Long id) {
		 service.deleteById(id);
		 return "Registro Eliminado";
	}

}

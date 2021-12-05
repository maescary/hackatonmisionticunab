package com.ejemplo.tiendaalamano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.service.IDevolucion;
import com.ejemplo.tiendaalamano.model.Devolucion;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/devoluciones")
public class DevolucionController {
	
	@Autowired
	private IDevolucion service;
	
	@GetMapping
	public List<Devolucion> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Devolucion> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Devolucion save(@RequestBody Devolucion devolucion) {
		return service.save(devolucion);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Devolucion update(@PathVariable Long id, @RequestBody Devolucion devolucion) {
		Optional<Devolucion> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Devolucion devolucionUpdate = op.get();
					
			devolucionUpdate.setFechaDevolucion(devolucion.getFechaDevolucion());
			
			
			
			return service.save(devolucionUpdate);
		}
		
		return devolucion;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

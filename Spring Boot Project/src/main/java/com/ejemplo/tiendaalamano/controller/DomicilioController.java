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

import com.ejemplo.tiendaalamano.service.IDomicilio;
import com.ejemplo.tiendaalamano.model.Domicilio;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/domicilios")
public class DomicilioController {
	
	@Autowired
	private IDomicilio service;
	
	@GetMapping
	public List<Domicilio> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Domicilio> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Domicilio save(@RequestBody Domicilio domicilio) {
		return service.save(domicilio);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Domicilio update(@PathVariable Long id, @RequestBody Domicilio domicilio) {
		Optional<Domicilio> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Domicilio domicilioUpdate = op.get();
					
			domicilioUpdate.setObservacion(domicilio.getObservacion());
			
			
			
			return service.save(domicilioUpdate);
		}
		
		return domicilio;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

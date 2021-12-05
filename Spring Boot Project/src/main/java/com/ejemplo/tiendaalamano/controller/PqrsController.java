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

import com.ejemplo.tiendaalamano.service.IPqrs;
import com.ejemplo.tiendaalamano.model.Pqrs;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/pqrs")
public class PqrsController {
	
	@Autowired
	private IPqrs service;
	
	@GetMapping
	public List<Pqrs> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Pqrs> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Pqrs save(@RequestBody Pqrs pqr) {
		return service.save(pqr);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Pqrs update(@PathVariable Long id, @RequestBody Pqrs pqr) {
		Optional<Pqrs> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Pqrs pqrUpdate = op.get();
					
			pqrUpdate.setEstado(pqr.getEstado());
			pqrUpdate.setFechaRegistro(pqr.getFechaRegistro());
			
			
			
			return service.save(pqrUpdate);
		}
		
		return pqr;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

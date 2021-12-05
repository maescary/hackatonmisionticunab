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

import com.ejemplo.tiendaalamano.service.ICredito;
import com.ejemplo.tiendaalamano.model.Credito;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/creditos")
public class CreditoController {
	
	@Autowired
	private ICredito service;
	
	@GetMapping
	public List<Credito> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Credito> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Credito save(@RequestBody Credito credito) {
		return service.save(credito);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Credito update(@PathVariable Long id, @RequestBody Credito credito) {
		Optional<Credito> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Credito creditoUpdate = op.get();
					
			
			
			
			return service.save(creditoUpdate);
		}
		
		return credito;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

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

import com.ejemplo.tiendaalamano.service.IKardex;
import com.ejemplo.tiendaalamano.model.Kardex;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/kardex")
public class KardexController {
	
	@Autowired
	private IKardex service;
	
	@GetMapping
	public List<Kardex> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Kardex> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Kardex save(@RequestBody Kardex kardex) {
		return service.save(kardex);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Kardex update(@PathVariable Long id, @RequestBody Kardex kardex) {
		Optional<Kardex> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Kardex kardexUpdate = op.get();
					
			kardexUpdate.setCantidadIngresada(kardex.getCantidadIngresada());
			
			
			
			return service.save(kardexUpdate);
		}
		
		return kardex;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

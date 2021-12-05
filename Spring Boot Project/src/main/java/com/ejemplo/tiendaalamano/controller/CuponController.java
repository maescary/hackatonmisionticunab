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

import com.ejemplo.tiendaalamano.service.ICupon;
import com.ejemplo.tiendaalamano.model.Cupon;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/cupones")
public class CuponController {
	
	@Autowired
	private ICupon service;
	
	@GetMapping
	public List<Cupon> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Cupon> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Cupon save(@RequestBody Cupon cupon) {
		return service.save(cupon);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Cupon update(@PathVariable Long id, @RequestBody Cupon cupon) {
		Optional<Cupon> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Cupon cuponUpdate = op.get();
					
			cuponUpdate.setPorcentajeDescuento(cupon.getPorcentajeDescuento());
			
			
			return service.save(cuponUpdate);
		}
		
		return cupon;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

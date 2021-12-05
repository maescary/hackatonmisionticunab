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

import com.ejemplo.tiendaalamano.service.IMedioDePago;
import com.ejemplo.tiendaalamano.model.MedioDePago;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/medios-de-pago")
public class MedioDePagoController {
	
	@Autowired
	private IMedioDePago service;
	
	@GetMapping
	public List<MedioDePago> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<MedioDePago> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public MedioDePago save(@RequestBody MedioDePago medioDePago) {
		return service.save(medioDePago);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public MedioDePago update(@PathVariable Long id, @RequestBody MedioDePago medioDePago) {
		Optional<MedioDePago> op = service.findById(id);
		
		if (!op.isEmpty()) {
			MedioDePago medioDePagoUpdate = op.get();
					
			medioDePagoUpdate.setDescripcion(medioDePago.getDescripcion());
			medioDePagoUpdate.setEstado(medioDePagoUpdate.getEstado());
			
			
			return service.save(medioDePagoUpdate);
		}
		
		return medioDePago;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

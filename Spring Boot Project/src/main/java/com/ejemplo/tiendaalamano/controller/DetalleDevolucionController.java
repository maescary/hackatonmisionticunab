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

import com.ejemplo.tiendaalamano.service.IDetalleDevolucion;
import com.ejemplo.tiendaalamano.model.DetalleDevolucion;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/detalle_devoluciones")
public class DetalleDevolucionController {
	
	@Autowired
	private IDetalleDevolucion service;
	
	@GetMapping
	public List<DetalleDevolucion> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<DetalleDevolucion> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public DetalleDevolucion save(@RequestBody DetalleDevolucion detalle) {
		return service.save(detalle);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public DetalleDevolucion update(@PathVariable Long id, @RequestBody DetalleDevolucion detalle) {
		Optional<DetalleDevolucion> op = service.findById(id);
		
		if (!op.isEmpty()) {
			DetalleDevolucion detalleUpdate = op.get();
					
			detalleUpdate.setSubtotal(detalle.getSubtotal());
			
			
			
			return service.save(detalleUpdate);
		}
		
		return detalle;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

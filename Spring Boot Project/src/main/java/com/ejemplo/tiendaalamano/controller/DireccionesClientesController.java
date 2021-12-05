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

import com.ejemplo.tiendaalamano.service.IDireccionesClientes;
import com.ejemplo.tiendaalamano.model.DireccionesClientes;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/direcciones")
public class DireccionesClientesController {
	
	@Autowired
	private IDireccionesClientes service;
	
	@GetMapping
	public List<DireccionesClientes> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<DireccionesClientes> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public DireccionesClientes save(@RequestBody DireccionesClientes direccion) {
		return service.save(direccion);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public DireccionesClientes update(@PathVariable Long id, @RequestBody DireccionesClientes direccion) {
		Optional<DireccionesClientes> op = service.findById(id);
		
		if (!op.isEmpty()) {
			DireccionesClientes direccionUpdate = op.get();
					
			direccionUpdate.setDireccion(direccion.getDireccion());
			
			
			
			return service.save(direccionUpdate);
		}
		
		return direccion;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

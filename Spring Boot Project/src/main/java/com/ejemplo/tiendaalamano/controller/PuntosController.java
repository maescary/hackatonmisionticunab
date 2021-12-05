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

import com.ejemplo.tiendaalamano.service.IPuntos;
import com.ejemplo.tiendaalamano.model.Puntos;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/puntos")
public class PuntosController {
	
	@Autowired
	private IPuntos service;
	
	@GetMapping
	public List<Puntos> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Puntos> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Puntos save(@RequestBody Puntos puntos) {
		return service.save(puntos);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Puntos update(@PathVariable Long id, @RequestBody Puntos puntos) {
		Optional<Puntos> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Puntos puntosUpdate = op.get();
			puntosUpdate.setCantidadPuntos(puntos.getCantidadPuntos());
			puntosUpdate.setEstado_plan(puntos.getEstado_plan());
			puntosUpdate.setMontoRedimido(puntos.getMontoRedimido());
			
			
			
			return service.save(puntosUpdate);
		}
		
		return puntos;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

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

import com.ejemplo.tiendaalamano.service.IDetallePuntos;
import com.ejemplo.tiendaalamano.model.DetallePuntos;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/detalle-puntos")
public class DetallePuntosController {
	
	@Autowired
	private IDetallePuntos service;
	
	@GetMapping
	public List<DetallePuntos> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<DetallePuntos> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public DetallePuntos save(@RequestBody DetallePuntos detalle) {
		return service.save(detalle);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public DetallePuntos update(@PathVariable Long id, @RequestBody DetallePuntos detalle) {
		Optional<DetallePuntos> op = service.findById(id);
		
		if (!op.isEmpty()) {
			DetallePuntos detalleUpdate = op.get();
					
			detalleUpdate.setCantidadPuntosAcumulados(detalle.getCantidadPuntosAcumulados());
			
			
			
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

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

import com.ejemplo.tiendaalamano.service.ITipoEntrega;
import com.ejemplo.tiendaalamano.model.TipoEntrega;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Tipos-de-entregas")
public class TipoEntregaController {
	
	@Autowired
	private ITipoEntrega service;
	
	@GetMapping
	public List<TipoEntrega> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<TipoEntrega> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public TipoEntrega save(@RequestBody TipoEntrega tipoEntrega) {
		return service.save(tipoEntrega);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TipoEntrega update(@PathVariable Long id, @RequestBody TipoEntrega tipoEntrega) {
		Optional<TipoEntrega> op = service.findById(id);
		
		if (!op.isEmpty()) {
			TipoEntrega tipoEntregaUpdate = op.get();
					
			tipoEntregaUpdate.setDescripcion(tipoEntrega.getDescripcion());
			tipoEntregaUpdate.setEstado(tipoEntrega.getEstado());
			tipoEntregaUpdate.setTarifa(tipoEntrega.getTarifa());
			tipoEntregaUpdate.setTiempo(tipoEntrega.getTiempo());
			
			
			
			
			return service.save(tipoEntregaUpdate);
		}
		
		return tipoEntrega;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

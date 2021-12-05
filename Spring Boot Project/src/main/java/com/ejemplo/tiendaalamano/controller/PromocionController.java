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

import com.ejemplo.tiendaalamano.service.IPromocion;
import com.ejemplo.tiendaalamano.model.Promocion;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/promociones")
public class PromocionController {
	
	@Autowired
	private IPromocion service;
	
	@GetMapping
	public List<Promocion> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Promocion> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Promocion save(@RequestBody Promocion promocion) {
		return service.save(promocion);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Promocion update(@PathVariable Long id, @RequestBody Promocion promocion) {
		Optional<Promocion> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Promocion promocionUpdate = op.get();
					
			promocionUpdate.setEstado(promocion.getEstado());
			promocionUpdate.setIdProducto(promocion.getIdProducto());
			promocionUpdate.setProcentajeDescuento(promocion.getProcentajeDescuento());
			
			
			return service.save(promocionUpdate);
		}
		
		return promocion;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

package com.ejemplo.tiendaalamano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.service.IPuntoDeVenta;

import com.ejemplo.tiendaalamano.model.PuntoDeVenta;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/puntos-de-venta")
public class PuntoDeVentaController {
	
	@Autowired
	private IPuntoDeVenta service;
	
	@GetMapping
	public List<PuntoDeVenta> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<PuntoDeVenta> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@ResponseStatus(code = HttpStatus.CREATED, reason ="Punto de venta creado correctamente" )
	@RequestMapping(method =  RequestMethod.POST, consumes="application/JSON")
	public void save(@RequestBody PuntoDeVenta puntoDeVenta) {
		 service.save(puntoDeVenta);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public PuntoDeVenta update(@PathVariable Long id, @RequestBody PuntoDeVenta puntoDeVenta) {
		Optional<PuntoDeVenta> op = service.findById(id);
		
		if (!op.isEmpty()) {
			PuntoDeVenta puntoDeventaUpdate = op.get();
					
			
			puntoDeventaUpdate.setCoordenadas(puntoDeVenta.getCoordenadas());
			puntoDeventaUpdate.setEstado(puntoDeVenta.getEstado());
			
			
			return service.save(puntoDeventaUpdate);
		}
		
		return puntoDeVenta;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

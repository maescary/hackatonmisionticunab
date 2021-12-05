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

import com.ejemplo.tiendaalamano.service.IMensajePromocion;
import com.ejemplo.tiendaalamano.model.MensajePromocion;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/mensajes-promociones")
public class MensajePromocionController {
	
	@Autowired
	private IMensajePromocion service;
	
	@GetMapping
	public List<MensajePromocion> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<MensajePromocion> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public MensajePromocion save(@RequestBody MensajePromocion mensaje) {
		return service.save(mensaje);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public MensajePromocion update(@PathVariable Long id, @RequestBody MensajePromocion mensaje) {
		Optional<MensajePromocion> op = service.findById(id);
		
		if (!op.isEmpty()) {
			MensajePromocion mensajeUpdate = op.get();
					
			mensajeUpdate.setEncabezado(mensaje.getEncabezado());
			mensajeUpdate.setId_cliente(mensaje.getId_cliente());
			mensajeUpdate.setIdPromocion(mensaje.getIdPromocion());
			mensajeUpdate.setMensaje(mensaje.getMensaje());
			
			
			
			return service.save(mensajeUpdate);
		}
		
		return mensaje;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

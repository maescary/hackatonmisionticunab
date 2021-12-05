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

import com.ejemplo.tiendaalamano.service.IMensajeDomicilio;
import com.ejemplo.tiendaalamano.model.MensajeDomicilio;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/mensajes-domicilios")
public class MensajeDomicilioController {
	
	@Autowired
	private IMensajeDomicilio service;
	
	@GetMapping
	public List<MensajeDomicilio> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<MensajeDomicilio> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public MensajeDomicilio save(@RequestBody MensajeDomicilio mensaje) {
		return service.save(mensaje);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public MensajeDomicilio update(@PathVariable Long id, @RequestBody MensajeDomicilio mensaje) {
		Optional<MensajeDomicilio> op = service.findById(id);
		
		if (!op.isEmpty()) {
			MensajeDomicilio mensajeUpdate = op.get();
					
			mensajeUpdate.setMensaje(mensaje.getMensaje());
			mensajeUpdate.setIdUsuario(mensaje.getIdUsuario());
			mensajeUpdate.setIdDomicilio(mensaje.getIdDomicilio());
			
			
			
			
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

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

import com.ejemplo.tiendaalamano.service.IMensajePedido;
import com.ejemplo.tiendaalamano.model.MensajePedido;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/mensajes-pedidos")
public class MensajePedidoController {
	
	@Autowired
	private IMensajePedido service;
	
	@GetMapping
	public List<MensajePedido> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<MensajePedido> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public MensajePedido save(@RequestBody MensajePedido mensaje) {
		return service.save(mensaje);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public MensajePedido update(@PathVariable Long id, @RequestBody MensajePedido mensaje) {
		Optional<MensajePedido> op = service.findById(id);
		
		if (!op.isEmpty()) {
			MensajePedido mensajeUpdate = op.get();
					
			mensajeUpdate.setIdPedido(mensaje.getIdPedido());
			mensajeUpdate.setIdUsuario(mensaje.getIdUsuario());
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

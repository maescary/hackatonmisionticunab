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

import com.ejemplo.tiendaalamano.service.IEstadoPedido;
import com.ejemplo.tiendaalamano.model.EstadoPedido;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/estados-pedidos")
public class EstadoPedidoController {
	
	@Autowired
	private IEstadoPedido service;
	
	@GetMapping
	public List<EstadoPedido> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<EstadoPedido> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public EstadoPedido save(@RequestBody EstadoPedido estado) {
		return service.save(estado);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public EstadoPedido update(@PathVariable Long id, @RequestBody EstadoPedido estado) {
		Optional<EstadoPedido> op = service.findById(id);
		
		if (!op.isEmpty()) {
			EstadoPedido estadoaUpdate = op.get();
					
			estadoaUpdate.setDescripcion(estado.getDescripcion());
			
			
			
			return service.save(estadoaUpdate);
		}
		
		return estado;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

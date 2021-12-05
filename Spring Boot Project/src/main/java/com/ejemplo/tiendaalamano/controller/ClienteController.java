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

import com.ejemplo.tiendaalamano.service.ICliente;
import com.ejemplo.tiendaalamano.model.Cliente;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/clientes")
public class ClienteController {
	
	@Autowired
	private ICliente service;
	
	@GetMapping
	public List<Cliente> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Cliente> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Cliente save(@RequestBody Cliente cliente) {
		return service.save(cliente);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente) {
		Optional<Cliente> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Cliente clienteUpdate = op.get();
					
			clienteUpdate.setNombre(cliente.getNombre());
			
			
			
			return service.save(clienteUpdate);
		}
		
		return cliente;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

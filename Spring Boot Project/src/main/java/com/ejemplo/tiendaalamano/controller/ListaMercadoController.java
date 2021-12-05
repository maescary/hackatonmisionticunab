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

import com.ejemplo.tiendaalamano.service.IListaMercado;
import com.ejemplo.tiendaalamano.model.ListaMercado;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/listas-mercado")
public class ListaMercadoController {
	
	@Autowired
	private IListaMercado service;
	
	@GetMapping
	public List<ListaMercado> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<ListaMercado> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ListaMercado save(@RequestBody ListaMercado listaMercado) {
		return service.save(listaMercado);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ListaMercado update(@PathVariable Long id, @RequestBody ListaMercado listaMercado) {
		Optional<ListaMercado> op = service.findById(id);
		
		if (!op.isEmpty()) {
			ListaMercado listaMercadoUpdate = op.get();
					
			listaMercadoUpdate.setFechaCreacion(listaMercado.getFechaCreacion());
			
			
			
			return service.save(listaMercadoUpdate);
		}
		
		return listaMercado;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

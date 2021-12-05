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

import com.ejemplo.tiendaalamano.service.IRecaudo;
import com.ejemplo.tiendaalamano.model.Recaudo;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/recaudos")
public class RecaudoController {
	
	@Autowired
	private IRecaudo service;
	
	@GetMapping
	public List<Recaudo> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Recaudo> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Recaudo save(@RequestBody Recaudo recaudo) {
		return service.save(recaudo);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Recaudo update(@PathVariable Long id, @RequestBody Recaudo recaudo) {
		Optional<Recaudo> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Recaudo recaudoUpdate = op.get();
					
			recaudoUpdate.setFechaRecaudo(recaudo.getFechaRecaudo());
			recaudoUpdate.setIdMedioPago(recaudo.getIdMedioPago());
			recaudoUpdate.setMonto(recaudo.getMonto());
			recaudoUpdate.setIdPedido(recaudo.getIdPedido());
			
			
			
			return service.save(recaudoUpdate);
		}
		
		return recaudo;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

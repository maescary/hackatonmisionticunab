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

import com.ejemplo.tiendaalamano.service.IFeedBackPedido;
import com.ejemplo.tiendaalamano.model.FeedBackPedido;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/feedback-pedidos")
public class FeedBackPedidoController {
	
	@Autowired
	private IFeedBackPedido service;
	
	@GetMapping
	public List<FeedBackPedido> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<FeedBackPedido> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public FeedBackPedido save(@RequestBody FeedBackPedido feedBack) {
		return service.save(feedBack);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public FeedBackPedido update(@PathVariable Long id, @RequestBody FeedBackPedido feedBack) {
		Optional<FeedBackPedido> op = service.findById(id);
		
		if (!op.isEmpty()) {
			FeedBackPedido feedBackUpdate = op.get();
					
			feedBackUpdate.setObservacion(feedBack.getObservacion());
			
			
			
			return service.save(feedBackUpdate);
		}
		
		return feedBack;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

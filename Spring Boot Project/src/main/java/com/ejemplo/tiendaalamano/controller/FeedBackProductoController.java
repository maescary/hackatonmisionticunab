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

import com.ejemplo.tiendaalamano.service.IFeedBackProducto;
import com.ejemplo.tiendaalamano.model.FeedBackProducto;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/feedBack-productos")
public class FeedBackProductoController {
	
	@Autowired
	private IFeedBackProducto service;
	
	@GetMapping
	public List<FeedBackProducto> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<FeedBackProducto> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public FeedBackProducto save(@RequestBody FeedBackProducto feedBackProducto) {
		return service.save(feedBackProducto);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public FeedBackProducto update(@PathVariable Long id, @RequestBody FeedBackProducto feedBackProducto) {
		Optional<FeedBackProducto> op = service.findById(id);
		
		if (!op.isEmpty()) {
			FeedBackProducto feedBackProductoUpdate = op.get();
					
			feedBackProductoUpdate.setObservacion(feedBackProducto.getObservacion());
			
			
			
			return service.save(feedBackProducto);
		}
		
		return feedBackProducto;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

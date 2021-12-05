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

import com.ejemplo.tiendaalamano.service.IDetallePedido;
import com.ejemplo.tiendaalamano.model.DetallePedido;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/detalle_pedidos")
public class DetallePedidoController {
	
	@Autowired
	private IDetallePedido service;
	
	@GetMapping
	public List<DetallePedido> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<DetallePedido> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public DetallePedido save(@RequestBody DetallePedido detalle) {
		return service.save(detalle);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public DetallePedido update(@PathVariable Long id, @RequestBody DetallePedido detalle) {
		Optional<DetallePedido> op = service.findById(id);
		
		if (!op.isEmpty()) {
			DetallePedido detalleUpdate = op.get();
					
			detalleUpdate.setCantidad(detalle.getCantidad());
			
			
			return service.save(detalleUpdate);
		}
		
		return detalle;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

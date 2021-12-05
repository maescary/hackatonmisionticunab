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

import com.ejemplo.tiendaalamano.service.IPedido;
import com.ejemplo.tiendaalamano.model.Pedido;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Pedidos")
public class PedidoController {
	
	@Autowired
	private IPedido service;
	
	@GetMapping
	public List<Pedido> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Pedido> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Pedido save(@RequestBody Pedido pedido) {
		return service.save(pedido);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Pedido update(@PathVariable Long id, @RequestBody Pedido pedido) {
		Optional<Pedido> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Pedido pedidoUpdate = op.get();
					
			pedidoUpdate.setEstadoPedido(pedido.getEstadoPedido());
			pedidoUpdate.setIdUsuario(pedido.getIdUsuario());
			pedidoUpdate.setPuntoVenta(pedido.getPuntoVenta());
			pedidoUpdate.setTarifaDomicilio(pedido.getTarifaDomicilio());
			pedidoUpdate.setTipoEntrega(pedido.getTipoEntrega());
			
			
			
			
			return service.save(pedidoUpdate);
		}
		
		return pedido;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

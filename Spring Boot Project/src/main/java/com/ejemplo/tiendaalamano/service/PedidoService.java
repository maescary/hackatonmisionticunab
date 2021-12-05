package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Pedido;
import com.ejemplo.tiendaalamano.repository.PedidoRepository;

@Service
public class PedidoService implements IPedido {
	
	@Autowired
	private PedidoRepository repositorio;

	@Override
	public List<Pedido> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Pedido> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Pedido save(Pedido pedido) {
	
		return repositorio.save(pedido);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

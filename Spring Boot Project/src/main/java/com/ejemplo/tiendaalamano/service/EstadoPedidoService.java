package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model. EstadoPedido;
import com.ejemplo.tiendaalamano.repository. EstadoPedidoRepository;

@Service
public class EstadoPedidoService implements IEstadoPedido {
	
	@Autowired
	private  EstadoPedidoRepository repositorio;

	@Override
	public List< EstadoPedido> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional< EstadoPedido> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public  EstadoPedido save( EstadoPedido estadoPedido) {
	
		return repositorio.save(estadoPedido);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

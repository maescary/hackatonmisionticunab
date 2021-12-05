package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model. FeedBackPedido;
import com.ejemplo.tiendaalamano.repository. FeedBackPedidoRepository;

@Service
public class FeedBackPedidoService implements IFeedBackPedido {
	
	@Autowired
	private  FeedBackPedidoRepository repositorio;

	@Override
	public List< FeedBackPedido> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional< FeedBackPedido> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public  FeedBackPedido save( FeedBackPedido feedback) {
	
		return repositorio.save(feedback);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

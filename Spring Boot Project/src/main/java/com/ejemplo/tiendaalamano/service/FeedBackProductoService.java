package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.FeedBackProducto;
import com.ejemplo.tiendaalamano.repository.FeedBackProductoRepository;

@Service
public class FeedBackProductoService implements IFeedBackProducto {
	
	@Autowired
	private FeedBackProductoRepository repositorio;

	@Override
	public List<FeedBackProducto> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<FeedBackProducto> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public FeedBackProducto save(FeedBackProducto feedback) {
	
		return repositorio.save(feedback);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

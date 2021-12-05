package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.FeedBackPedido;

public interface IFeedBackPedido {

	
	public List<FeedBackPedido> findAll();
	public Optional<FeedBackPedido> findById(Long id);
	public FeedBackPedido save(FeedBackPedido feedback);
	public void deleteById(Long id);
}

package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.FeedBackProducto;

public interface IFeedBackProducto {

	public List<FeedBackProducto> findAll();
	public Optional<FeedBackProducto> findById(Long id);
	public FeedBackProducto save(FeedBackProducto feedback);
	public void deleteById(Long id);
}

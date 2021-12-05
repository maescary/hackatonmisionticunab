package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.DetallePuntos;

public interface IDetallePuntos {

	
	public List<DetallePuntos> findAll();
	public Optional<DetallePuntos> findById(Long id);
	public DetallePuntos save(DetallePuntos detalle);
	public void deleteById(Long id);
}

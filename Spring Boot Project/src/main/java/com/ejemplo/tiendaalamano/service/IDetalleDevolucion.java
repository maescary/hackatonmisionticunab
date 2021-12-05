package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.DetalleDevolucion;

public interface IDetalleDevolucion {

	
	public List<DetalleDevolucion> findAll();
	public Optional<DetalleDevolucion> findById(Long id);
	public DetalleDevolucion save(DetalleDevolucion detalle);
	public void deleteById(Long id);
}

package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.PuntoDeVenta;

public interface IPuntoDeVenta {

	
	public List<PuntoDeVenta> findAll();
	public Optional<PuntoDeVenta> findById(Long id);
	public PuntoDeVenta save(PuntoDeVenta puntoVenta);
	public void deleteById(Long id);
}

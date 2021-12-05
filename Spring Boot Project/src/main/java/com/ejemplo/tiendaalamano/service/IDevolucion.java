package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Devolucion;

public interface IDevolucion {

	public List<Devolucion> findAll();
	public Optional<Devolucion> findById(Long id);
	public Devolucion save(Devolucion devolucion);
	public void deleteById(Long id);
}

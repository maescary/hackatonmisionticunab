package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.DireccionesClientes;

public interface IDireccionesClientes {

	public List<DireccionesClientes> findAll();
	public Optional<DireccionesClientes> findById(Long id);
	public DireccionesClientes save(DireccionesClientes direccion);
	public void deleteById(Long id);
}

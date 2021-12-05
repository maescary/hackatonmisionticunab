package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.TipoEntrega;

public interface ITipoEntrega {

	public List<TipoEntrega> findAll();
	public Optional<TipoEntrega> findById(Long id);
	public TipoEntrega save(TipoEntrega tipoEntrega);
	public void deleteById(Long id);
}

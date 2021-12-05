package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Marca;

public interface IMarca {

	public List<Marca> findAll();
	public Optional<Marca> findById(Long id);
	public Marca save(Marca marca);
	public void deleteById(Long id);
}

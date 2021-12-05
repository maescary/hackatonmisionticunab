package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Domicilio;

public interface IDomicilio {

	public List<Domicilio> findAll();
	public Optional<Domicilio> findById(Long id);
	public Domicilio save(Domicilio domicilio);
	public void deleteById(Long id);
}

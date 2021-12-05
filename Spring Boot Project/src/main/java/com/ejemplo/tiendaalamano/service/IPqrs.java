package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Pqrs;

public interface IPqrs {

	public List<Pqrs> findAll();
	public Optional<Pqrs> findById(Long id);
	public Pqrs save(Pqrs pqrs);
	public void deleteById(Long id);
}

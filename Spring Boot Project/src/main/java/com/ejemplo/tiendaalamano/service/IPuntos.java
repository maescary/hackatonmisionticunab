package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Puntos;

public interface IPuntos {

	public List<Puntos> findAll();
	public Optional<Puntos> findById(Long id);
	public Puntos save(Puntos puntos);
	public void deleteById(Long id);
}

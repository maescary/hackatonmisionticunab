package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Cupon;

public interface ICupon {

	public List<Cupon> findAll();
	public Optional<Cupon> findById(Long id);
	public Cupon save(Cupon cupon);
	public void deleteById(Long id);
}

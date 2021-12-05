package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Promocion;

public interface IPromocion {

	public List<Promocion> findAll();
	public Optional<Promocion> findById(Long id);
	public Promocion save(Promocion promocion);
	public void deleteById(Long id);
	
}

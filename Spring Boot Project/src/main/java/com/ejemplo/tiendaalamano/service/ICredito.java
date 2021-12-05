package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Credito;

public interface ICredito {

	public List<Credito> findAll();
	public Optional<Credito> findById(Long id);
	public Credito save(Credito credito);
	public void deleteById(Long id);
	
}

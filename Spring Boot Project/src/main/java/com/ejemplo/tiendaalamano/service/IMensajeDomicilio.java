package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.MensajeDomicilio;

public interface IMensajeDomicilio {

	public List<MensajeDomicilio> findAll();
	public Optional<MensajeDomicilio> findById(Long id);
	public MensajeDomicilio save(MensajeDomicilio mensaje);
	public void deleteById(Long id);
}

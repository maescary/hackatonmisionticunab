package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.MedioDePago;

public interface IMedioDePago {
	
	public List<MedioDePago> findAll();
	public Optional<MedioDePago> findById(Long id);
	public MedioDePago save(MedioDePago medioDePago);
	public void deleteById(Long id);

}

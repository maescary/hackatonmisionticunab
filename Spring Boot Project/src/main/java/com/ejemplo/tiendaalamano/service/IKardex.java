package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Kardex;

public interface IKardex {

	public List<Kardex> findAll();
	public Optional<Kardex> findById(Long id);
	public Kardex save(Kardex kardex);
	public void deleteById(Long id);
}

package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Recaudo;

public interface IRecaudo {

	public List<Recaudo> findAll();
	public Optional<Recaudo> findById(Long id);
	public Recaudo save(Recaudo recaudo);
	public void deleteById(Long id);
}

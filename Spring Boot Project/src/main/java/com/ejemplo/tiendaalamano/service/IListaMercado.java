package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.ListaMercado;

public interface IListaMercado {

	public List<ListaMercado> findAll();
	public Optional<ListaMercado> findById(Long id);
	public ListaMercado save(ListaMercado lista);
	public void deleteById(Long id);
}

package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.EstadoPedido;

public interface IEstadoPedido {

	public List<EstadoPedido> findAll();
	public Optional<EstadoPedido> findById(Long id);
	public EstadoPedido save(EstadoPedido estado);
	public void deleteById(Long id);
}

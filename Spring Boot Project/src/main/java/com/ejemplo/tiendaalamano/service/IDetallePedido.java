package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.DetallePedido;

public interface IDetallePedido {

	public List<DetallePedido> findAll();
	public Optional<DetallePedido> findById(Long id);
	public DetallePedido save(DetallePedido detalle);
	public void deleteById(Long id);
}

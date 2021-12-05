package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Pedido ;

public interface IPedido {
	
	public List<Pedido > findAll();
	public Optional<Pedido > findById(Long id);
	public Pedido save(Pedido  pedido);
	public void deleteById(Long id);

}

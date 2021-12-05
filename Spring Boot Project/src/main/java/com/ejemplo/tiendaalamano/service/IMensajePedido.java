package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.MensajePedido;

public interface IMensajePedido  {
	
	public List<MensajePedido> findAll();
	public Optional<MensajePedido> findById(Long id);
	public MensajePedido save(MensajePedido mensaje);
	public void deleteById(Long id);

}

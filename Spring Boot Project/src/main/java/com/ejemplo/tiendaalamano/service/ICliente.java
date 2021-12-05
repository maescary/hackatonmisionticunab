package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Cliente;



public interface ICliente {
	
	public List<Cliente> findAll();
	public Optional<Cliente> findById(Long id);
	public Cliente save(Cliente cliente);
	public void deleteById(Long id);

}

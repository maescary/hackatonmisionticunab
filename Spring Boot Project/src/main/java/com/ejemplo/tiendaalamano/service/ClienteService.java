package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Cliente;
import com.ejemplo.tiendaalamano.repository.ClienteRepository;

@Service
public class ClienteService implements ICliente {
	
	@Autowired
	private ClienteRepository repositorio;

	@Override
	public List<Cliente> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Cliente save(Cliente cliente) {
	
		return repositorio.save(cliente);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}
package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.DireccionesClientes;
import com.ejemplo.tiendaalamano.repository.DireccionesClientesRepository;

@Service
public class DireccionesClientesService implements IDireccionesClientes {
	
	@Autowired
	private DireccionesClientesRepository repositorio;

	@Override
	public List<DireccionesClientes> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<DireccionesClientes> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public DireccionesClientes save(DireccionesClientes direccion) {
	
		return repositorio.save(direccion);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}
package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Devolucion;
import com.ejemplo.tiendaalamano.repository.DevolucionRepository;

@Service
public class DevolucionService implements IDevolucion {
	
	@Autowired
	private DevolucionRepository repositorio;

	@Override
	public List<Devolucion> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Devolucion> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Devolucion save(Devolucion devolucion) {
	
		return repositorio.save(devolucion);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}
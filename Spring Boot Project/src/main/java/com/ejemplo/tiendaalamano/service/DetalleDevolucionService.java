package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.DetalleDevolucion;
import com.ejemplo.tiendaalamano.repository.DetalleDevolucionRepository;

@Service
public class DetalleDevolucionService implements IDetalleDevolucion{
	
	@Autowired
	private DetalleDevolucionRepository repositorio;

	@Override
	public List<DetalleDevolucion> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<DetalleDevolucion> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public DetalleDevolucion save(DetalleDevolucion detalle) {
	
		return repositorio.save(detalle);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}
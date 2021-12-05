package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.DetallePuntos;
import com.ejemplo.tiendaalamano.repository.DetallePuntosRepository;

@Service
public class DetallePuntosService implements IDetallePuntos {
	
	@Autowired
	private DetallePuntosRepository repositorio;

	@Override
	public List<DetallePuntos> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<DetallePuntos> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public DetallePuntos save(DetallePuntos detalle) {
	
		return repositorio.save(detalle);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}
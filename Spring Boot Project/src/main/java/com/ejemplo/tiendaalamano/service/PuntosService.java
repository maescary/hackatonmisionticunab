package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Puntos;
import com.ejemplo.tiendaalamano.repository.PuntosRepository;

@Service
public class PuntosService implements IPuntos {
	
	@Autowired
	private PuntosRepository repositorio;

	@Override
	public List<Puntos> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Puntos> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Puntos save(Puntos puntos) {
	
		return repositorio.save(puntos);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

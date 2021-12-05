package com.ejemplo.tiendaalamano.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Domicilio;
import com.ejemplo.tiendaalamano.repository.DomicilioRepository;

@Service
public class DomicilioService implements IDomicilio {
	
	@Autowired
	private DomicilioRepository repositorio;

	@Override
	public List<Domicilio> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Domicilio> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Domicilio save(Domicilio domicilio) {
	
		return repositorio.save(domicilio);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}
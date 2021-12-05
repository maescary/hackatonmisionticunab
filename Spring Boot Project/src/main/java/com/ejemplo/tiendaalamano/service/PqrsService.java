package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Pqrs;
import com.ejemplo.tiendaalamano.repository.PqrsRepository;

@Service
public class PqrsService implements IPqrs {
	
	@Autowired
	private PqrsRepository repositorio;

	@Override
	public List<Pqrs> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Pqrs> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Pqrs save(Pqrs pqrs) {
	
		return repositorio.save(pqrs);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

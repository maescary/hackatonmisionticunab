package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Marca;
import com.ejemplo.tiendaalamano.repository.MarcaRepository;

@Service
public class MarcaService implements IMarca {
	
	@Autowired
	private MarcaRepository repositorio;

	@Override
	public List<Marca> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Marca> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Marca save(Marca marca) {
	
		return repositorio.save(marca);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

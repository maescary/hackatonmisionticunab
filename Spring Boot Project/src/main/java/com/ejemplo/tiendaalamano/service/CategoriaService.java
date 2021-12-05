package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Categoria;
import com.ejemplo.tiendaalamano.repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoria {
	
	@Autowired
	private CategoriaRepository repositorio;

	@Override
	public List<Categoria> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Categoria> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Categoria save(Categoria categoria) {
	
		return repositorio.save(categoria);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

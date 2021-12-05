package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Kardex;
import com.ejemplo.tiendaalamano.repository.KardexRepository;

@Service
public class KardexService implements IKardex {
	
	@Autowired
	private KardexRepository repositorio;

	@Override
	public List<Kardex> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Kardex> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Kardex save(Kardex kardex) {
	
		return repositorio.save(kardex);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

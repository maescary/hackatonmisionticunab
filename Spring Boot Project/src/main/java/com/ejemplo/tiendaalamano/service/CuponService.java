package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Cupon;
import com.ejemplo.tiendaalamano.repository.CuponRepository;

@Service
public class CuponService implements ICupon {
	
	@Autowired
	private CuponRepository repositorio;

	@Override
	public List<Cupon> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Cupon> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Cupon save(Cupon cupon) {
	
		return repositorio.save(cupon);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}
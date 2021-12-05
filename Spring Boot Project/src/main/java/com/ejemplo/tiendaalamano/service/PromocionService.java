package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model. Promocion;
import com.ejemplo.tiendaalamano.repository. PromocionRepository;

@Service
public class PromocionService implements IPromocion {
	
	@Autowired
	private  PromocionRepository repositorio;

	@Override
	public List<Promocion> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Promocion> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Promocion save(Promocion promocion) {
	
		return repositorio.save(promocion);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

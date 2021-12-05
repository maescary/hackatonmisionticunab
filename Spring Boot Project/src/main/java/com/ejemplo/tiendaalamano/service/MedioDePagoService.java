package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.MedioDePago;
import com.ejemplo.tiendaalamano.repository.MedioDePagoRepository;

@Service
public class MedioDePagoService implements IMedioDePago {
	
	@Autowired
	private MedioDePagoRepository repositorio;

	@Override
	public List<MedioDePago> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<MedioDePago> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public MedioDePago save(MedioDePago medioDePago) {
	
		return repositorio.save(medioDePago);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

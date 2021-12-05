package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.MensajeDomicilio;
import com.ejemplo.tiendaalamano.repository.MensajeDomicilioRepository;

@Service
public class MensajeDomicilioService implements IMensajeDomicilio {
	
	@Autowired
	private MensajeDomicilioRepository repositorio;

	@Override
	public List<MensajeDomicilio> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<MensajeDomicilio> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public MensajeDomicilio save(MensajeDomicilio mensaje) {
	
		return repositorio.save(mensaje);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

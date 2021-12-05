package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Credito;
import com.ejemplo.tiendaalamano.repository.CreditoRepository;

@Service
public class CreditoService implements ICredito {
	
	@Autowired
	private CreditoRepository repositorio;

	@Override
	public List<Credito> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Credito> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Credito save(Credito credito) {
	
		return repositorio.save(credito);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}
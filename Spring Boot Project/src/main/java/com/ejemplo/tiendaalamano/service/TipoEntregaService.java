package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.TipoEntrega;
import com.ejemplo.tiendaalamano.repository.TipoEntregaRepository;

@Service
public class TipoEntregaService implements ITipoEntrega {
	
	@Autowired
	private TipoEntregaRepository repositorio;

	@Override
	public List<TipoEntrega> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<TipoEntrega> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public TipoEntrega save(TipoEntrega tipoEntrega) {
	
		return repositorio.save(tipoEntrega);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.MensajePromocion;
import com.ejemplo.tiendaalamano.repository.MensajePromocionRepository;

@Service
public class MensajePromocionService implements IMensajePromocion {
	
	@Autowired
	private MensajePromocionRepository repositorio;

	@Override
	public List<MensajePromocion> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<MensajePromocion> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public MensajePromocion save(MensajePromocion mensaje) {
	
		return repositorio.save(mensaje);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

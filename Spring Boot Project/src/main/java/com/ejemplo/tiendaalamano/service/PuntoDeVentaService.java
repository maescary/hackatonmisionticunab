package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.PuntoDeVenta;
import com.ejemplo.tiendaalamano.repository.PuntoDeVentaRepository;

@Service
public class PuntoDeVentaService implements IPuntoDeVenta {
	
	@Autowired
	private PuntoDeVentaRepository repositorio;

	@Override
	public List<PuntoDeVenta> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<PuntoDeVenta> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public PuntoDeVenta save(PuntoDeVenta puntoDeVenta) {
	
		return repositorio.save(puntoDeVenta);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

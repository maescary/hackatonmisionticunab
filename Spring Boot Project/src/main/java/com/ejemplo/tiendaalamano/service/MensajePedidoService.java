package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.MensajePedido;
import com.ejemplo.tiendaalamano.repository.MensajePedidoRepository;

@Service
public class MensajePedidoService implements IMensajePedido {
	
	@Autowired
	private MensajePedidoRepository repositorio;

	@Override
	public List<MensajePedido> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<MensajePedido> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public MensajePedido save(MensajePedido mensaje) {
	
		return repositorio.save(mensaje);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.DetallePedido;
import com.ejemplo.tiendaalamano.repository.DetallePedidoRepository;

@Service
public class DetallePedidoService implements IDetallePedido {
	
	@Autowired
	private DetallePedidoRepository repositorio;

	@Override
	public List<DetallePedido> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<DetallePedido> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public DetallePedido save(DetallePedido detalle) {
	
		return repositorio.save(detalle);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}
package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.ListaMercado;
import com.ejemplo.tiendaalamano.repository.ListaMercadoRepository;

@Service
public class ListaMercadoService implements IListaMercado {
	
	@Autowired
	private ListaMercadoRepository repositorio;

	@Override
	public List<ListaMercado> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<ListaMercado> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public ListaMercado save(ListaMercado lista) {
	
		return repositorio.save(lista);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

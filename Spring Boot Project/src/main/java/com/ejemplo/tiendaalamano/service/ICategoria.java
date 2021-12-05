

package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Categoria;

public interface ICategoria {
	
	public List<Categoria> findAll();
	public Optional<Categoria> findById(Long id);
	public Categoria save(Categoria categoria);
	public void deleteById(Long id);
	
}

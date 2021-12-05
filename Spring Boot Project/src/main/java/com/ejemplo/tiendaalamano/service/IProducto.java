package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Marca;
import com.ejemplo.tiendaalamano.model.Producto;

public interface IProducto {

	public List<Producto> findAll();
	public Optional<Producto> findById(Long id);
	public Producto save(Producto producto);
	public void deleteById(Long id);
	public List<Producto> findByDescripcion(String descripcion);
	public List<Marca> findByMarca(Marca marca);
	
}

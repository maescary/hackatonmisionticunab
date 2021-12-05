package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Marca;
import com.ejemplo.tiendaalamano.model.Producto;
import com.ejemplo.tiendaalamano.repository.ProductoRepository;

@Service
public class ProductoService implements IProducto {
	
	@Autowired
	private ProductoRepository repositorio;

	@Override
	public List<Producto> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Producto> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Producto save(Producto producto) {
	
		return repositorio.save(producto);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}

	@Override
	public List<Producto> findByDescripcion(String  descripcion) {
		
		return repositorio.findByDescripcion(descripcion);
	}

	@Override
	public List<Marca> findByMarca(Marca marca) {
		
			return repositorio.findByMarca(marca);
	}


	
	
	
	

}

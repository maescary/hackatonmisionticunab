package com.ejemplo.tiendaalamano.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.tiendaalamano.model.Marca;
import com.ejemplo.tiendaalamano.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{

	@Transactional(readOnly=true)
	List<Producto> findByDescripcion(String descripcion);
	
	@Transactional(readOnly=true)
	List<Marca> findByMarca(Marca marca);

	
}

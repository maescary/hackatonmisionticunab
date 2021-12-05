package com.ejemplo.tiendaalamano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.ejemplo.tiendaalamano.model.DetalleDevolucion;

@Repository
public interface DetalleDevolucionRepository extends JpaRepository<DetalleDevolucion, Long>{

	
	
}

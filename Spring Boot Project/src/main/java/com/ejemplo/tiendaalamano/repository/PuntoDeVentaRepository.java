package com.ejemplo.tiendaalamano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.ejemplo.tiendaalamano.model.PuntoDeVenta;

@Repository
public interface PuntoDeVentaRepository extends JpaRepository<PuntoDeVenta, Long>{


	
}

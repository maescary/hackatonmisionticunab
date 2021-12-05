package com.ejemplo.tiendaalamano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.ejemplo.tiendaalamano.model.DireccionesClientes;

@Repository
public interface DireccionesClientesRepository extends JpaRepository<DireccionesClientes, Long>{


	
}

package com.ejemplo.tiendaalamano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.ejemplo.tiendaalamano.model.MensajeDomicilio;

@Repository
public interface MensajeDomicilioRepository extends JpaRepository<MensajeDomicilio, Long>{


	
}

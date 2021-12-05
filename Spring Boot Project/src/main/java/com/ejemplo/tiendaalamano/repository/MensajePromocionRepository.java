package com.ejemplo.tiendaalamano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.ejemplo.tiendaalamano.model.MensajePromocion;

@Repository
public interface MensajePromocionRepository extends JpaRepository<MensajePromocion, Long>{


	
}

package com.ejemplo.tiendaalamano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.ejemplo.tiendaalamano.model.Cupon;

@Repository
public interface CuponRepository extends JpaRepository<Cupon, Long>{

	
}

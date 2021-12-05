package com.ejemplo.tiendaalamano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.ejemplo.tiendaalamano.model.Kardex;

@Repository
public interface KardexRepository extends JpaRepository<Kardex, Long>{


	
}

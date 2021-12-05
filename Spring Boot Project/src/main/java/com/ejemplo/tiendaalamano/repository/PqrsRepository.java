package com.ejemplo.tiendaalamano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.ejemplo.tiendaalamano.model.Pqrs;

@Repository
public interface PqrsRepository extends JpaRepository<Pqrs, Long>{


	
}

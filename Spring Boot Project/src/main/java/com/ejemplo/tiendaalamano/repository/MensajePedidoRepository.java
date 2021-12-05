package com.ejemplo.tiendaalamano.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.ejemplo.tiendaalamano.model.MensajePedido;

@Repository
public interface MensajePedidoRepository extends JpaRepository<MensajePedido, Long>{


	
}

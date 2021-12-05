package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.MensajePromocion;

public interface IMensajePromocion {
	
	public List<MensajePromocion> findAll();
	public Optional<MensajePromocion> findById(Long id);
	public MensajePromocion save(MensajePromocion mensaje);
	public void deleteById(Long id);

}

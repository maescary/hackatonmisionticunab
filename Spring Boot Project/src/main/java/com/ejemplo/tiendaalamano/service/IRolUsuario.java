package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.RolUsuario;

public interface IRolUsuario {

	public List<RolUsuario> findAll();
	public Optional<RolUsuario> findById(Long id);
	public RolUsuario save(RolUsuario rol);
	public void deleteById(Long id);
}

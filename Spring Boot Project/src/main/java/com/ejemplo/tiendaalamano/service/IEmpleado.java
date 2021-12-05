package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.tiendaalamano.model.Empleado;

public interface IEmpleado {

	public List<Empleado> findAll();
	public Optional<Empleado> findById(Long id);
	public Empleado save(Empleado empleado);
	public void deleteById(Long id);
}

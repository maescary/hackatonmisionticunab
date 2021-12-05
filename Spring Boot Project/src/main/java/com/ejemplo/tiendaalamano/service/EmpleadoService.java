package com.ejemplo.tiendaalamano.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.tiendaalamano.model.Empleado;
import com.ejemplo.tiendaalamano.repository.EmpleadoRepository;

@Service
public class EmpleadoService implements IEmpleado {
	
	@Autowired
	private EmpleadoRepository repositorio;

	@Override
	public List<Empleado> findAll() {

		return repositorio.findAll();
	}

	@Override
	public Optional<Empleado> findById(Long id) {
		
		return repositorio.findById(id);
	}

	@Override
	public Empleado save(Empleado empleado) {
	
		return repositorio.save(empleado);
	}

	@Override
	public void deleteById(Long id) {
		
		repositorio.deleteById(id);
		
	}
	
	

}

package com.ejemplo.tiendaalamano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.tiendaalamano.service.IEmpleado;
import com.ejemplo.tiendaalamano.model.Empleado;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/empleados")
public class EmpleadoController {
	
	@Autowired
	private IEmpleado service;
	
	@GetMapping
	public List<Empleado> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Empleado> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Empleado save(@RequestBody Empleado empleado) {
		return service.save(empleado);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Empleado update(@PathVariable Long id, @RequestBody Empleado empleado) {
		Optional<Empleado> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Empleado empleadoUpdate = op.get();
					
			empleadoUpdate.setNombre(empleado.getNombre());
			
			
			
			return service.save(empleadoUpdate);
		}
		
		return empleado;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

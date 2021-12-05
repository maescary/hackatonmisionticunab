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

import com.ejemplo.tiendaalamano.service.IRolUsuario;
import com.ejemplo.tiendaalamano.model.RolUsuario;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/roles")
public class RolUsuarioController {
	
	@Autowired
	private IRolUsuario service;
	
	@GetMapping
	public List<RolUsuario> all() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<RolUsuario> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public RolUsuario save(@RequestBody RolUsuario rol) {
		return service.save(rol);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public RolUsuario update(@PathVariable Long id, @RequestBody RolUsuario rol) {
		Optional<RolUsuario> op = service.findById(id);
		
		if (!op.isEmpty()) {
			RolUsuario rolUpdate = op.get();
					
			rolUpdate.setNombreRol(rol.getNombreRol());			
			
			return service.save(rolUpdate);
		}
		
		return rol;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.deleteById(id);
	}

}

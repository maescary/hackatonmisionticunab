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

import com.ejemplo.tiendaalamano.service.IUsuario;
import com.ejemplo.tiendaalamano.model.Usuario;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {
	

	@Autowired
	private IUsuario service;
	
	@GetMapping
	public List<Usuario> findAll() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Usuario> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuario save(@RequestBody Usuario user) {
		return service.save(user);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Usuario update(@PathVariable Long id, @RequestBody Usuario user) {
		Optional<Usuario> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Usuario userUpdate = op.get();
					
			userUpdate.setUsername(user.getUsername());
			userUpdate.setPassword(user.getPassword());
			userUpdate.setRol(user.getRol());
			userUpdate.setEstado(user.getEstado());
			
			
			return service.save(userUpdate);
		}
		
		return user;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable Long id) {
		service.deleteById(id);
	}
	
	


}

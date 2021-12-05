package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="roles_usuarios")
public class RolUsuario implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;


	/*ATRIBUTOS Y ANOTACIONES*/
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre_rol",length = 25, nullable=false)
	private String nombreRol;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}
	
	
	
	/*METODOS DE ACCESO A ATRIBUTOS GETTERS - SETTERS*/
	
	

}

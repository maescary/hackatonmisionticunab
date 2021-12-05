package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plan_puntos")
public class Puntos implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	 /*ATRIBUTOS Y ANOTACIONES*/
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	
	 @Column(columnDefinition = "boolean default true")
	 private boolean estado_plan;
	
	 @Column(name = "cantidad_puntos", columnDefinition = "integer default 25")
	 private Integer CantidadPuntos;
	
	 @Column(name = "monto_redimido", length =10, nullable = false)
	 private Double MontoRedimido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean getEstado_plan() {
		return estado_plan;
	}

	public void setEstado_plan(boolean estado_plan) {
		this.estado_plan = estado_plan;
	}

	public Integer getCantidadPuntos() {
		return CantidadPuntos;
	}

	public void setCantidadPuntos(Integer cantidadPuntos) {
		CantidadPuntos = cantidadPuntos;
	}

	public Double getMontoRedimido() {
		return MontoRedimido;
	}

	public void setMontoRedimido(Double montoRedimido) {
		MontoRedimido = montoRedimido;
	}
	
		/*METODOS DE ACCESO A ATRIBUTOS GETTERS - SETTERS*/
	 
	 

}

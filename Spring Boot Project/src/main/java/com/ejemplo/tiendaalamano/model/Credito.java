package com.ejemplo.tiendaalamano.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="creditos")
public class Credito implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	/*ATRIBUTOS Y ANOTACIONES*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_cliente", nullable = false)
	 private Cliente id_cliente;
	 
	 
	 @Column(name = "cuotas_diferidas", columnDefinition = "integer default 25")
	 private Integer cuotasDiferidas;
	 
	 @Column(name = "cuotas_pagadas", columnDefinition = "integer default 25")
	 private Integer cuotasPagadas;
	 
	 @Column(name="monto_aprobado", length =15, nullable = false)
	 private Double MontoAprobado;
	 
	 @Column(name="fecha_inicio",length = 30, nullable=false)
	 private String fechaInicio;
	 
	 @Column(name="fecha_fin",length = 30, nullable=false)
	 private String FechaFin;
	 
	 @Column(name="fecha_ultimo_pago",length = 30, nullable=false)
	 private String FechaUltimoPago;
	 
	 
	 @Column(name="monto_disponible", length =15, nullable = false)
	 private Double MontoDisponible;
	 
	 @Column(name="estado",length = 30, nullable=false)
	 private String estado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Cliente id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Integer getCuotasDiferidas() {
		return cuotasDiferidas;
	}

	public void setCuotasDiferidas(Integer cuotasDiferidas) {
		this.cuotasDiferidas = cuotasDiferidas;
	}

	public Integer getCuotasPagadas() {
		return cuotasPagadas;
	}

	public void setCuotasPagadas(Integer cuotasPagadas) {
		this.cuotasPagadas = cuotasPagadas;
	}

	public Double getMontoAprobado() {
		return MontoAprobado;
	}

	public void setMontoAprobado(Double montoAprobado) {
		MontoAprobado = montoAprobado;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return FechaFin;
	}

	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}

	public String getFechaUltimoPago() {
		return FechaUltimoPago;
	}

	public void setFechaUltimoPago(String fechaUltimoPago) {
		FechaUltimoPago = fechaUltimoPago;
	}

	public Double getMontoDisponible() {
		return MontoDisponible;
	}

	public void setMontoDisponible(Double montoDisponible) {
		MontoDisponible = montoDisponible;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	 
	 
	 
	 
	 
}

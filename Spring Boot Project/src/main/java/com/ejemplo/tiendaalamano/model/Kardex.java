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
@Table(name="kardex")
public class Kardex implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	/*ATRIBUTOS Y ANOTACIONES*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="fecha_ingreso",length = 40, nullable=false)
	private String fechaIngreso;
	
	 @Column(name="cantidad_ingresada", length =10)
	 private Double CantidadIngresada;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_usuario", nullable = false)
	 private Usuario idUsuario;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_punto_venta", nullable = false)
	 private PuntoDeVenta PuntoVenta;
	 
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_producto", nullable = false)
	 private Producto idProducto;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public Double getCantidadIngresada() {
		return CantidadIngresada;
	}


	public void setCantidadIngresada(Double cantidadIngresada) {
		CantidadIngresada = cantidadIngresada;
	}


	public Usuario getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}


	public PuntoDeVenta getPuntoVenta() {
		return PuntoVenta;
	}


	public void setPuntoVenta(PuntoDeVenta puntoVenta) {
		PuntoVenta = puntoVenta;
	}


	public Producto getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}
	 
	 
}

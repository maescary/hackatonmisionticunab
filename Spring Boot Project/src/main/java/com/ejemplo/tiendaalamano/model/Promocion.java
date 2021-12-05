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
@Table(name="promociones")
public class Promocion implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	 /*ATRIBUTOS Y ANOTACIONES*/
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_produto", nullable = false)
	 private Producto idProducto;
	 
	
	 @Column(name="porcentaje_descuento", length =10, nullable = false)
	 private Double ProcentajeDescuento;
	 
	 @Column(columnDefinition = "boolean default true")
	 private boolean estado;
	 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Producto getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}

	public Double getProcentajeDescuento() {
		return ProcentajeDescuento;
	}

	public void setProcentajeDescuento(Double procentajeDescuento) {
		ProcentajeDescuento = procentajeDescuento;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
   

}
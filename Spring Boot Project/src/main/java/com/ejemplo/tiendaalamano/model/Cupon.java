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
@Table(name="cupones")
public class Cupon implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	/*ATRIBUTOS Y ANOTACIONES*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @Column(name="porcentaje_descuento", length =5)
	 private Double PorcentajeDescuento;
	 
	 @Column(name = "cantidad_emitida", columnDefinition = "integer default 25")
	 private Integer CantidadEmitida;
	 
	 @Column(columnDefinition = "boolean default true")
	 private boolean estado;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_categoria_producto", nullable = false)
	 private Categoria categoriaProducto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPorcentajeDescuento() {
		return PorcentajeDescuento;
	}

	public void setPorcentajeDescuento(Double porcentajeDescuento) {
		PorcentajeDescuento = porcentajeDescuento;
	}

	public Integer getCantidadEmitida() {
		return CantidadEmitida;
	}

	public void setCantidadEmitida(Integer cantidadEmitida) {
		CantidadEmitida = cantidadEmitida;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Categoria getCategoriaProducto() {
		return categoriaProducto;
	}

	public void setCategoriaProducto(Categoria categoriaProducto) {
		this.categoriaProducto = categoriaProducto;
	}
	 
	 

	 
	 

}

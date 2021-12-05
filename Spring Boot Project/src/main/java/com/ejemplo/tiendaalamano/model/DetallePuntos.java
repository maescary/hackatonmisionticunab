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
@Table(name="detalle_puntos")
public class DetallePuntos implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	/*ATRIBUTOS Y ANOTACIONES*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_cliente", nullable = false)
	 private Cliente id_cliente;
	 
	 @Column(name="fecha_caducidad",length = 10, nullable=false)
	 private String fechaCaducidad;
	 
	 @Column(name = "cantidad_puntos_acumulados", columnDefinition = "integer default 25")
	 private Integer CantidadPuntosAcumulados;

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

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public Integer getCantidadPuntosAcumulados() {
		return CantidadPuntosAcumulados;
	}

	public void setCantidadPuntosAcumulados(Integer cantidadPuntosAcumulados) {
		CantidadPuntosAcumulados = cantidadPuntosAcumulados;
	}
	 
	 
	 

}

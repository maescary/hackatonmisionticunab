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
@Table(name="listas_mercado")
public class ListaMercado implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	/*ATRIBUTOS Y ANOTACIONES*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 15, nullable=false)
	private String fechaCreacion;
	
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_detalle_pedido", nullable = false)
	 private DetallePedido contenido;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_usuario", nullable = false)
	 private Usuario idUsuario;
	 
	 
	 @Column(columnDefinition = "boolean default true")
	 private boolean estado;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public DetallePedido getContenido() {
		return contenido;
	}


	public void setContenido(DetallePedido contenido) {
		this.contenido = contenido;
	}


	public Usuario getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}


	public boolean getEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	 
	 
	 
	
	
}

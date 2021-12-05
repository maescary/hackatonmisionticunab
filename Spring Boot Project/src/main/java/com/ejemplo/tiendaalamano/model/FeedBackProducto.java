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
@Table(name="feedback_productos")
public class FeedBackProducto implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	/*ATRIBUTOS Y ANOTACIONES*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_producto", nullable = false)
	 private Producto idProducto;
	
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_usuario", nullable = false)
	 private Usuario idUsuario;
	 
	 
	 @Column(name = "num_estrellas", columnDefinition = "integer default 2")
	 private Integer numEstrellas;
	 
	 @Column(length = 40, nullable=false)
	 private String observacion;

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

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getNumEstrellas() {
		return numEstrellas;
	}

	public void setNumEstrellas(Integer numEstrellas) {
		this.numEstrellas = numEstrellas;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	 
	 
	 
}

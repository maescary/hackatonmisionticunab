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
@Table(name="mensaje_promocional")
public class MensajePromocion implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	/*ATRIBUTOS Y ANOTACIONES*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_cliente", nullable = false)
	 private Cliente id_cliente;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_promocion", nullable = false)
	 private Promocion idPromocion;
	 
	 
	 @Column(name="mensaje",length = 40, nullable=false)
	 private String mensaje;
	 
	 @Column(name="encabezado",length = 40, nullable=false)
	 private String encabezado;
	 
	 
	


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


	public Promocion getIdPromocion() {
		return idPromocion;
	}


	public void setIdPromocion(Promocion idPromocion) {
		this.idPromocion = idPromocion;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public String getEncabezado() {
		return encabezado;
	}


	public void setEncabezado(String encabezado) {
		this.encabezado = encabezado;
	}


	 
	 
	 
	 
	 
}

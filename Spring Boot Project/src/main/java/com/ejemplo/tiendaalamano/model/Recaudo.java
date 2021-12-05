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
@Table(name="recaudos")
public class Recaudo implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	/*ATRIBUTOS Y ANOTACIONES*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	 
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_pedido", nullable = false)
	 private Pedido idPedido;
	 
	@Column(name="fecha_recaudo", length = 15, nullable=false)
	private String fechaRecaudo;
		
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "id_medio_pago", nullable = false)
	private Pedido idMedioPago;
		
	@Column(name="monto", length =10)
	private Double monto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Pedido idPedido) {
		this.idPedido = idPedido;
	}

	public String getFechaRecaudo() {
		return fechaRecaudo;
	}

	public void setFechaRecaudo(String fechaRecaudo) {
		this.fechaRecaudo = fechaRecaudo;
	}

	public Pedido getIdMedioPago() {
		return idMedioPago;
	}

	public void setIdMedioPago(Pedido idMedioPago) {
		this.idMedioPago = idMedioPago;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	
	
		 
		 
		 
		

}

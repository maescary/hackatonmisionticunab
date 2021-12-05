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
@Table(name="detalle_pedido")
public class DetallePedido implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	 /*ATRIBUTOS Y ANOTACIONES*/
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_pedido", nullable = false)
	 private Pedido idPedido;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_producto", nullable = false)
	 private Producto idProducto;


	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_punto_venta", nullable = false)
	 private PuntoDeVenta PuntoVenta;
	 
	 
	 @Column(name="cantidad", length =10, nullable = false)
	 private Double cantidad;
	 
	 @Column(name="subtotal_impuesto", length =10, nullable = false)
	 private Double subtotalImpuesto;
	 
	 @Column(name="subtotal_descuento", length =10, nullable = false)
	 private Double subtotalDescuento;
	 
	 
	 @Column(name="subtotal", length =10, nullable = false)
	 private Double subtotal;


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


	public Producto getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Producto idProducto) {
		this.idProducto = idProducto;
	}


	public PuntoDeVenta getPuntoVenta() {
		return PuntoVenta;
	}


	public void setPuntoVenta(PuntoDeVenta puntoVenta) {
		PuntoVenta = puntoVenta;
	}


	public Double getCantidad() {
		return cantidad;
	}


	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}


	public Double getSubtotalImpuesto() {
		return subtotalImpuesto;
	}


	public void setSubtotalImpuesto(Double subtotalImpuesto) {
		this.subtotalImpuesto = subtotalImpuesto;
	}


	public Double getSubtotalDescuento() {
		return subtotalDescuento;
	}


	public void setSubtotal_descuento(Double subtotalDescuento) {
		this.subtotalDescuento = subtotalDescuento;
	}


	public Double getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	 
	 
	 
	 
	 
}

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
@Table(name="pedidos")
public class Pedido implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	/*ATRIBUTOS Y ANOTACIONES*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_usuario", nullable = false)
	 private Usuario idUsuario;
	 
	
	 @Column(name="total_impuesto", length =10)
	 private Double totalImpuesto;
	 
	 @Column(name="id_tarifa_domicilio", length =10)
	 private Double tarifaDomicilio;
	 
	 @Column(name="total_descuento", length =10)
	 private Double totalDescuento;
	 
	 @Column(name="total_pago", length =10)
	 private Double totalPago;
	 
	 @Column(name = "total_puntos", columnDefinition = "integer default 25")
	 private Integer totalPuntos;
	 
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_tipo_entrega", nullable = false)
	 private TipoEntrega tipoEntrega;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_punto_venta", nullable = false)
	 private PuntoDeVenta PuntoVenta;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_estado_pedido", nullable = false)
	 private EstadoPedido EstadoPedido;

	public Long getId() {
		return id;
	}

	public EstadoPedido getEstadoPedido() {
		return EstadoPedido;
	}

	public void setEstadoPedido(EstadoPedido estadoPedido) {
		EstadoPedido = estadoPedido;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}

	
	
	public Double getTotalImpuesto() {
		return totalImpuesto;
	}

	public void setTotalImpuesto(Double totalImpuesto) {
		this.totalImpuesto = totalImpuesto;
	}

	public Double getTarifaDomicilio() {
		return tarifaDomicilio;
	}

	public void setTarifaDomicilio(Double tarifaDomicilio) {
		this.tarifaDomicilio = tarifaDomicilio;
	}

	public Double getTotalDescuento() {
		return totalDescuento;
	}

	public void setTotalDescuento(Double totalDescuento) {
		this.totalDescuento = totalDescuento;
	}

	public Double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(Double totalPago) {
		this.totalPago = totalPago;
	}

	public Integer getTotalPuntos() {
		return totalPuntos;
	}

	public void setTotalPuntos(Integer totalPuntos) {
		this.totalPuntos = totalPuntos;
	}

	public TipoEntrega getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(TipoEntrega tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}

	public PuntoDeVenta getPuntoVenta() {
		return PuntoVenta;
	}

	public void setPuntoVenta(PuntoDeVenta puntoVenta) {
		PuntoVenta = puntoVenta;
	}
	 
	 
	 
	 
}

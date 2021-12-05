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
@Table(name="pqrs")
public class Pqrs implements Serializable{
	private static final long serialVersionUID = -5773962493781143007L;

	
	/*ATRIBUTOS Y ANOTACIONES*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_cliente", nullable = false)
	 private Cliente idCliente;
	 
	 @ManyToOne(fetch = FetchType.EAGER, optional = false)
	 @JoinColumn(name = "id_pedido", nullable = false)
	 private Pedido idPedido;
	 
		@Column(name="fecha_solicitud", length = 15, nullable=false)
		private String fechaRegistro;
		
		@Column( length =40, nullable=false)
		private String mensaje;
		
		@Column( length =40, nullable=false)
		private String respuesta;
		
		@Column( length =20, nullable=false)
		private String estado;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Cliente getIdCliente() {
			return idCliente;
		}

		public void setIdCliente(Cliente idCliente) {
			this.idCliente = idCliente;
		}

		public Pedido getIdPedido() {
			return idPedido;
		}

		public void setIdPedido(Pedido idPedido) {
			this.idPedido = idPedido;
		}

		public String getFechaRegistro() {
			return fechaRegistro;
		}

		public void setFechaRegistro(String fechaRegistro) {
			this.fechaRegistro = fechaRegistro;
		}

		public String getMensaje() {
			return mensaje;
		}

		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}

		public String getRespuesta() {
			return respuesta;
		}

		public void setRespuesta(String respuesta) {
			this.respuesta = respuesta;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
		
		
		

}

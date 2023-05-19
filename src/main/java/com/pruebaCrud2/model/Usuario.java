package com.pruebaCrud2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_usuario")
public class Usuario {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	
	@Column
	private String idNUsuario;
	
	@Column
	private String contrasena;
	
	@Column
	private String nombre;
	
	@Column
	private String estado;
	
	@Column
	private String usuarioCreacion;
	
	@Column
	private String fechaCreacion;
	
	@Column
	private String aplicacionCreacion;
	
	@Column
	private String usuarioActualizacion;
	
	@Column
	private String fechaActualizacion;
	
	@Column
	private String aplicacionActualizacion;
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", idNUsuario=" + idNUsuario + ", contrasena=" + contrasena + ", nombre=" + nombre
				+ ", estado=" + estado + ", usuarioCreacion=" + usuarioCreacion + ", fechaCreacion=" + fechaCreacion
				+ ", aplicacionCreacion=" + aplicacionCreacion + ", usuarioActualizacion=" + usuarioActualizacion
				+ ", fechaActualizacion=" + fechaActualizacion + ", aplicacionActualizacion=" + aplicacionActualizacion
				+ "]";
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdNUsuario() {
		return idNUsuario;
	}
	public void setIdNUsuario(String idNUsuario) {
		this.idNUsuario = idNUsuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public String getAplicacionCreacion() {
		return aplicacionCreacion;
	}
	public void setAplicacionCreacion(String aplicacionCreacion) {
		this.aplicacionCreacion = aplicacionCreacion;
	}
	public String getUsuarioActualizacion() {
		return usuarioActualizacion;
	}
	public void setUsuarioActualizacion(String usuarioActualizacion) {
		this.usuarioActualizacion = usuarioActualizacion;
	}
	public String getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(String fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public String getAplicacionActualizacion() {
		return aplicacionActualizacion;
	}
	public void setAplicacionActualizacion(String aplicacionActualizacion) {
		this.aplicacionActualizacion = aplicacionActualizacion;
	}	
	
}

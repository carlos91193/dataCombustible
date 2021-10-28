package com.grupogloria.datacombustible.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="VIEW_MONITOR")
public class Despacho {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="sistema")
	private String sistema;
	
	@Column(name="idTransacion")
	private String idTransacion;
	
	@Column(name="sociedad")
	private String sociedad;
	
	@Column(name="fechaContabilizacion")
	private String fechaContabilizacion;
	
	@Column(name="horaContabilizacion")
    private String horaContabilizacion;
    
	@Column(name="estacionServicio")
    private String estacionServicio;
    
	@Column(name="equipo")
    private String equipo;
    
	@Column(name="valorCombustible")
    private String valorCombustible;
    
	@Column(name="valorHorometro")
    private String valorHorometro;
    
	@Column(name="valorOdometro")
    private String valorOdometro;
    
	@Column(name="texto")
    private String texto;

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	public String getIdTransacion() {
		return idTransacion;
	}

	public void setIdTransacion(String idTransacion) {
		this.idTransacion = idTransacion;
	}

	public String getSociedad() {
		return sociedad;
	}

	public void setSociedad(String sociedad) {
		this.sociedad = sociedad;
	}

	public String getFechaContabilizacion() {
		return fechaContabilizacion;
	}

	public void setFechaContabilizacion(String fechaContabilizacion) {
		this.fechaContabilizacion = fechaContabilizacion;
	}

	public String getHoraContabilizacion() {
		return horaContabilizacion;
	}

	public void setHoraContabilizacion(String horaContabilizacion) {
		this.horaContabilizacion = horaContabilizacion;
	}

	public String getEstacionServicio() {
		return estacionServicio;
	}

	public void setEstacionServicio(String estacionServicio) {
		this.estacionServicio = estacionServicio;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public String getValorCombustible() {
		return valorCombustible;
	}

	public void setValorCombustible(String valorCombustible) {
		this.valorCombustible = valorCombustible;
	}

	public String getValorHorometro() {
		return valorHorometro;
	}

	public void setValorHorometro(String valorHorometro) {
		this.valorHorometro = valorHorometro;
	}

	public String getValorOdometro() {
		return valorOdometro;
	}

	public void setValorOdometro(String valorOdometro) {
		this.valorOdometro = valorOdometro;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
}

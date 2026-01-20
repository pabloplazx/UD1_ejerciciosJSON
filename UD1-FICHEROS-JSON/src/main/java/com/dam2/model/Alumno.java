package com.dam2.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "nombre", "instituto","modulos" })
public class Alumno {
	
	private String nombre;
	
	@JsonProperty(value = "centro")
	private Instituto instituto;
	private List<Modulo> modulos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Instituto getInstituto() {
		return instituto;
	}
	public void setInstituto(Instituto instituto) {
		this.instituto = instituto;
	}
	public List<Modulo> getModulos() {
		return modulos;
	}
	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", instituto=" + instituto + "]";
	}
	
	

}

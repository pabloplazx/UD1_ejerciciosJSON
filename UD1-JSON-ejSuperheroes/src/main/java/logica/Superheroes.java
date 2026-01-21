package logica;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Superheroes {

	private String organizacion;
	private String ciudad;
	private double presupuestoAnual;
	private List<Miembro> miembros = new ArrayList<>();
	
	public Superheroes() {
		super();
	}

	public String getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(String organizacion) {
		this.organizacion = organizacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@JsonProperty("presupuesto_anual")
	public double getPresupuestoAnual() {
		return presupuestoAnual;
	}

	public void setPresupuestoAnual(double presupuestoAnual) {
		this.presupuestoAnual = presupuestoAnual;
	}

	
	public List<Miembro> getMiembros() {
		return miembros;
	}

	public void setMiembros(List<Miembro> miembros) {
		this.miembros = miembros;
	}
	
	
	
	
}

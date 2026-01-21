package logica;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Miembro {

	private String alias;
	private String identidadSecreta;
	private int edad;
	private boolean activo;
	private List<String> poderes = new ArrayList<>();
	private Equipo equipo;
	public Miembro() {
		super();
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	@JsonProperty("identidad_secreta")
	public String getIdentidadSecreta() {
		return identidadSecreta;
	}
	public void setIdentidadSecreta(String identidadSecreta) {
		this.identidadSecreta = identidadSecreta;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public List<String> getPoderes() {
		return poderes;
	}
	public void setPoderes(List<String> poderes) {
		this.poderes = poderes;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	@Override
	public String toString() {
		return "Miembro [alias=" + alias + ", identidadSecreta=" + identidadSecreta + ", edad=" + edad + ", activo="
				+ activo + ", poderes=" + poderes + "]";
	}
	
	
	
	
}

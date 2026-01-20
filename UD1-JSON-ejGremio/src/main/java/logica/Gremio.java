package logica;

import java.util.ArrayList;
import java.util.List;

public class Gremio {
	
	private String nombreGremio;
	private String servidor;
	private int ranking;
	private List<Miembro> miembros = new ArrayList<>();
	
	
	public Gremio() {
		super();
	}


	public String getNombreGremio() {
		return nombreGremio;
	}


	public void setNombreGremio(String nombreGremio) {
		this.nombreGremio = nombreGremio;
	}


	public String getServidor() {
		return servidor;
	}


	public void setServidor(String servidor) {
		this.servidor = servidor;
	}


	public int getRanking() {
		return ranking;
	}


	public void setRanking(int ranking) {
		this.ranking = ranking;
	}


	public List<Miembro> getMiembros() {
		return miembros;
	}


	public void setMiembros(List<Miembro> miembros) {
		this.miembros = miembros;
	}

	
}

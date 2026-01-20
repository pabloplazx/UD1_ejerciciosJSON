package logica;

import java.util.ArrayList;
import java.util.List;

public class Miembro {

	private String alias;
	private int nivel;
	private String clase;
	private boolean esVip;
	private List<String> inventario = new ArrayList<>();
	
	public Miembro() {
		super();
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public boolean isEsVip() {
		return esVip;
	}

	public void setEsVip(boolean esVip) {
		this.esVip = esVip;
	}

	public List<String> getInventario() {
		return inventario;
	}

	public void setInventario(List<String> inventario) {
		this.inventario = inventario;
	}

	@Override
	public String toString() {
		return "Miembro [alias=" + alias + ", nivel=" + nivel + ", clase=" + clase + ", esVip=" + esVip
				+ ", inventario=" + inventario + "]";
	}
	
	
}

package logica;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

	private String tienda;
	private String ciudad;
	private List<Producto> productos = new ArrayList<>();
	public Inventario() {
		super();
	}
	public String getTienda() {
		return tienda;
	}
	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	@Override
	public String toString() {
		return "Inventario [tienda=" + tienda + ", ciudad=" + ciudad + ", productos=" + productos + "]";
	}
	
	
}

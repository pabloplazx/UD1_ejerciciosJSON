package principal;

import java.io.File;

import logica.Inventario;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

public class Principal {

	public static void main(String[] args) {
		
		Inventario inventario = new Inventario();
		
		File archivo = new File("inventario.json");
		inventario = leerJson(archivo);
		
		System.out.println(inventario);
	}
	
	private static Inventario leerJson(File file) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode nodo = mapper.readTree(file);
		
		Inventario inventario = mapper.treeToValue(nodo, Inventario.class);
		
		return inventario;
	}
}

package main;

import java.io.File;

import consola.Leer;
import logica.Gremio;
import logica.Miembro;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

public class Principal {

	public static void main(String[] args) {
		
		File archivo = new File("gremio.json");
		
		Gremio gremio = leerJson(archivo);
		
		int op = 0;
		do {
			mostrarMenu();
			System.out.print("Introduzca opcion: ");
			op = Leer.datoInt();
			
			switch (op) {
			case 1:
				jugadorMasNivel(gremio);
				break;
			case 2:
				System.out.println("Numero de VIPS: "+numeroVips(gremio));;
				break;
			case 3:
				System.out.print("Introduza alias del jugador que desea añadir el item: ");
				String alias = Leer.dato();
				
				System.out.print("Que desea añadir?: ");
				String herramienta = Leer.dato();
				
				añadirItem(gremio, alias, herramienta);
				break;
			}
		} while (op != 4);
	}
	
	private static Gremio leerJson(File file) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode nodo = mapper.readTree(file);
		
		Gremio gremio = mapper.treeToValue(nodo, Gremio.class);
		
		return gremio;
	}
	
	private static void mostrarMenu() {
		System.out.println("1. Encontrar al lider");
		System.out.println("2. Numero de VIP en el gremio");
		System.out.println("3. Añadir un item");
		System.out.println("4. SALIR");
	}
	
	private static void jugadorMasNivel(Gremio gremio) {
		int nivelMaximo = Integer.MIN_VALUE; 
		
		for (Miembro miembro : gremio.getMiembros()) {
			if (miembro.getNivel() > nivelMaximo) {
				nivelMaximo = miembro.getNivel();
			}
		}
		
		for (Miembro miembro : gremio.getMiembros()) {
			if (miembro.getNivel() == nivelMaximo) {
				System.out.println(miembro);
			}
		}
	}
	
	private static int numeroVips(Gremio gremio) {
		
		int numeroVIPs = 0;
		for (Miembro miembro : gremio.getMiembros()) {
			if (miembro.isEsVip()) {
				numeroVIPs++;
			}
		}
		if (numeroVIPs == 0) {
			System.out.println("No se han encontrado VIPs en el gremio");
			return numeroVIPs;
		}
		return numeroVIPs;
	}
	
	private static void añadirItem(Gremio gremio, String aliasMiembro, String herramienta) {
		//1. MODIFCIACAR EL OBJETOV EN MEMORIA 
		//Recorremos la lista de miembros para encontrar al jugador
		boolean encontrado = false;
		
		for (Miembro m : gremio.getMiembros()) {
			if (m.getAlias().equalsIgnoreCase(aliasMiembro)) {
				m.getInventario().add(herramienta);
				encontrado = true;
				System.out.println("Item añadido a "+aliasMiembro);
				break;
			}
		}
		
		if (!encontrado) {
			System.out.println("Jugador no encontrado");	
			return;
		}
		
		//2. ACTUALIZAR EL FICHERO
		ObjectMapper mapper = new ObjectMapper();
		try {
			//ESTA ES LA CLAVE: 
			//Al escribir sobre gremio.json, Jackson borra lo que habia y escribe 
			//el objeto g completo con los nuevos cambio
			
			mapper.writerWithDefaultPrettyPrinter()
			.writeValue(new File("gremio.json"), gremio);
			
			System.out.println("Fichero actualizado correcatamente");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

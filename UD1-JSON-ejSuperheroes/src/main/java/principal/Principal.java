package principal;

import java.io.File;

import consola.Leer;
import logica.GestionSuperheroes;
import logica.Superheroes;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

public class Principal {

	public static void main(String[] args) {
		
		File archivo = new File("supeheroes.json");
		
		Superheroes sup = leerJson(archivo);
		
		GestionSuperheroes gestion = new GestionSuperheroes();
		int op = 0;
		
		do {
			
			System.out.print("Introduzca opcion: ");
			op = Leer.datoInt();
			
			switch (op) {
			case 1:
				gestion.obtenerActivos(sup);
				break;
			case 2:
				System.out.print("Introduzca el poder que busca: ");
				String poder = Leer.dato();
				
				gestion.buscarHeroePorPoder(sup, poder);
				break;
			case 3:
				System.out.println("Nombre equipo: ");
				String nombreEquipo = Leer.dato();
				
				gestion.listarMiembros(sup, nombreEquipo);
				break;
			case 4:
				System.out.println("Edad minima: ");
				int edad = Leer.datoInt();
				
				gestion.buscarVeterano(sup, edad);
				break;
			case 5:
				System.out.println("Edad media: "+gestion.calcularEdadMedia(sup));
				break;
			case 6:
				gestion.revelarIdentades(sup);
				break;
			case 7:
				System.out.println("SALIENDO");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (op != 7);
	}
	
	private static Superheroes leerJson(File file) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode nodo = mapper.readTree(file);
		
		Superheroes Superheroes = mapper.treeToValue(nodo, Superheroes.class);
		
		return Superheroes;
	}
	
	private static void mostrarMenu() {
		System.out.println("1. Superheroes activos");
		System.out.println("2. Heroes por poder");
		System.out.println("3. Listar miembros del equipo");
		System.out.println("4. Miembros por edad");
		System.out.println("5. Edad media");
		System.out.println("6. Revelar identidades");
		System.out.println("7. SALIR");
	}
}

package logica;

import java.util.ArrayList;
import java.util.List;

public class GestionSuperheroes {

	
	public void obtenerActivos(Superheroes sup) {
		List<String> activos = new ArrayList<>();
		
		for (Miembro miembro : sup.getMiembros()) {
			if (miembro.isActivo()) {
				activos.add(miembro.getAlias());
			}
		}
		
		for (String miembro : activos) {
			System.out.println(miembro);
		}
	}
	
	public void buscarHeroePorPoder(Superheroes sup , String poderBuscado) {
		String heroe = "";
		
		for (Miembro miembro : sup.getMiembros()) {
			for (String poder : miembro.getPoderes()) {
				if (poder.equalsIgnoreCase(poderBuscado)) {
					heroe = miembro.getAlias();
				}
			}
		}
		
		System.out.println(heroe);
	}
	
	public void listarMiembros(Superheroes sup ,String nombreEquipo) {
		List<String> miembrosEquipo = new ArrayList<>();
		
		for (Miembro miembro : sup.getMiembros()) {
			Equipo equipo = miembro.getEquipo();
			
			if (equipo.getNombre().equals(nombreEquipo)) {
				miembrosEquipo.add(miembro.getAlias());
			}
		}
		
		for (String miembro : miembrosEquipo) {
			System.out.println(miembro);
		}
	}
	
	public void buscarVeterano(Superheroes sup ,int edadMinima)  {
		
		List<String> miembrosMayores = new ArrayList<>();
		
		for (Miembro miembro : sup.getMiembros()) {
			if (miembro.getEdad() > edadMinima) {
				miembrosMayores.add(miembro.getAlias());
			}
		}
		
		for (String miembro : miembrosMayores) {
			System.out.println(miembro);
		}
	}
	
	public double calcularEdadMedia(Superheroes sup) {
		double suma = 0;
		
		double media = 0;
		int contMiembros = 0;
		
		for (Miembro miembro : sup.getMiembros()) {
			suma += miembro.getEdad();
			contMiembros++;
		}
		
		media = suma / contMiembros;
		
		return media;
	}
	
	public void revelarIdentades(Superheroes sup) {
		List<String> identidades = new ArrayList<>();
		
		for (Miembro miembro : sup.getMiembros()) {
			identidades.add(miembro.getIdentidadSecreta());
		}
		
		for (String identidad : identidades) {
			System.out.println(identidad);
		}
		
	}
}

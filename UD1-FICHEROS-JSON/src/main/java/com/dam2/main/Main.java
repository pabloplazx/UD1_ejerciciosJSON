package com.dam2.main;

import java.io.File;

import com.dam2.model.Alumno;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		
		Alumno a;
		System.out.println(a = leerJSON(new File("alumno.json")));
		a.setNombre("carlos");
		escribirJSON(a,new File("alumno.json"));
		
		System.out.println(getNota(new File("alumno.json"),"ad"));
		

	}
	
	static Alumno leerJSON(File file) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode nodo = mapper.readTree(file);
		
		Alumno a = mapper.treeToValue(nodo, Alumno.class);
		
		return a;
	}
	
	static void escribirJSON(Alumno a, File file) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		mapper.writerWithDefaultPrettyPrinter()
			.writeValue(file, a);
	}
	
	static Integer getNota(File file, String modulo) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode nodo = mapper.readTree(file);
		
		JsonNode modulos = nodo.findValue("modulos");
		
		if(modulos.isArray()) {
			
			for(JsonNode m : modulos) {
				if(m.findValue("nombre").asString().equals(modulo))
					return m.findValue("nota").asInt();
				
			}
		}
		
		return null;
	}

}

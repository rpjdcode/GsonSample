package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		// Inicialiación
		Scanner sc = new Scanner(System.in);
		Persona p = new Persona();
		
		// Recogida de datos
		System.out.print("Nombre: ");
		p.setNombre(sc.nextLine());
		System.out.print("Apellidos: ");
		p.setApellidos(sc.nextLine());
		System.out.print("Edad: ");
		p.setEdad(Integer.parseInt(sc.nextLine()));
		sc.close();
		
		
		// Convertimos el objeto Java a JSON
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		
		
		// Mostramos el JSON
		System.out.println(json);
		

	}

}

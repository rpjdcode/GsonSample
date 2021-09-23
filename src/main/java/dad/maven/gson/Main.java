package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

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
		
		// (Extra) Guardado del JSON en un archivo
		try {
			FileWriter fw = new FileWriter("personas.json", Charset.forName("UTF8"));
			fw.write(json);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Mostramos el JSON
		System.out.println(json);
		

	}

}

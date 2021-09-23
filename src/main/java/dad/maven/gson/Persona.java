package dad.maven.gson;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private int edad;
	
	public Persona() {
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setNombre(String n) {
		this.nombre=n;
	}
	
	public void setApellidos(String ape) {
		this.apellidos=ape;
	}
	
	public void setEdad(int x) {
		this.edad=x;
	}
	
	@Override
	public String toString() {
		return this.nombre + " " + this.apellidos + " Edad: " + this.edad;
	}
}

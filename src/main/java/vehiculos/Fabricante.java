package vehiculos;

public class Fabricante {
	
	// Attributes.
	private String nombre;
	private Pais pais;
	
	// Constructor.
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	// Getters.
	public String getNombre() {
		return nombre;
	}
	public Pais getPais() {
		return pais;
	}
	
	// Setters.
	public void setNombre(String nom) {
		nombre = nom;
	}
	public void setPais(Pais lugar) {
		pais = lugar;
	}
}

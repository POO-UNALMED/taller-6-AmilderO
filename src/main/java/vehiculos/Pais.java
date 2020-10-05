package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	//Attributes.
	static ArrayList<Pais> paises = new ArrayList<Pais>();
	private ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	private String nombre;
	
	// Constructor.
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	// Getters.
	public String getNombre() {
		return nombre;
	}
	
	// Setters.
	public void setNombre(String nom) {
		nombre = nom;
	}
	
	// Methods.
	public void addFabricante(Fabricante fab) {
		fabricantes.add(fab);
	}
	
	public static Pais paisMasVendedor() {
		Pais mayor = paises.get(0);
		int vmayor = 0;
		
		for(int i = 0; i < paises.size(); i++) {
			int cont = 0;
			for(int e = 0; e < paises.get(i).fabricantes.size(); e++) {
				cont += paises.get(i).fabricantes.get(e).getVehiculos();
			}
			if(cont > vmayor) {
				vmayor = cont;
				mayor = paises.get(i);
			}
		}
		
		return mayor;
	}
}

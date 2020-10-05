package vehiculos;
import java.util.ArrayList;
public class Fabricante {
	
	// Attributes.
	static ArrayList<Fabricante> totalFabricantes = new ArrayList<Fabricante>();
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private String nombre;
	private Pais pais;
	
	// Constructor.
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		this.pais.addFabricante(this);
		totalFabricantes.add(this);
	}
	
	// Getters.
	public String getNombre() {
		return nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public int getVehiculos() {
		return vehiculos.size();
	}
	
	// Setters.
	public void setNombre(String nom) {
		nombre = nom;
	}
	public void setPais(Pais lugar) {
		pais = lugar;
		pais.addFabricante(this);
	}
	
	// Methods.
	public void addVehiculo(Vehiculo vel) {
		vehiculos.add(vel);
	}
	public static Fabricante fabricaMayorVentas() {
		Fabricante mayor = totalFabricantes.get(0);
		for(int i = 1; i < totalFabricantes.size(); i++) {
			if(totalFabricantes.get(i).vehiculos.size() > mayor.vehiculos.size()) {
				mayor = totalFabricantes.get(i);
			}
		}
		return mayor;
	}
	
}

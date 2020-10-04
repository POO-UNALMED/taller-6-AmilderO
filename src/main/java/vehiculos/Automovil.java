package vehiculos;

public class Automovil extends Vehiculo {
	
	// Attributes.
	static int cantidadAutomoviles;
	private int puestos;
	
	// Constructors.
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		this.puestos = puestos;
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.fabricante = fabricante;
		puertas = 4;
		velocidadMaxima = 100;
		traccion = "FWD";
		masVehiculos();
		masAutomoviles();
	}
	
	// Getters.
	public int getPuestos() {
		return puestos;
	}
	public static void masAutomoviles() {
		cantidadAutomoviles ++;
	}
}

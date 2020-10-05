package vehiculos;

public class Camioneta extends Vehiculo {

	// Attributes.
	
	private boolean volco;
	static int cantidadCamionetas;
	
	// Constructors.
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.volco = volco;
		this.puertas = puertas;
		this.fabricante = fabricante;
		velocidadMaxima = 90;
		traccion = "4X4";
		masVehiculos();
		masCamionetas();
		fabricante.addVehiculo(this);
	}
	
	// Getters. 
	public boolean isVolco() {
		return volco;
	}
	
	// Methods.
	public static void masCamionetas() {
		cantidadCamionetas ++;
	}
}

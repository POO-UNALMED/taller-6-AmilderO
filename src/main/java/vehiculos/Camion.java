package vehiculos;

public class Camion extends Vehiculo {
	
	// Attributes.
	private int ejes;
	static int cantidadCamiones;
	
	// Constructor.
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		this.placa = placa;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.ejes = ejes;
		puertas = 2;
		velocidadMaxima = 80;
		traccion = "4X2";
		masVehiculos();
		masCamiones();
		fabricante.addVehiculo(this);
	}
	
	// Getters.
	public int getEjes() {
		return ejes;
	}
	
	// Methods.
	public static void masCamiones() {
		cantidadCamiones ++;
	}
}

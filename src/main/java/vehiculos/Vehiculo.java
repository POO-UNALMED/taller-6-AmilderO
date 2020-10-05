package vehiculos;

public class Vehiculo {
	
	// Attributes.
	static int totalvehiculos;
	String placa;
	int puertas;
	int velocidadMaxima;
	String nombre;
	int precio;
	int peso;
	String traccion;
	Fabricante fabricante;
	
	// Constructor.
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		masVehiculos();
		fabricante.addVehiculo(this);
	}
	public Vehiculo() {
		
	}
	
	// Getters.
	public String getPlaca() {
		return placa;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public int getPeso() {
		return peso;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public int getPuertas() {
		return puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public String getTraccion() {
		return traccion;
	}
	
	// Setters.
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public void setPlaca(Fabricante fab) {
		fabricante = fab;
	}
	public void setPlaca(int puertas) {
		this.puertas = puertas;
	}
	public void setVelocidadMaxima(int velocidad) {
		velocidadMaxima = velocidad;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	// Methods.
	public static int getCantidadVehiculos() {
		return totalvehiculos;
	}
	public static void setCantidadVehiculos(int num) {
		totalvehiculos = num;
	}
	public static void masVehiculos() {
		totalvehiculos ++;
	}
	public static String vehiculosPorTipo() {
		return("Automoviles: " + Automovil.cantidadAutomoviles + "\n" +
				"Camionetas: " + Camioneta.cantidadCamionetas + "\n" +
				"Camiones: " + Camion.cantidadCamiones);
	}
	
}

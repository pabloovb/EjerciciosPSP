package EjerciciosPSP;

public class Vehículo {

	
	private String tipo;
	private String marca;
	private String modelo;
	
	public Vehículo(String tipo, String marca, String modelo) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void mostrarInfo() {
        System.out.println("Tipo: " + tipo + ", Marca: " + marca + ", Modelo: " + modelo);
    }
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
}

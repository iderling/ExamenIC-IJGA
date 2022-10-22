package IDE;

public class DatRegistro {

	private String marca;
	private int modelo;
	private int año;
	private int chasis;
	private int placa;
	
	public DatRegistro() {
		
		marca= "";
		modelo= 0;
		año= 0;
		chasis= 0 ; 
		placa= 0;
	}
	
	public DatRegistro(String m, int mo, int a, int c, int p  ) {
		marca= m;
		modelo= mo;
		año= a;
		chasis= c ;
		placa= p;
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getChasis() {
		return chasis;
	}

	public void setChasis(int chasis) {
		this.chasis = chasis;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}
	
	
}

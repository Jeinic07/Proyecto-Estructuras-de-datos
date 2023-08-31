package co.edu.unbosque.model;

public class VehiculoDTO {
	
	private String tipo;
	private String placa;
	private String horaEntrada;
	
	
	public VehiculoDTO() {
		// TODO Auto-generated constructor stub
	}


	public VehiculoDTO(String tipo, String placa, String horaEntrada) {
		super();
		this.tipo = tipo;
		this.placa = placa;
		this.horaEntrada = horaEntrada;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getHoraEntrada() {
		return horaEntrada;
	}


	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}


	@Override
	public String toString() {
		return "VehiculoDTO [tipo=" + tipo + ", placa=" + placa + ", horaEntrada=" + horaEntrada + "]";
	}
	
	

}

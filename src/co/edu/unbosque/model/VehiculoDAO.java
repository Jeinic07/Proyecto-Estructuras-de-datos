package co.edu.unbosque.model;

public class VehiculoDAO implements OperacionesDAO{
	
	VehiculoDTO v;
	
	private MyLinkedList<VehiculoDTO> vehiculos;
	
	public VehiculoDAO() {
	
		v = new VehiculoDTO();
		vehiculos = new MyLinkedList<VehiculoDTO>();
	}
	

	public VehiculoDTO getV() {
		return v;
	}


	public void setV(VehiculoDTO v) {
		this.v = v;
	}


	public MyLinkedList<VehiculoDTO> getVehiculos() {
		return vehiculos;
	}


	public void setVehiculos(MyLinkedList<VehiculoDTO> vehiculos) {
		this.vehiculos = vehiculos;
	}


	@Override
	public String ingresar(String tipo, String placa, String horaEntrada) {

		String salida = "";
		
		try {
			vehiculos.add(new VehiculoDTO(tipo, placa, horaEntrada));
			salida = "\nVehiculo agregado, Tipo: "+tipo+ " Placa: "+placa+" Hora de ingreso: "+ horaEntrada;
		} catch (Exception e) {
			salida = "\nHizo algo mal chino mk, intente de nuevo";
		}
		
		return salida;
	}

	@Override
	public String eliminar(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mostrarVehiculo(String placa) {
		String salida = "";
		
		for(int i = 0; i < vehiculos.size(); i++) {
			if(vehiculos.get(i).getInfo().getPlaca().equalsIgnoreCase(placa)) {
				salida = vehiculos.get(i).toString();
			}else {
				salida = "El vehiculo con esa placa no se encuentra en el sistema";
			}
		}
		
		return salida;
		 
	}

	@Override
	public String mostrarTodo() {
		String salida = "";

		for (int i = 0; i < vehiculos.size(); i++) {

			salida += vehiculos.toString();

		}
		return salida;
	
}

}

package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.util.Scanner;

import co.edu.unbosque.model.VehiculoDAO;
import co.edu.unbosque.view.MenuVista;

public class Controller implements ActionListener {

	private VehiculoDAO v;
	private Scanner sc;
	private MenuVista mv;

	public Controller() {
		v = new VehiculoDAO();
		sc = new Scanner(System.in);
		mv = new MenuVista();
		agregarLectores();
	}
		
	private void agregarLectores() {
		
		mv.getBtnActualizarCarro().addActionListener(this);
		mv.getBtnActualizarCarro().setActionCommand("Actualizar");
		
		mv.getBtnBorrarCarro().addActionListener(this);
		mv.getBtnBorrarCarro().setActionCommand("Borrar");
		
		mv.getBtnIngresarCarro().addActionListener(this);
		mv.getBtnIngresarCarro().setActionCommand("Ingresar");
		
	}
	
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Agregar":{
			

			break;
		}
		case "Actualizar":{
			
			break;
		}
		case "Borrar":{
			
			break;
		}

		default:
			break;
		}
	}
	
//	public void run() {
//		
//		ciclo1: while(true) {
//			
//			System.out.println("__________________________________________");
//			System.out.println("");
//			System.out.println("SISTEMA DE ALMACENAMIENTO DE VEHICULOS");
//			System.out.println("");
//			System.out.println("Que desea realizar?");
//			System.out.println("");
//			System.out.println("1. Ingresar un vehiculo.");
//			System.out.println("2. Eliminar un vehiculo.");
//			System.out.println("3. Mostrar un vehiculo.");
//			System.out.println("4. Mostrar todos los vehiculos.");
//			System.out.println("5. Salir.");
//			System.out.println("");
//			System.out.println("__________________________________________");
//			
//			
//			ciclo2: while(true) {
//				
//				int op = sc.nextInt();
//				
//				switch(op) {
//				
//				case 1:{
//					
//					System.out.println("Ingrese el tipo de vehiculo (camioneta, automovil, moto");
//					String tipo = sc.nextLine();
//					sc.next();					
//					System.out.println("Ingrese la placa del vehiculo (AAA 000)");
//					String placa = sc.nextLine();
//					sc.next();
//					System.out.println("Ingrese la hora de ingreso (formato 24 horas -> 15 00)");
//					String horaEntrada = sc.nextLine();
//					sc.next();
//					
//					System.out.println(v.ingresar(tipo, placa, horaEntrada));
//					break ciclo2;
//				}
//				case 2:{
//					
//					break ciclo2;
//					
//				}		
//				
//				case 3:{
//					System.out.println("Ingrese la placa del vehiculo que desea ver (AAA 000)");
//					String placa = sc.nextLine();
//					sc.next();
//					
//					System.out.println(v.mostrarVehiculo(placa).toString());
//				
//					break ciclo2;
//				}
//				
//				case 4:{
//					
//					break ciclo2;
//				}
//				
//				case 5:{
//					
//					System.exit(0);
//				}
//				}
//				
//			}
//			
//		}
//	}
}

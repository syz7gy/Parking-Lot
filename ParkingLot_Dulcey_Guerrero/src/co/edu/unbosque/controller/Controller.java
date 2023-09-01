package co.edu.unbosque.controller;

import java.sql.Time;

import co.edu.unbosque.model.VehiculoDTO;
import co.edu.unbosque.model.persistance.VehiculoDAO;
import co.edu.unbosque.view.Console;

public class Controller {
	
	private Console con;
	private VehiculoDAO vdao;
	
	public Controller() {
		con = new Console();
		vdao = new VehiculoDAO();
		
		ejecutar();
		
	}
	
	public void ejecutar() {
		Time ingreso = new Time(05, 06, 24);
		Time salida = new Time(23, 10, 1);
//		vdao.create(new VehiculoDTO("2131", "Moto", ingreso, salida));
		
		con.printLine(vdao.read());
		
		
	}
	
	

}

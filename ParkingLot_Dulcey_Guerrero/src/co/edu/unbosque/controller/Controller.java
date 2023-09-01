package co.edu.unbosque.controller;

import co.edu.unbosque.model.persistance.VehiculoDAO;
import co.edu.unbosque.view.Console;

public class Controller {
	
	private Console con;
	private VehiculoDAO vdao;
	
	public Controller() {
		con = new Console();
		vdao = new VehiculoDAO();	
	}
	
	public void ejecutar() {
		
	}
	
	

}

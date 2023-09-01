package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.VehiculoDTO;
import co.edu.unbosque.model.persistance.VehiculoDAO;
import co.edu.unbosque.view.VentanaAgregar;
import co.edu.unbosque.view.VentanaEliminar;
import co.edu.unbosque.view.VentanaMostrar;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal vista1;
	private VentanaAgregar vista2;
	private VentanaEliminar vista3;
	private VentanaMostrar vista4;
	private VehiculoDAO vdao;

	public Controller() {

		vista1 = new VentanaPrincipal();
		vista2 = new VentanaAgregar();
		vista3 = new VentanaEliminar();
		vista4 = new VentanaMostrar();
		vdao = new VehiculoDAO();

		agregarLectores();

	}

	public void agregarLectores() {

		vista1.getBtn1().addActionListener(this);
		vista1.getBtn1().setActionCommand("boton1vista1");

		vista1.getBtn2().addActionListener(this);
		vista1.getBtn2().setActionCommand("boton2vista1");

		vista1.getBtn3().addActionListener(this);
		vista1.getBtn3().setActionCommand("boton3vista1");

		vista1.getBtn4().addActionListener(this);
		vista1.getBtn4().setActionCommand("boton4vista1");

		vista2.getBtn1().addActionListener(this);
		vista2.getBtn1().setActionCommand("boton1vista2");

		vista2.getBtn2().addActionListener(this);
		vista2.getBtn2().setActionCommand("boton2vista2");

		vista3.getBtn1().addActionListener(this);
		vista3.getBtn1().setActionCommand("boton1vista3");

		vista3.getBtn2().addActionListener(this);
		vista3.getBtn2().setActionCommand("boton2vista3");

		vista4.getBtn1().addActionListener(this);
		vista4.getBtn1().setActionCommand("boton1vista4");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "boton1vista1": {

			vista1.setVisible(false);
			vista2.setVisible(true);
			break;
		}
		case "boton2vista1": {

			vista1.setVisible(false);
			vista3.setVisible(true);
			break;
		}

		case "boton3vista1": {

			vista1.setVisible(false);
			vista4.setVisible(true);
			vista4.getTxtVehiculos().setText("Estos son los registros en base de datos: " 
												+ "\n\n" + vdao.read());
			break;
		}

		case "boton4vista1": {

			System.exit(0);
			break;
		}

		case "boton1vista2": {

			vista2.setVisible(false);
			vista1.setVisible(true);
			break;
		}

		case "boton2vista2": {
			
			try {
				String placa = vista2.getPlaca().getText();
				String tipo = vista2.getTipo().getText();
				String[] ingreso = vista2.getHoraEntrada().getText().split(":");
				String[] salida = vista2.getHoraSalida().getText().split(":");
				Time horaEntrada = new Time(Integer.parseInt(ingreso[0]), Integer.parseInt(ingreso[1]),
						Integer.parseInt(ingreso[2]));
				Time horaSalida = new Time(Integer.parseInt(salida[0]), Integer.parseInt(salida[1]),
						Integer.parseInt(salida[2]));	
				
				
				String newPlate = "";
				
				Pattern s = Pattern.compile("-");
				Matcher ms = s.matcher(placa);
				boolean sFound = ms.find();
				
				boolean pl = false;
				boolean tp = false;
				if(!sFound && placa.length()==6) {
					for(int i = 0; i<3; i++) {
						newPlate+=placa.charAt(i);
					}
					newPlate+="-";
					for(int i = 3; i<6; i++) {
						newPlate+=placa.charAt(i);
					}
					if(comprobarPlaca(newPlate)) {
						JOptionPane.showMessageDialog(null, "Placa válida.", "Agregar vehículo",
								JOptionPane.INFORMATION_MESSAGE);
						pl = true;
					} else {
						JOptionPane.showMessageDialog(null, "Placa inválida", "Agregar vehículo",
								JOptionPane.INFORMATION_MESSAGE);
						pl = false;
					}
				} else if (sFound && placa.length()==6){
					if(comprobarPlaca(placa)) {
						JOptionPane.showMessageDialog(null, "Placa válida.", "Agregar vehículo",
								JOptionPane.INFORMATION_MESSAGE);
						pl = true;
					} else {
						JOptionPane.showMessageDialog(null, "Placa inválida", "Agregar vehículo",
								JOptionPane.INFORMATION_MESSAGE);
						pl = false;
					}
				}
				if(tipo.equalsIgnoreCase("carro") || tipo.equalsIgnoreCase("moto") || tipo.equalsIgnoreCase("camion")) {
					JOptionPane.showMessageDialog(null, "Vehículo autorizado.", "Agregar vehículo",
							JOptionPane.INFORMATION_MESSAGE);
					tp = true;
				} else {
					JOptionPane.showMessageDialog(null, "No podemos guardar ese tipo de vehículos.", "Agregar vehículo",
							JOptionPane.INFORMATION_MESSAGE);
					tp = false;
				}
				if(pl && tp) {
					vdao.create(new VehiculoDTO(placa, tipo, horaEntrada, horaSalida));
					
					JOptionPane.showMessageDialog(null, "Vehículo almacenado con éxito!", "Agregar vehículo",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Inténtelo de nuevo.", "Agregar vehículo",
							JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(null, "Inténtelo de nuevo.", "Agregar vehículo",
						JOptionPane.INFORMATION_MESSAGE);
			}
		
			break;
		}

		case "boton1vista3": {
			try {
				String eliminar = vista3.getEliminar().getText();

				int n = Integer.parseInt(eliminar);

				vdao.delete(n);

				JOptionPane.showMessageDialog(null, "El vehículo ha sido retirado con exito!", "Eliminar vehículo",
						JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception e3) {
				JOptionPane.showMessageDialog(null, "Asegurese de que sea su vehículo, y cancele la tarifa antes de salir.", "Eliminar vehículo",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
			break;
		}

		case "boton2vista3": {

			vista3.setVisible(false);
			vista1.setVisible(true);
			break;
		}

		case "boton1vista4": {

			vista4.setVisible(false);
			vista1.setVisible(true);
			break;
		}

		}
	}
	
	static boolean comprobarPlaca(String newPlate) {
		String[] placa = newPlate.split("-");
		Pattern pt1 = Pattern.compile("[a-zA-Z]");
		Matcher mat1 = pt1.matcher(placa[0]);
		boolean m1found = mat1.find();
		
		Pattern pt2 = Pattern.compile("[0-9]");
		Matcher mat2 = pt2.matcher(placa[1]);
		boolean m2found = mat2.find();
		
		if(m1found && m2found) {
			return true;
		} else {
			return false;
		}
	}
}

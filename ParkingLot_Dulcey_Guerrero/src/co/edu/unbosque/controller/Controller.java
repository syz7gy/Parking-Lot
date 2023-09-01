package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.VentanaAgregar;
import co.edu.unbosque.view.VentanaEliminar;
import co.edu.unbosque.view.VentanaMostrar;
import co.edu.unbosque.view.VentanaPrincipal;

public class Controller implements ActionListener {

	private VentanaPrincipal vista1;
	private VentanaAgregar vista2;
	private VentanaEliminar vista3;
	private VentanaMostrar vista4;

	public Controller() {

		vista1 = new VentanaPrincipal();
		vista2 = new VentanaAgregar();
		vista3 = new VentanaEliminar();
		vista4 = new VentanaMostrar();

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

			break;
		}

		case "boton1vista3": {

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
}

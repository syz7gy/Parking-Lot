package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaAgregar extends JFrame {

	private JLabel foto1;
	private Image imagen1, imagen2, imagen3;
	private Icon icon1, icon2, icon3;
	private JPanel panel;
	private JButton btn1, btn2, btn3, btn4;
	private JTextField placa, tipo, horaEntrada, horaSalida;

	public VentanaAgregar() {
		setTitle("Inicio");
		setBounds(600, 200, 1280, 720);
		this.setSize(1280, 720);
		setResizable(false);
		setLocationRelativeTo(null);
		setUndecorated(true);

		// PANELES
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(600, 200, 550, 700);

		// IMAGENES
		imagen1 = new ImageIcon("src/co/edu/unbosque/view/images/fondo2.png").getImage();
		icon1 = new ImageIcon(imagen1.getScaledInstance(1280, 720, Image.SCALE_DEFAULT));
		foto1 = new JLabel();
		foto1.setBounds(0, 0, 1280, 720);
		foto1.setIcon(icon1);
		
		// TEXT
		placa = new JTextField();
		placa.setBounds(117, 275, 300, 30);
		placa.setBackground(Color.WHITE);
		
		tipo = new JTextField();
		tipo.setBounds(117, 413, 300, 30);
		tipo.setBackground(Color.WHITE);
		
		horaEntrada = new JTextField();
		horaEntrada.setBounds(864, 275, 300, 30);
		horaEntrada.setBackground(Color.WHITE);
		
		horaSalida = new JTextField();
		horaSalida.setBounds(864, 413, 300, 30);
		horaSalida.setBackground(Color.WHITE);
		
		// BOTONES
		imagen2 = new ImageIcon("src/co/edu/unbosque/view/images/boton5.png").getImage();
		icon2 = new ImageIcon(imagen2.getScaledInstance(195, 67, Image.SCALE_SMOOTH));
		btn1 = new JButton(icon2);
		btn1.setBounds(542, 581, 195, 67);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);
		
		imagen3 = new ImageIcon("src/co/edu/unbosque/view/images/boton1.png").getImage();
		icon3 = new ImageIcon(imagen3.getScaledInstance(195, 67, Image.SCALE_SMOOTH));
		btn2 = new JButton(icon3);
		btn2.setBounds(542, 504, 195, 67);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);

		// ADD
		add(placa);
		add(tipo);
		add(horaEntrada);
		add(horaSalida);
		add(btn1);
		add(btn2);
		add(foto1);
		
		setVisible(false);
	}

	public JLabel getFoto1() {
		return foto1;
	}

	public void setFoto1(JLabel foto1) {
		this.foto1 = foto1;
	}

	public Image getImagen1() {
		return imagen1;
	}

	public void setImagen1(Image imagen1) {
		this.imagen1 = imagen1;
	}

	public Image getImagen2() {
		return imagen2;
	}

	public void setImagen2(Image imagen2) {
		this.imagen2 = imagen2;
	}

	public Image getImagen3() {
		return imagen3;
	}

	public void setImagen3(Image imagen3) {
		this.imagen3 = imagen3;
	}

	public Icon getIcon1() {
		return icon1;
	}

	public void setIcon1(Icon icon1) {
		this.icon1 = icon1;
	}

	public Icon getIcon2() {
		return icon2;
	}

	public void setIcon2(Icon icon2) {
		this.icon2 = icon2;
	}

	public Icon getIcon3() {
		return icon3;
	}

	public void setIcon3(Icon icon3) {
		this.icon3 = icon3;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JButton getBtn1() {
		return btn1;
	}

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public JButton getBtn2() {
		return btn2;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	public JButton getBtn3() {
		return btn3;
	}

	public void setBtn3(JButton btn3) {
		this.btn3 = btn3;
	}

	public JButton getBtn4() {
		return btn4;
	}

	public void setBtn4(JButton btn4) {
		this.btn4 = btn4;
	}

	public JTextField getPlaca() {
		return placa;
	}

	public void setPlaca(JTextField placa) {
		this.placa = placa;
	}

	public JTextField getTipo() {
		return tipo;
	}

	public void setTipo(JTextField tipo) {
		this.tipo = tipo;
	}

	public JTextField getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(JTextField horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public JTextField getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(JTextField horaSalida) {
		this.horaSalida = horaSalida;
	}
}

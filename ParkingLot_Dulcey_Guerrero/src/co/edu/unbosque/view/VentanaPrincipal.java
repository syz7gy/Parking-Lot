package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaPrincipal extends JFrame {

	private JLabel foto1;
	private Image imagen1, imagen2, imagen3, imagen4, imagen5;
	private Icon icon1, icon2, icon3, icon4, icon5;
	private JPanel panel;
	private JButton btn1, btn2, btn3, btn4;

	public VentanaPrincipal() {
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
		imagen1 = new ImageIcon("src/co/edu/unbosque/view/images/fondo1.png").getImage();
		icon1 = new ImageIcon(imagen1.getScaledInstance(1280, 720, Image.SCALE_DEFAULT));
		foto1 = new JLabel();
		foto1.setBounds(0, 0, 1280, 720);
		foto1.setIcon(icon1);

		// BOTONES
		imagen2 = new ImageIcon("src/co/edu/unbosque/view/images/boton1.png").getImage();
		icon2 = new ImageIcon(imagen2.getScaledInstance(195, 67, Image.SCALE_SMOOTH));
		btn1 = new JButton(icon2);
		btn1.setBounds(542, 350, 195, 67);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);
		
		imagen3 = new ImageIcon("src/co/edu/unbosque/view/images/boton2.png").getImage();
		icon3 = new ImageIcon(imagen3.getScaledInstance(195, 67, Image.SCALE_SMOOTH));
		btn2 = new JButton(icon3);
		btn2.setBounds(542, 427, 195, 67);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);
		
		imagen4 = new ImageIcon("src/co/edu/unbosque/view/images/boton3.png").getImage();
		icon4 = new ImageIcon(imagen4.getScaledInstance(195, 67, Image.SCALE_SMOOTH));
		btn3 = new JButton(icon4);
		btn3.setBounds(542, 504, 195, 67);
		btn3.setBorderPainted(false);
		btn3.setContentAreaFilled(false);
		
		imagen5 = new ImageIcon("src/co/edu/unbosque/view/images/boton4.png").getImage();
		icon5 = new ImageIcon(imagen5.getScaledInstance(195, 67, Image.SCALE_SMOOTH));
		btn4 = new JButton(icon5);
		btn4.setBounds(542, 581, 195, 67);
		btn4.setBorderPainted(false);
		btn4.setContentAreaFilled(false);

		// ADD
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(foto1);
		
		setVisible(true);
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

	public Image getImagen4() {
		return imagen4;
	}

	public void setImagen4(Image imagen4) {
		this.imagen4 = imagen4;
	}

	public Image getImagen5() {
		return imagen5;
	}

	public void setImagen5(Image imagen5) {
		this.imagen5 = imagen5;
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

	public Icon getIcon4() {
		return icon4;
	}

	public void setIcon4(Icon icon4) {
		this.icon4 = icon4;
	}

	public Icon getIcon5() {
		return icon5;
	}

	public void setIcon5(Icon icon5) {
		this.icon5 = icon5;
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
}

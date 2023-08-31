package co.edu.unbosque.model;

import java.sql.Time;

public class VehiculoDTO {
	
	private String placa;
	private String tipo;
	private Time horaEntrada;
	private Time horaSalida;
	
	public VehiculoDTO() {
		// TODO Auto-generated constructor stub
	}

	public VehiculoDTO(String placa, String tipo, Time horaEntrada, Time horaSalida) {
		super();
		this.placa = placa;
		this.tipo = tipo;
		this.horaEntrada = horaEntrada;
		this.horaSalida = horaSalida;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Time getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Time horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Time getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Time horaSalida) {
		this.horaSalida = horaSalida;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Placa: " + placa);
		sb.append("\nTipo: " + tipo);
		sb.append("\nHora ingreso: " + horaEntrada);
		sb.append("\nHora salida: " + horaSalida + "\n");
		return sb.toString();
	}
	
	

}

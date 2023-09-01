package co.edu.unbosque.model.persistance;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Objects;

import co.edu.unbosque.model.VehiculoDTO;
import co.edu.unbosque.util.MyLinkedList;

public class VehiculoDAO {
	
	private MyLinkedList<VehiculoDTO> lista;
	
	public VehiculoDAO() {
		if(!Objects.isNull(FileHandler.leerSerializado("Parking.pajp"))) {
			try {
				lista = loadFromFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			lista = new MyLinkedList<VehiculoDTO>();
		}
	}

	
	private MyLinkedList<VehiculoDTO> loadFromFile() {
		MyLinkedList<VehiculoDTO> fromFile = new MyLinkedList<>();
		String content = FileHandler.leerSerializado("Parking.pajp").toString();
		String[] lines = content.split("\n");
		for (String line : lines) {
			String[] attrs = line.split(";");
			String placa = attrs[0];
			String tipo = attrs[1];
			String[] ingreso = attrs[2].split(":");
			String[] salida = attrs[3].split(":");
			Time horaIngreso = new Time(Integer.parseInt(ingreso[0]), Integer.parseInt(ingreso[1]), Integer.parseInt(ingreso[2]));
			Time horaSalida = new Time(Integer.parseInt(salida[0]), Integer.parseInt(salida[1]), Integer.parseInt(salida[2]));
			fromFile.add(new VehiculoDTO(placa, tipo, horaIngreso, horaSalida));
		}
		return fromFile;
	}
	
	private void writeInFile() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<lista.size(); i++) {
			VehiculoDTO v = lista.get(i).getInfo();
			sb.append(v.getPlaca() + ";");
			sb.append(v.getTipo() + ";");
			sb.append(v.getHoraEntrada().toString() + ";");
			sb.append(v.getHoraSalida().toString() + "\n");
		}
		FileHandler.escribirSerializado("Parking.pajp", sb.toString());
//		FileHandler.escribirEnArchivo("Parking.txt", sb.toString());
	}
	
	public void create(Object o) {
		lista.add((VehiculoDTO)o);
		writeInFile();
	}
	
	public boolean delete(int n) {
		try {
			lista.remove(n);
			writeInFile();
			return true;
		} catch (Exception e) {
			System.out.println("No se ha podido eliminar");
			return false;
		}
	}
	
	public String read() {
//		MyLinkedList<VehiculoDTO> fromFile = new MyLinkedList<>();
//		String content = FileHandler.leerSerializado("Parking.pajp").toString();
//		String[] lines = content.split("\n");
//		for (String line : lines) {
//			String[] attrs = line.split(";");
//			String placa = attrs[0];
//			String tipo = attrs[1];
//			String[] ingreso = attrs[2].split(":");
//			String[] salida = attrs[3].split(":");
//			Time horaIngreso = new Time(Integer.parseInt(ingreso[0]), Integer.parseInt(ingreso[1]), Integer.parseInt(ingreso[2]));
//			Time horaSalida = new Time(Integer.parseInt(salida[0]), Integer.parseInt(salida[1]), Integer.parseInt(salida[2]));
//			fromFile.add(new VehiculoDTO(placa, tipo, horaIngreso, horaSalida));
//		}
//		return fromFile.toString();
		return lista.toString();
	}
	
	

}

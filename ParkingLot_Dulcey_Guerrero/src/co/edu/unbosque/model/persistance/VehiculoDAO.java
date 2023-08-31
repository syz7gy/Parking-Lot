package co.edu.unbosque.model.persistance;

import co.edu.unbosque.model.VehiculoDTO;
import co.edu.unbosque.util.MyLinkedList;

public class VehiculoDAO {
	
	private MyLinkedList<VehiculoDTO> lista;
	
	public VehiculoDAO() {
		lista = new MyLinkedList<>();
	}
	
	public void create(Object o) {
		lista.add((VehiculoDTO)o);
	}
	
	public boolean delete(int n) {
		try {
			lista.remove(n);
			return true;
		} catch (Exception e) {
			System.out.println("No se ha podido eliminar");
			return false;
		}
	}
	
	public String read() {
		return lista.toString();
	}
	
	

}

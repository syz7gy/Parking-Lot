package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	
	private Scanner sc;
	
	public Console() {
		sc = new Scanner(System.in);
	}
	
	public int nextInt() {
		return sc.nextInt();
	}
	
	public long nextLong() {
		return sc.nextLong();
	}
	
	public float nextFloat() {
		return sc.nextFloat();
	}
	
	public double nextDouble() {
		return sc.nextDouble();
	}
	
	public char charAt(int n) {
		return sc.next().charAt(n);
	}
	
	public String next() {
		return sc.next();
	}
	
	public String nextLine() {
		return sc.nextLine();
	}
	
	public void print(String message) {
		System.out.print(message);
	}
	
	public void printLine(String message) {
		System.out.println(message);
	}

}

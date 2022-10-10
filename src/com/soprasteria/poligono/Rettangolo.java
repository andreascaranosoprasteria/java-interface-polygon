package com.soprasteria.poligono;

public class Rettangolo implements Poligono{
	
	private int base;
	private int altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
		
		System.out.println("[Area : "+ calcolaArea() + "]");
		System.out.println("[Perimetro : "+ calcolaPerimetro() + "]");
		
	}
	
	public int calcolaArea() {
		return base * altezza;
	}
	
	public int calcolaPerimetro() {
		return 2 * (base + altezza);
	}
	
}

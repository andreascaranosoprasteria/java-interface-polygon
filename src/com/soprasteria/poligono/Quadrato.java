package com.soprasteria.poligono;

public class Quadrato implements Poligono{
	private int lato;
	
	public Quadrato(int lato) {
		this.lato = lato;
		System.out.println("[Area : "+ calcolaArea() + "]");
		System.out.println("[Perimetro : "+ calcolaPerimetro() + "]");
	}
	
	public int calcolaArea() {
		return lato * lato;
	}
	
	public int calcolaPerimetro() {
		return lato * 4;
	}
}

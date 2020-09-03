package com.exercise1;

public class PolimorfismoPoligono {

	public static void main(String[] args) {
		
		// Objeto Poligono
		Poligono poligono1 = new Rectangulo(4,4,2,2);
		System.out.println(poligono1.toString());
		double perimetro1 = poligono1.perimetro();
		System.out.println("El perimetro de esta figura es: "+perimetro1);
		
		poligono1 = new Rectangulo(2,2);
		double area1 = poligono1.area();
		System.out.println("El area de este poligono es: "+area1);
		
		poligono1 = new Triangulo(3,3,3);
		System.out.println(poligono1.toString());
		double perimetro2 = poligono1.perimetro();
		System.out.println("El perimetro de esta figura es: "+perimetro2);
		
		poligono1 = new Triangulo(5,2);
		double area2 = poligono1.area();
		System.out.println("El area de este poligono es: "+area2);
		
		// EJERICIO - GENERAR UN TRAPECIO CON SUS LADOS, AREA Y PERIMETRO.
	}

}

package com.exercise1;

public class Triangulo extends Poligono{
	
	private double lado1, lado2, lado3;
	private double base1, altura1;
	
	// COnstructor default
	public Triangulo() {
		
	}
	
	// Constructor perimetro
	public Triangulo(int lado1, int lado2, int lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		
	}
	
	// Constructor Area
	public Triangulo(double base, double altura) {
		super(3);
		this.base1 = base;
		this.altura1 = altura;
	}
	
	 //Encapsulacion
	public void setlado1(double lado1) {
		 this.lado1= lado1;    
	}

	public double getlado1() {
		 return lado1;	    
	}
	
	public void setlado2(double lado2) {
		 this.lado2= lado2;    
	}

	public double getlado2() {
		 return lado2;	    
	}
	
	public void setlado3(double lado3) {
		 this.lado3= lado3;    
	}
	
	// Methods
	@Override
	public String toString() {
		String message = "TRIANGULO " + super.toString() + 
				" \nLADO 1= "+lado1+" LADO 2= "+lado2+" LADO 3= "+lado3;
		return message;
	}
	
	@Override
	public double area() {
		return (base1 * altura1)/2;
	}
	
	@Override
	public double perimetro() {
		return lado1+lado2+lado3;
	}
	

}

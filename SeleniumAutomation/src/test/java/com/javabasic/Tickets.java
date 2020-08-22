package com.javabasic;

public class Tickets {
	
	int precioAdulto, edad;
	double precioNino ,precioEstudiante; //Descuento
	boolean estudiante = false;
	String costo;
	
	/*************************************************************************************CONSTRUCTOR*/
	public Tickets (int precioNormal, int edadPersona, boolean credencialEstudiante) {
		
		precioAdulto = precioNormal;
		precioNino = precioNormal * (.85);
		precioEstudiante = precioNormal * (.5);
		costo = "Precio Normal";
		edad = edadPersona;
		estudiante = credencialEstudiante;
		
	}
	
	public Tickets () {
		
	}
	
	/*************************************************************************************METHODS*/
	
	public void costoDia() {
		System.out.println("El Costo Ticket: "+ costo);
	}
	
	public void precioAdulto() {
		System.out.println("Ticket Adulto: $"+ precioAdulto);
	}
	
	public void precioNino() {
		System.out.println("Ticket Nino: $"+ precioNino);
	}
	
	public void precioEstudiante() {
		System.out.println("Ticket Estudiante: $"+ precioEstudiante);
	}
	
	public void verificarcostoTicket() {
		if(estudiante==true) {
			System.out.println("Eres un ESTUDIANTES el precio de tu ticket es: $"+precioEstudiante);
		}else if(edad>18){
			System.out.println("Eres un ADULTO el precio de tu ticket es: $"+precioAdulto);			
		}else {
			System.out.println("Eres un NINO el precio de tu ticket es: $"+precioNino);
		}
	}
	
	/**********************************************************************SOBRECARGA*/
	
	public double sumarTicket() {
		double suma = precioAdulto + precioNino;
		System.out.println(suma);
		return suma;
	}
	
	public double sumarTicket(int descuento) {
		double suma = (precioAdulto + precioNino) - descuento;
		System.out.println(suma);
		return suma;
	}
	
	public double sumarTicket(int descuento, int descuentroExtra) {
		double suma = (precioAdulto + precioNino) - descuento - descuentroExtra;
		System.out.println(suma);
		return suma;
	}
	
	public double sumarTicket(boolean descuento, boolean descuentroExtra) {
		double suma = (precioAdulto + precioNino) - 30 - 30;
		System.out.println(suma);
		return suma;
	}
	
	public double sumarTicket(boolean descuento, int descuentroExtra) {
		double suma = (precioAdulto + precioNino) - 30 - descuentroExtra;
		System.out.println(suma);
		return suma;
	}
	
	
	// EJERCIO GENERAR OTRO CONSTRUCTOR SOBRECARGADO CON ARGUMENTO "DESCUENTO"	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tickets tickets = new Tickets(120, 19, false);
		
		tickets.costoDia();
		tickets.precioAdulto();
		tickets.precioNino();
		tickets.precioEstudiante();
		
		tickets.sumarTicket(true, 40);

	}

}

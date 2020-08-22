package com.javabasic;

public class ArrayStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String []nombres = new String[4];
//		
//		nombres[0] = "Ricardo";
//		nombres[1] = "Ivan";
//		nombres[2] = "Pepe";
//		nombres[3] = "Toño";
		
//		System.out.println(nombres[0]);
		
		String [][]persona = new String[4][4];
		
		persona[0][0] = "Ana";
		persona[0][1] = "Tester Jr";
		persona[1][0] = "Brayan";
		persona[1][1] = "Sr tester";
		persona[2][0] = "Carlos";
		persona[2][1] = "Sr Tester";
		persona[3][0] = "Cristian";
		persona[3][1] = "Sr Tester";
		
		getNombreRol(persona);
		
		
 	}
	
	public static void getNombreRol(String [][]persona) {
		
		System.out.println("El nombre es: "+persona[2][0]+" y su Rol es: "+ persona[2][1]);
		
	}
	
	
}

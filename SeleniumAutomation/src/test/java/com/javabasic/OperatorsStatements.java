package com.javabasic;

public class OperatorsStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		/*
//		 * Operadores Aritmeticos
//		 */
//		
//		int x = 1;
//		int y = 2;
//		int suma;
//		
//		suma = x*y;
//		
//		System.out.println(suma);
		
		/*
		 * Operadores Unarios
		 */
		
		int valor1 = 3;
		int incrementar = --valor1;
		
		System.out.println(incrementar);
		
		/*
		 * Operadores relacionales y condicionales
		 */
		
		int num1= 7;
		int num2 = 7;
//		int num3 = 6;
//		int num4 = 11;
		
		if(num1 >= 10 || num2 >10) {
			System.out.println("los numeros son mayores a 10");
		}else {
			System.out.println("uno de los numeros o los dos numeros son menores a 10");
		}
		
		
	}
	
	
	

}

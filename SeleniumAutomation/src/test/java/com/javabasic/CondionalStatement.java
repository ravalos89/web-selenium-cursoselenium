package com.javabasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CondionalStatement {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad = 60;
		int limiteVelocidad = 70;
		
		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("browser", "chrome");
		caps.setCapability("name", "Docker1"+ "123uh4");
		caps.setCapability("deviceName", "S9 Ricardo's Samsung");
		caps.setCapability("platFormName", "Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("bundleId", "33ERR-");
		caps.setCapability("app", "com.facebook.android");
		
		
		DesiredCapabilities caps2 = DesiredCapabilities.android();
		caps2.setCapability("browser", "chrome");
		caps2.setCapability("name", "Selenium");
		
		WebDriver driver = new RemoteWebDriver(caps);
//		// IF
//		if(velocidad > limiteVelocidad) {
//			System.out.println("Multa!!!");
//		}
		
//		// IF ELSE
//		if(velocidad>limiteVelocidad) {
//			System.out.println("Multa!!!");
//		}else {
//			System.out.println("Vamos a una velocidad adecuada");
//		}
		
//		// IF ANIDADOS
//		boolean highway = true;
//		
//		if(highway==true) {
//			
//			System.out.println("Vamos en la highway");
//			
//			limiteVelocidad = 100;
//			
//			if(velocidad > limiteVelocidad) {
//					System.out.println("Multa!!!");
//				}else {
//					System.out.println("Vamos a una velocidad adecuada");
//				
//			}
//			
//		}
		
//		// IF ELSE IF
//		boolean highway = false;
//		
//		if(highway==true) {
//			
//			System.out.println("Vamos en la highway");
//			
//			limiteVelocidad = 100;
//			
//			if(velocidad > limiteVelocidad) {
//					System.out.println("Multa!!!");
//				}else {
//					System.out.println("Vamos a una velocidad adecuada");
//				
//			}
//			
//		}else if(velocidad > limiteVelocidad){
//			System.out.println("Vas en una calle y a exceso de velocidad MULTA!!!");
//			
//		}else {
//			System.out.println("Vas en una calle y a una velocidad adecuada");
//		}
		
//		SWITCH CASE
		int temperatura = 22;
		
		switch(temperatura) {
		case 10:
			System.out.println("Frio");
			break;
			
		case 20:
			System.out.println("Agradable");
			break;
			
		case 30:
			System.out.println("Calor");
			break;
			
		case 40:
			System.out.println("Estamos en el desierto");
			break;
			
		default:
			System.out.println("Da igual");
			break;
			
		}
							
				
	}

}

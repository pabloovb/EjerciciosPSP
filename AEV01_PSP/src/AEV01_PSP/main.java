package AEV01_PSP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Elige el ejercicio 1 al 3");
		int eleccion = teclado.nextInt();
		
		switch (eleccion) {
		case 1: {
			sayHello.holaMundo();			
		}
		case 2: {
			numeroPrimo();
		}
		case 3: {
			companeros();
		}
		
		}
		
	}
	
	public static void numeroPrimo() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime un numero (menor)");
		int nummenor = teclado.nextInt();
		System.out.println("Dime un numero (mayor)");
		int nummayor = teclado.nextInt();
		
		int suma = 0;
		
		for (int i = nummenor; i <= nummayor; i++) {
			if(i % 2== 0 || i % 3 == 0 ) {
				if(i == 3) {
					System.out.println("Numero: " + i + "  es primo");
				} else if (i % 2== 0 || i % 3 == 0 ) {
					
				}
				System.out.println("Numero: " + i + "   no es primo");
			} else if(i % 2== 1)  {
				System.out.println("Numero: " + i + "  es primo");
				
			}
			
		}
		
		for (int i = nummenor; i <= nummayor; i++) {
			 suma = suma + i;
		}
		
		System.out.println("La suma total es: " + suma);
	}
	
	public static void companeros() {
		Scanner teclado = new Scanner(System.in);
		
		
		String nombres[] = new String [7];
		
		nombres[1] = ("Pablo");
		nombres[2] =("Andriy");
		nombres[3] =("Vicent");
		nombres[4] =("Alex");
		nombres[5] =("Rafa");
		nombres[6] =("Fran");
		
		
		
		ArrayList<Integer> num = new ArrayList<Integer>();
	
		
		System.out.println("Dime numeros ( escribe 0 para salir)");
		
		for (int i = 0; i < 1000; i++) {
			int numlist = teclado.nextInt();
			if(numlist == 0) {
				System.out.println("No puedes escribir 0");
				break;
			}
			for (Integer integer : num) {
				num.add(numlist);
				if(num.equals(1)) {
					System.out.println("El numero 1 se asigna a: " + nombres[1]);
				}
				if(num.equals(2)) {
					System.out.println("El numero 1 se asigna a: " + nombres[2]);
				}
				if(num.equals(3)) {
					System.out.println("El numero 1 se asigna a: " + nombres[3]);
				}
				if(num.equals(4)) {
					System.out.println("El numero 1 se asigna a: " + nombres[4]);
				}
				if(num.equals(5)) {
					System.out.println("El numero 1 se asigna a: " + nombres[5]);
				}
				if(num.equals(6)) {
					System.out.println("El numero 1 se asigna a: " + nombres[6]);
				}
			}
			
			
			
		}
		System.out.println("El numero mayor es:" + num);
		
			
	}
		
	}



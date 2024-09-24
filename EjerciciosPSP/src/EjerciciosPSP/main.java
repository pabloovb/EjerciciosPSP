package EjerciciosPSP;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class main {
	
	
	
	public static void Ejercicio1() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe 2 números para sumar");
		System.out.println("Número 1: ");
		int num1 = teclado.nextInt();
		System.out.println("Número 2: ");
		int num2 = teclado.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println("El total de la suma es: " + suma);
	}
	
	public static void Ejercicio2() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu nombre:  ");
		String nombre = teclado.next();
		
		System.out.println("Hola: " + nombre);
	}
	
	public static void Ejercicio3() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe 2 números para sumar");
		System.out.println("Número 1: ");
		int num1 = teclado.nextInt();
		System.out.println("Número 2: ");
		int num2 = teclado.nextInt();
		
		int suma = num1 + num2;
		
		System.out.println("El total de la suma es: " + suma);
	}
	
	public static void Ejercicio4() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Número 1: ");
		int num1 = teclado.nextInt();
		System.out.println("Número 2: ");
		int num2 = teclado.nextInt();
		
		if(num1 > num2 ) {
			System.out.println("El numero mayor es: " + num1);
		}
		
		if(num1 < num2 ) {
			System.out.println("El numero mayor es: " + num2);
		}
	}
	
	public static void Ejercicio5() {
		Scanner teclado = new Scanner(System.in);
		int num2;
		int num1;
		do {
			System.out.println("Número 1: ");
			 num1 = teclado.nextInt();
			System.out.println("Número 2: ");
			 num2 = teclado.nextInt();
		} while (num1 != num2);
	}
	
	public static void Ejercicio6() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escribe 5 números para sumar");
		System.out.println("Número 1: ");
		int num1 = teclado.nextInt();
		System.out.println("Número 2: ");
		int num2 = teclado.nextInt();
		System.out.println("Número 3: ");
		int num3 = teclado.nextInt();
		System.out.println("Número 4: ");
		int num4 = teclado.nextInt();
		System.out.println("Número 5: ");
		int num5 = teclado.nextInt();
		
		int suma = num1 + num2+ num3 + num4 + num5;
		
		System.out.println("La suma es: " + suma);
		
	}
	
	public static void Ejercicio7() {
		Scanner teclado = new Scanner(System.in);
		
		int numero = 0;
		int suma = 0;
		
		for (int i = 1; i < 5; i++) {
			
			System.out.println("Dime un numero: ");
			 numero = teclado.nextInt();
			 suma = 0;
			 suma = suma + numero;
			
		} System.out.println("La suma total es: " + suma);
	}
	
	public static void Ejercicio8() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero del 1 al 12");
		int num = teclado.nextInt();
		
		if(num == 1) {
			System.out.println("Enero");
		}
		
		if(num == 2) {
			System.out.println("Febrero");
		}
		
		if(num == 3) {
				System.out.println("Marzo");	
				}
		
		if(num == 4) {
			System.out.println("Abril");	
		}
		
		if(num == 5) {
			System.out.println("Mayo");	
		}
		
		if(num == 6) {
			System.out.println("Junio");	
		}
		
		if(num == 7) {
			System.out.println("Julio");	
		}
		
		if(num == 8) {
			System.out.println("Agosto");	
		}
		
		if(num == 9) {
			System.out.println("Septiembre");	
		}
		if(num == 10) {
			System.out.println("Octubre");	
		}
		
		if(num == 11) {
			System.out.println("Noviembre");	
				}
		
		if(num == 12) {
			System.out.println("Diciembre");	
		}
	}
	
	public static void Ejercicio9() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero del 1 al 12");
		int num = teclado.nextInt();
		
		switch (num) {
		
		case 1: {
			System.out.println("Enero");
		}
		
		case 2: {
			System.out.println("Febrero");
		}
		
		case 3: {
				System.out.println("Marzo");	
				}
		
		case 4: {
			System.out.println("Abril");	
		}
		
		case 5: {
			System.out.println("Mayo");	
		}
		
		case 6: {
			System.out.println("Junio");	
		}
		
		case 7: {
			System.out.println("Julio");	
		}
		
		case 8: {
			System.out.println("Agosto");	
		}
		
		case 9: {
			System.out.println("Septiembre");	
		}
		case 10: {
			System.out.println("Octubre");	
		}
		
		case 11: {
			System.out.println("Noviembre");	
				}
		
		case 12: {
			System.out.println("Diciembre");	
		}
		default:
			
		}
	}
	
	public static void Ejercicio10() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero del 1 al 12");
		int num = teclado.nextInt();
		
		if (num <=12) {
			
		
		switch (num) {
		
		case 1: {
			System.out.println("Enero");
		}
		
		case 2: {
			System.out.println("Febrero");
		}
		
		case 3: {
				System.out.println("Marzo");	
				}
		
		case 4: {
			System.out.println("Abril");	
		}
		
		case 5: {
			System.out.println("Mayo");	
		}
		
		case 6: {
			System.out.println("Junio");	
		}
		
		case 7: {
			System.out.println("Julio");	
		}
		
		case 8: {
			System.out.println("Agosto");	
		}
		
		case 9: {
			System.out.println("Septiembre");	
		}
		case 10: {
			System.out.println("Octubre");	
		}
		
		case 11: {
			System.out.println("Noviembre");	
				}
		
		case 12: {
			System.out.println("Diciembre");	
		}
		default:
			
		}
		
		}else {
			System.out.println("Tu numero es mayor a 12");
		}
	}
	
	public static void Ejercicio11() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu DNI sin letra");
		
		int dni = teclado.nextInt();
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		char letra = letras.charAt(dni % letras.length());
		
		String dniEntero = "" + dni + letra;
		System.out.println(dniEntero);
	}
	
	public static void Ejercicio12() {
		Scanner teclado = new Scanner(System.in);
		
		double nota = 0;
		int Suspensos = 0;
		int Aprobados = 0;
		int Notables = 0;
		int Sobresaliente = 0;
		int Matricula = 0;
		
		for (int i = 1; i < 11; i++) {
			System.out.println("Dime una nota");
			 nota = teclado.nextDouble();
			 	if (nota<5) {
					Suspensos++;
				}
				if (nota>=5 && nota <=6) {
					Aprobados++;
				}
				if (nota>=7 && nota <=8) {
					Notables++;
				}
				if (nota>=9 && nota <10) {
					Sobresaliente++;
				}
				if (nota==10) {
					Matricula++;
				}
				
		}
		System.out.println("Numero de suspensos: " + Suspensos);
		System.out.println("Numero de aprobados: " + Aprobados);
		System.out.println("Numero de notables: " + Notables);
		System.out.println("Numero de sobresaliente: " + Sobresaliente);
		System.out.println("Numero de matricula: " + Matricula);
		
		
	}
	
	public static void Ejercicio13() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero en grados centrigrados");
		float grados = teclado.nextFloat();
		
		float farenhein = (grados * 9 / 5) + 32;
		
		System.out.println(farenhein);
	}
	
	public static void Ejercicio14() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el valor del radio de una circunferencia");
		double radio = teclado.nextFloat();
		
		double diametro = 2 * radio;
        double area = Math.PI * Math.pow(radio, 2);

        
        System.out.printf("Diámetro: %.3f\n", diametro);
        System.out.printf("Área: %.3f\n", area);
	}
	
	public static void Ejercicio15() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el valor del radio de una circunferencia");
		double radio = teclado.nextFloat();
		
		double diametro = 2 * radio;
        double area = Math.PI * Math.pow(radio, 2);
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

      
        System.out.printf("Diámetro: %.3f\n", diametro);
        System.out.printf("Área de la circunferencia: %.3f\n", area);
        System.out.printf("Volumen de la esfera: %.3f\n", volumen);
	}
	
	public static void Ejercicio16() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime el año en el que naciste");
		int ano = teclado.nextInt();
		System.out.println("Dime el mes en el que naciste(en numero)");
		int mes = teclado.nextInt();
		System.out.println("Dime el dia en el que naciste");
		int dia = teclado.nextInt();
	}
	
	public static void Ejercicio17() {
		Scanner teclado = new Scanner(System.in);
	}
	public static void Ejercicio18() {
		Scanner teclado = new Scanner(System.in);
	}
	public static void Ejercicio19() {
		Scanner teclado = new Scanner(System.in);
		System.out.printf("%-10s %-10s\n", "Código", "Carácter");
        System.out.println("------------------------");

        
        for (int i = 0; i <= 255; i++) {
            
            System.out.printf("%-10d %-10c\n", i, (char)i);
        }
	}
	public static void Ejercicio20() {
		Scanner teclado = new Scanner(System.in);
		 System.out.printf("%-10s %-10s\n", "Código", "Carácter");
	        System.out.println("------------------------");

	        
	        for (int i = 0; i <= 255; i++) {
	           
	            System.out.printf("%-10d %-10c\n", i, (char)i);
	        }
	    }
	
	
	public static void Ejercicio21() {
		Scanner teclado = new Scanner(System.in);
		String[] nombres = new String[5];
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Dime el nombre");
			nombres[i] = teclado.next();
		}
		
	}
	public static void Ejercicio22() {
		Scanner teclado = new Scanner(System.in);
		String nom;
		ArrayList<String> nombres = new ArrayList<String>();
		
		while (true) {
            System.out.print("Introduce el nombre (o escribe 0 para terminar): ");
            String nombre = teclado.next();
            
            if (nombre.equals("0")) {
                break;
            }
            
            nombres.add(nombre);
        }
		
	}	
	public static void Ejercicio23() {
		Scanner teclado = new Scanner(System.in);
		
		String nom;
		ArrayList<String> nombres = new ArrayList<String>();
		
		while (true) {
            System.out.print("Introduce el nombre (o escribe 0 para terminar): ");
            String nombre = teclado.next();
            
            if (nombre.equals("0")) {
                break;
            }
            
            nombres.add(nombre);
        }
		for (int i = 0; i < nombres.size(); i++) {
			
			System.out.println("Nombre " + i + ": " + nombres.get(i));
			
		}
	}
	public static void Ejercicio24() {
		Scanner teclado = new Scanner(System.in);
		int numeroElegido;
		
	
		
		
		
			System.out.println("Dime un numero del 1 al 10");
			numeroElegido = teclado.nextInt();
			int numeroAleatorio = (int) (Math.random()*10+1);
			
			if(numeroElegido == numeroAleatorio) {
				System.out.println("Tu numero era el " + numeroElegido);
				System.out.println("El numero aleatorio es: " + numeroAleatorio);
				
				System.out.println("Elige tu premio");
				System.out.println("Una noche de pasión con Andriy (sin límites)");
				System.out.println("Premio x2 en tu proxima apuesta");
				System.out.println("5€");
			} else {
				System.out.println("Has fallado oooooooo");
				System.out.println("El numero aleatorio era: " + numeroAleatorio);
			}
		}	
	public static void Ejercicio25() {
		Scanner teclado = new Scanner(System.in);
		int numeroElegido;
		
		
		
		
		
		System.out.println("Dime un numero del 1 al 10");
		numeroElegido = teclado.nextInt();
		int numeroAleatorio = (int) (Math.random()*10+1);
		
		if(numeroElegido == numeroAleatorio) {
			System.out.println("Tu numero era el " + numeroElegido);
			System.out.println("El numero aleatorio es: " + numeroAleatorio);
			
			System.out.println("Elige tu premio");
			System.out.println("Una noche de pasión con Andriy (sin límites)");
			System.out.println("Premio x2 en tu proxima apuesta");
			System.out.println("5€");
		} else {
			System.out.println("Has fallado oooooooo");
			System.out.println("El numero aleatorio era: " + numeroAleatorio);
		}
	}
	public static void Ejercicio26() {
		Scanner teclado = new Scanner(System.in);
		double nota = 0;
		int Suspensos = 0;
		int Aprobados = 0;
		int Notables = 0;
		int Sobresaliente = 0;
		int Matricula = 0;
		
		for (int i = 1; i < 11; i++) {
			System.out.println("Dime una nota");
			 nota = teclado.nextDouble();
			 	if (nota<5) {
					Suspensos++;
				}
				if (nota>=5 && nota <=6) {
					Aprobados++;
				}
				if (nota>=7 && nota <=8) {
					Notables++;
				}
				if (nota>=9 && nota <10) {
					Sobresaliente++;
				}
				if (nota==10) {
					Matricula++;
				}
		}
	}
	public static void Ejercicio27() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime tu DNI sin letra");
		
		int dni = teclado.nextInt();
		String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
		
		char letra = letras.charAt(dni % letras.length());
		
		String dniEntero = "" + dni + letra;
		System.out.println(dniEntero);
	}
	public static void Ejercicio28() {
		Scanner teclado = new Scanner(System.in);
		Vehículo vehiculo1 = new Vehículo("Coche", "Toyota", "Corolla");
		Vehículo vehiculo2 = new Vehículo("Motocicleta", "Yamaha", "R1");
		Vehículo vehiculo3 = new Vehículo("Camión", "Mercedes", "Actros");
		Vehículo vehiculo4 = new Vehículo("Coche", "Honda", "Civic");
		Vehículo vehiculo5 = new Vehículo("Bicicleta", "Giant", "Escape");

       
        System.out.println("Información de los vehículos:");
        vehiculo1.mostrarInfo();
        vehiculo2.mostrarInfo();
        vehiculo3.mostrarInfo();
        vehiculo4.mostrarInfo();
        vehiculo5.mostrarInfo();
    }
	public static void Ejercicio29() {
		Scanner teclado = new Scanner(System.in);
		Vehículo vehiculo1 = new Vehículo("Coche", "Toyota", "Corolla");
		Vehículo vehiculo2 = new Vehículo("Motocicleta", "Yamaha", "R1");
		Vehículo vehiculo3 = new Vehículo("Camión", "Mercedes", "Actros");
		Vehículo vehiculo4 = new Vehículo("Coche", "Honda", "Civic");
		Vehículo vehiculo5 = new Vehículo("Bicicleta", "Giant", "Escape");

       
        System.out.println("Información de los vehículos:");
        vehiculo1.mostrarInfo();
        vehiculo2.mostrarInfo();
        vehiculo3.mostrarInfo();
        vehiculo4.mostrarInfo();
        vehiculo5.mostrarInfo();
	}
	public static void Ejercicio30() {
		Scanner teclado = new Scanner(System.in);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
				
		
		
		
		
		
		
		
		System.out.println("Elige el ejercio");
		
		int eleccion = teclado.nextInt();
		
		switch (eleccion) {
		case 1: {
			Ejercicio1();
		}
		teclado.next();
		case 2: {
			Ejercicio2();
		}
		teclado.next();
		case 3: {
			Ejercicio3();
		}
		teclado.next();
		case 4: {
			Ejercicio4();
		}
		teclado.next();
		case 5: {
			Ejercicio5();
		}
		teclado.next();		
		case 6: {
			Ejercicio6();
		}
		teclado.next();
		case 7: {
			Ejercicio7();
		}
		teclado.next();
		case 8: {
			Ejercicio8();
		}
		teclado.next();
		case 9: {
			Ejercicio9();
		}
		teclado.next();
		case 10: {
			Ejercicio10();
		}
		teclado.next();
		case 11: {
			Ejercicio11();
		}
		teclado.next();
		case 12: {
			Ejercicio12();
		}
		teclado.next();
		case 13: {
			Ejercicio13();
		}
		teclado.next();
		case 14: {
			Ejercicio14();
		}
		teclado.next();
		case 15: {
			Ejercicio15();
		}
		teclado.next();
		case 16: {
			Ejercicio16();
		}
		teclado.next();
		case 17: {
			Ejercicio17();
		}
		teclado.next();
		case 18: {
			Ejercicio18();
		}
		teclado.next();
		case 19: {
			Ejercicio19();
		}
		teclado.next();
		case 20: {
			Ejercicio20();
		}
		teclado.next();
		case 21: {
			Ejercicio21();
		}
		teclado.next();
		case 22: {
			Ejercicio22();
		}
		teclado.next();
		case 23: {
			Ejercicio23();
		}
		teclado.next();
		case 24: {
			Ejercicio24();
		}
		teclado.next();
		case 25: {
			Ejercicio25();
		}
		teclado.next();
		case 26: {
			Ejercicio26();
		}
		teclado.next();
		case 27: {
			Ejercicio27();
		}
		teclado.next();
		case 28: {
			Ejercicio28();
		}
		teclado.next();
		case 29: {
			Ejercicio29();
		}
		teclado.next();
		case 30: {
			Ejercicio30();
		}
		teclado.next();
		



}
		
	
	}

}

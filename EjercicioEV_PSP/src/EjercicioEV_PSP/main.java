package EjercicioEV_PSP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		String[] frases = {"Este mes, tu energía imparable te llevará a conquistar todas tus metas. El éxito te espera.","Prepárate para la abundancia, todo el esfuerzo que has puesto comenzará a dar frutos, incluidas tus finanzas.", 
				"Este mes estará lleno de oportunidades para reinventarte. Abre tu mente y deja que el universo te sorprenda.", "Vas a sentir una gran paz interior y la armonía en tu vida familiar te llenará de alegría. Todo fluirá a tu favor.",		
				"Tu luz brilla con más fuerza que nunca. El reconocimiento y la admiración llegarán de quienes menos esperas.", "Este mes, tu organización y perseverancia darán resultados extraordinarios. ¡Vas a lograrlo todo!",
				"El equilibrio que tanto buscabas se manifestará, trayendo amor, prosperidad y serenidad a tu vida.", "Prepárate para una transformación poderosa. Tu intuición te guiará hacia grandes oportunidades.",
				"Las aventuras y el crecimiento personal te esperan. Este mes trae viajes, aprendizajes y mucha prosperidad" , "Tu disciplina finalmente te recompensará. Este mes, el éxito financiero y profesional está asegurado.",
				"Tus ideas revolucionarias te llevarán a un cambio significativo. ¡Este mes será clave para tu futuro!", "La creatividad y la inspiración fluirán sin esfuerzo. Grandes oportunidades artísticas y espirituales te encontrarán"
				
		};
		
		Random azar = new Random();

		int posicion = azar.nextInt(frases.length);


		System.out.println("Dime el numero de tu mes de nacimiento (1-12)");
		int mes = teclado.nextInt();
		
		System.out.println("Dime tu día de nacimiento");
		int dia = teclado.nextInt();
		
		String signo = "";
		
		switch (mes) {
		case 1: {
			if(dia >= 20) {
				System.out.println("Acuario");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=19) {
				System.out.println("Capricornio");
				System.out.println(frases[posicion]);
				break;
			}
		}
		case 2: {
			if(dia >= 19) {
				System.out.println("Piscis");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=19) {
				System.out.println("Acuario");
				System.out.println(frases[posicion]);
				break;
			}
		}
		case 3: {
			if(dia >= 21) {
				System.out.println("Aries");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=20) {
				System.out.println("Piscis");
				System.out.println(frases[posicion]);
				break;
			}
		}
		case 4: {
			if(dia >= 21) {
				System.out.println("Tauro");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=20) {
				System.out.println("Aries");
				System.out.println(frases[posicion]);
				break;
			}
		}
		case 5: {
			if(dia >= 21) {
				System.out.println("Géminis");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=20) {
				System.out.println("Tauro");
				System.out.println(frases[posicion]);
				break;
			}
		}
		case 6: {
			if(dia >= 21) {
				System.out.println("Cáncer");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=20) {
				System.out.println("Géminis");
				System.out.println(frases[posicion]);
				break;
			}
		}
		case 7: {
			if(dia >= 23) {
				System.out.println("Leo");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=22) {
				System.out.println("Cáncer");
				System.out.println(frases[posicion]);
				break;
			}
		}
		case 8: {
			if(dia >= 23) {
				System.out.println("Virgo");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=22) {
				System.out.println("Leo");
				System.out.println(frases[posicion]);
				break;
			}
		}
		case 9: {
			if(dia >= 23) {
				System.out.println("Libra");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=22) {
				System.out.println("Virgo");
				System.out.println(frases[posicion]);
				break;
			}
		}
		case 10: {
			if(dia >= 23) {
				System.out.println("Escorpio");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=22) {
				System.out.println("Libra");
				System.out.println(frases[posicion]);
				break;
			}
		}
		case 11: {
			if(dia >= 22) {
				System.out.println("Sagitario");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=21) {
				System.out.println("Escorpio");
				System.out.println(frases[posicion]);
				break;
			}
		}
		case 12: {
			if(dia >= 22) {
				System.out.println("Capricornio");
				System.out.println(frases[posicion]);
				break;
			} else if (dia <=21) {
				System.out.println("Sagitario");
				System.out.println(frases[posicion]);
				break;
			}
		}
			
		}
	
	}
}
		
		
		
		
			
	
	
	
	



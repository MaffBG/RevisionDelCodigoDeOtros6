package revisionDeCodigo6;

import java.util.Scanner;

/* El código de este programa genera un arreglo de 20 números aleatorios entre 20 y 400, y permite al usuario resaltar los múltiplos de 5 o 7 según su elección. Los números resaltados aparecen entre corchetes ([]).*/

public class Codigo6 {

	public static void main(String[] args) {
		 // Se declara el arreglo y se generan números aleatorios
	     int[] numeros = new int[20];  //antes era: int[] n = int[20]
	     for (int i = 0; i < numeros.length; i++) {  //antes era: for (int i = 0; i < 20; i+)
	         numeros[i] = (int) (Math.random() * 381) + 20; // Numeros entre 20 y 400
	         System.out.print(numeros[i] + " "); // antes era: System.print y System.printl
	     }

	     // Se pide al usuario que elija que numeros resaltar
	     Scanner scanner = new Scanner(System.in);
	     System.out.println("\n\n¿Qué números quiere resaltar?");
	     System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	     int opcion = scanner.nextInt(); // Leemos la opción ingresada por el usuario

	     // Se determina el multiplo segun la opcion elegida
	     int multiplo = (opcion == 1) ? 5 : 7;

	     // Se resaltan los numeros segun la opcion seleccionada
	     System.out.println("\nNúmeros resaltados:");
	     for (int numero : numeros) {
	         if (numero % multiplo == 0) {
	             System.out.print("[" + numero + "] "); // Resaltamos el número
	         } else {
	             System.out.print(numero + " "); // Mostramos el número sin resaltar
	         }
	     }
	     scanner.close(); // Se cierra el Scanner
	 }
	}

package sentenciasDeControl;

import java.util.Scanner;

import javax.swing.*;

public class sentenciasControl {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n1, n2;
		System.out.println("ingresa tu primer numero");
		n1= sc.nextInt();
		System.out.println("Ingresa un segundo numero");
		n2= sc.nextInt();
		SecWhile(n1,n2);
		sc.close();
		
	/*	int numero;
		numero= 
				Integer.parseInt
				(JOptionPane.showInputDialog(null, "Introduce un numero"));
		Contador(numero);*/
		/**
		 * While(condicion){
		 * condicion
		 * condicion
		 * }
		 */
		/**
		 * Escribir un programa que pida 2 numeros de forma reiterada
		 * la ejecucion termina cuando sean iguales
		 */
	}
	public static void SecWhile(int n1, int n2) {
		Scanner sc= new Scanner(System.in);

		while(n1!=n2) {
			System.out.println("Los numeros no son iguales");
			System.out.println("Ingresa otro primer numero");
			n1= sc.nextInt();
			System.out.println("Ingresa otro segundo numero");
			n2= sc.nextInt();
		}
		System.out.println("Los numero son iguales");
		sc.close();
	}
	public static void Contador(int numero) {

		int sumaP=0;
		int sumaI=0;
		for (int i = 1; i <= numero; i++) {
			
			if(i%2 == 0) {
				sumaP= sumaP + i;
			}else {
				sumaI= sumaI + i;
			}
		}
		System.out.println
		("Tu numero es "+ numero + " y la suma de los pares es: " + sumaP);
		System.out.println
		("Tu numero es "+ numero + " y la suma de los impares es: " + sumaI);
		
	}
}

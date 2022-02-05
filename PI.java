package application;

import java.util.Locale;
import java.util.Scanner;

	public class PI {
		public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 double area, raio, pi = 3.14159;
		 
		 System.out.println("Qual o valor do raio do circulo? ");
		 raio = sc.nextDouble();
		 
		 area = pi * raio * raio;
		 
		 System.out.printf("O valor dessa área de do circulo é: %.4f%n",area);
		 	 
		 sc.close();
	}	
	}
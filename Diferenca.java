/*Fazer um programa para ler quatro valores inteiros A, B, C e D. 
A seguir, calcule e mostre a diferen�a do produto 
de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).*/

package application;

import java.util.Scanner;

public class Diferenca {
		public static void main(String[]args) {
			
			Scanner sc = new Scanner(System.in);
			
			
			int a=0, b=0, c=0, d=0, diferenca;
			
			System.out.println("Digite o valor de A: "+a);
			a = sc.nextInt();
			System.out.println("Digite o valor de B: "+b);
			b = sc.nextInt();
			System.out.println("Digite o valor de C: "+c);
			c = sc.nextInt();
			System.out.println("Digite o valor de D: "+d);
			d = sc.nextInt();
			
			diferenca = a * b - c * d;
			
			System.out.println("A diferen�a �: "+diferenca);
		
				
			sc.close();
		}
		
}

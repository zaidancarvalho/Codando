/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, 
calcule e mostre: 
a) a área do triângulo retângulo que tem A por base e C por altura. 
b) a área do círculo de raio C. (pi = 3.14159) 
c) a área do trapézio que tem A e B por bases e C por altura. 
d) a área do quadrado que tem lado B. 
e) a área do retângulo que tem lados A e B.*/

package Application;

import java.util.Locale;
import java.util.Scanner;

public class AreaDeFigura {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTrianguloRetangulo, circuloDeRaio, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTrianguloRetangulo = (A * C) / 2;
		
		areaCirculo = 3.14159 * C * C;
						
		areaTrapezio = (A+B) /2 * C;
		
		areaQuadrado = B * B;
		
		areaRetangulo = A * B;
		
		
		System.out.printf("Área do triângulo retângulo: %.3f\n",areaTrianguloRetangulo);
		System.out.printf("Área do circulo: %.3f\n", areaCirculo);
		System.out.printf("Área do trápezio %.3f\n", areaTrapezio);
		System.out.printf("Área do quadrado %.3f\n", areaQuadrado);
		System.out.printf("Área do retangulo %.3f\n", areaRetangulo);
				
			sc.close();
	}
}

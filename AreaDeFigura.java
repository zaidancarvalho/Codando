/*Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, 
calcule e mostre: 
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura. 
b) a �rea do c�rculo de raio C. (pi = 3.14159) 
c) a �rea do trap�zio que tem A e B por bases e C por altura. 
d) a �rea do quadrado que tem lado B. 
e) a �rea do ret�ngulo que tem lados A e B.*/

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
		
		
		System.out.printf("�rea do tri�ngulo ret�ngulo: %.3f\n",areaTrianguloRetangulo);
		System.out.printf("�rea do circulo: %.3f\n", areaCirculo);
		System.out.printf("�rea do tr�pezio %.3f\n", areaTrapezio);
		System.out.printf("�rea do quadrado %.3f\n", areaQuadrado);
		System.out.printf("�rea do retangulo %.3f\n", areaRetangulo);
				
			sc.close();
	}
}

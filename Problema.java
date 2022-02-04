/*Fazer um programa para ler as medidas da largura e comprimento de um terreno
 * retangulra com uma casa decimal, bem como o valor do metor quadrado do terreno
 * com duas casas decimais. Em seguida, o programa deve mostrar o valor da �rea do terreno,
 * bem como o valor do pre�o do terreno, ambos com duas casas decimais,
 * conforme exemplo.*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class Problema {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);  //interagir com o usu�rio para poder armazenar as informa��es nas variaveis
	
		double largura, comprimento, valorMetroQuadrado, areaDoTerreno; // guardar as informa��es do cliente
		double precoDoTerreno;
		
		System.out.println("Qual o valor da largura do terreno?");
		largura = sc.nextDouble(); 
		System.out.println("Qual o comprimento do terreno?");
		comprimento = sc.nextDouble();
		System.out.println("Qual o valor do metro quadrado do terreno? ");
		valorMetroQuadrado = sc.nextDouble();
		
		areaDoTerreno = (largura * comprimento);  //calculo largura multiplicado pelo comprimento para saber a �rea total
		precoDoTerreno =(areaDoTerreno * 200.00);  //resultado da �rea total multiplicado pelo pre�o do metro quadrado do terreno
		
		System.out.printf("O valor da �rea � %.2f%n ",areaDoTerreno);
		System.out.printf("O pre�o do terreno �: %.2f%n ",precoDoTerreno);
		
		
		sc.close();
		
		
		
		
		
	}

}

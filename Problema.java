/*Fazer um programa para ler as medidas da largura e comprimento de um terreno
 * retangulra com uma casa decimal, bem como o valor do metor quadrado do terreno
 * com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do terreno,
 * bem como o valor do preço do terreno, ambos com duas casas decimais,
 * conforme exemplo.*/
package application;

import java.util.Locale;
import java.util.Scanner;

public class Problema {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);  //interagir com o usuário para poder armazenar as informações nas variaveis
	
		double largura, comprimento, valorMetroQuadrado, areaDoTerreno; // guardar as informações do cliente
		double precoDoTerreno;
		
		System.out.println("Qual o valor da largura do terreno?");
		largura = sc.nextDouble(); 
		System.out.println("Qual o comprimento do terreno?");
		comprimento = sc.nextDouble();
		System.out.println("Qual o valor do metro quadrado do terreno? ");
		valorMetroQuadrado = sc.nextDouble();
		
		areaDoTerreno = (largura * comprimento);  //calculo largura multiplicado pelo comprimento para saber a área total
		precoDoTerreno =(areaDoTerreno * 200.00);  //resultado da área total multiplicado pelo preço do metro quadrado do terreno
		
		System.out.printf("O valor da área é %.2f%n ",areaDoTerreno);
		System.out.printf("O preço do terreno é: %.2f%n ",precoDoTerreno);
		
		
		sc.close();
		
		
		
		
		
	}

}

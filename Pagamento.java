/*Fazer um programa para ler o c�digo de uma pe�a 1,
 o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1,
 o c�digo de uma pe�a 2, o n�mero de pe�as 2
e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.*/

package Application;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
	
	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, numeroPeca, codigoPeca2, numeroPeca2;
		double valorUnitario1, valorPago1; 					//declarando as v�riaveis que vou usar no c�digo;
		double valorUnitario2, valorPago2, resultado;
		
		codigoPeca1 = sc.nextInt();
		numeroPeca = sc.nextInt();			//informa��es que o usu�rio vai escrever;
		valorUnitario1 = sc.nextDouble();
		
		valorPago1 = numeroPeca * valorUnitario1; 		//calculo para saber o valor a ser pago	
		
		System.out.println("_____________SEGUNDO C�DIGO_____________");
		
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();				//informa��es que o usu�rio vai digitar;
		valorUnitario2 = sc.nextDouble();
		
		valorPago2 = numeroPeca2 * valorUnitario2;		//calculo para saber o valor a ser pago da segunda pe�a;
		
		resultado = valorPago1 + valorPago2;		// calculo para saber o valor a ser pago da primeiro pe�a e da segunda pe�a;
		
		
		System.out.printf("Valor a ser pago: R$ %.2f%n",resultado); //usando o printf para formatar o valor e usar duas casas decimais;
		
				
		sc.close();
		
}
}
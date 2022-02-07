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
		double valorUnitario1, valorPago1; 
		double valorUnitario2, valorPago2, resultado;
		
		codigoPeca1 = sc.nextInt();
		numeroPeca = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		
		valorPago1 = numeroPeca * valorUnitario1;
		
		System.out.println("_____________SEGUNDO C�DIGO_____________");
		
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		valorPago2 = numeroPeca2 * valorUnitario2;
		
		resultado = valorPago1 + valorPago2;
		
		
		System.out.printf("Valor a ser pago: R$ %.2f%n",resultado);
		
				
		sc.close();
		
}
}
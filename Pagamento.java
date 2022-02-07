/*Fazer um programa para ler o código de uma peça 1,
 o número de peças 1, o valor unitário de cada peça 1,
 o código de uma peça 2, o número de peças 2
e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

package Application;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
	
	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1, numeroPeca, codigoPeca2, numeroPeca2;
		double valorUnitario1, valorPago1; 					//declarando as váriaveis que vou usar no código;
		double valorUnitario2, valorPago2, resultado;
		
		codigoPeca1 = sc.nextInt();
		numeroPeca = sc.nextInt();			//informações que o usuário vai escrever;
		valorUnitario1 = sc.nextDouble();
		
		valorPago1 = numeroPeca * valorUnitario1; 		//calculo para saber o valor a ser pago	
		
		System.out.println("_____________SEGUNDO CÓDIGO_____________");
		
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();				//informações que o usuário vai digitar;
		valorUnitario2 = sc.nextDouble();
		
		valorPago2 = numeroPeca2 * valorUnitario2;		//calculo para saber o valor a ser pago da segunda peça;
		
		resultado = valorPago1 + valorPago2;		// calculo para saber o valor a ser pago da primeiro peça e da segunda peça;
		
		
		System.out.printf("Valor a ser pago: R$ %.2f%n",resultado); //usando o printf para formatar o valor e usar duas casas decimais;
		
				
		sc.close();
		
}
}
/*Fa�a um programa para ler dois valores inteiros,
 e depois mostrar na tela a soma desses n�meros com uma 
mensagem explicativa, conforme exemplos.

Entrada: Sa�da:
10
30

SOMA = 40

Entrada: Sa�da:
-30
10
SOMA = -20

Entrada: Sa�da:
0
0
SOMA = 0*/

package application;

import java.util.Scanner;

public class problema2 {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int soma = valor1 + valor2;
		
		System.out.println("SOMA = " + soma);
		
		
		
		
		sc.close();
		
		
		

	}

}

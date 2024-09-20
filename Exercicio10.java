package Estrutura_Repeticao_For;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fatorial = 1, numero;

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número para saber seu fatorial: ");
		numero = input.nextInt();

		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}

		System.out.println("O fatorial do número digitado é: " + fatorial);

		input.close();
	}

}

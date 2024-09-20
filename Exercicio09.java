package Estrutura_Repeticao_For;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, maior, menor;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um número aleatório: ");
		numero = input.nextInt();

		maior = menor = numero;
		for (int i = 1; i <= 10; i++) {

			System.out.print("Digite outro número: ");
			numero = input.nextInt();

			if (numero > maior) {
				maior = numero;

			} else if (numero < menor) {
				menor = numero;

			}
		}

		System.out.format("O maior número é: %d, e o menor é: %d ", maior, menor);

		input.close();

	}
}
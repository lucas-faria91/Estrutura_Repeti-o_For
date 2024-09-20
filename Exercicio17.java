package Estrutura_Repeticao_For;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, contador = 0, media = 0;
		double peso;

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 7; i++) {
			System.out.print("Digite sua idade: ");
			idade = input.nextInt();

			System.out.print("Digite seu peso: ");
			peso = input.nextDouble();

			media += idade;

			if (peso > 90) {
				contador++;
			}
		}

		System.out.println("A quantidade de pessoas que tem mais de 90Kg é: " + contador);
		System.out.println("A idade média das pessoas é: " + media / 7);

		input.close();
	}

}

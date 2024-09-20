package Estrutura_Repeticao_For;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, contador = 0;
		char sexo;

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite sua idade: ");
			idade = input.nextInt();

			System.out.print("Digite seu sexo (F para feminino, M para masculino): ");
			sexo = input.next().charAt(0);

			if ((sexo == 'f' || sexo == 'F') && (idade >= 20 && idade <= 40)) {
				contador++;
			}
		}
		System.out.print("Há " + contador + " mulheres entre 20 e 40 anos.");

		input.close();

	}

}

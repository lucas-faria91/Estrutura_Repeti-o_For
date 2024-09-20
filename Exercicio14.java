package Estrutura_Repeticao_For;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double peso;
		int contador1 = 0, contador2 = 0;
		char sexo;

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite seu peso: ");
			peso = input.nextDouble();

			System.out.print("Digite seu sexo (F para feminino, M para masculino): ");
			sexo = input.next().charAt(0);

			if ((sexo == 'm' || sexo == 'M') && (peso >= 60 && peso <= 80)) {
				contador1++;

			} else if ((sexo == 'f' || sexo == 'F') && (peso >= 50 && peso <= 70)) {
				contador2++;
			}
		}
		System.out.println("Há " + contador1 + " homens entre 60 e 80 quilos.");
		System.out.println("E " + contador2 + " mulheres entre 50 e 70 quilos.");

		input.close();

	}

}
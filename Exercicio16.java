package Estrutura_Repeticao_For;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota, maior = 0, menor = 0;

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.print("Entre com a nota do aluno: ");
			nota = input.nextDouble();
			if (i == 1) {
				maior = nota;
				menor = nota;

			} else if (nota > maior) {
				maior = nota;

			} else if (nota < menor) {
				menor = nota;
			}
		}
		System.out.format("A maior nota é: %.2f e a menor nota é: %.2f", maior, menor);

		input.close();

	}
}
package Estrutura_Repeticao_For;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota1, nota2, media;

		Scanner input = new Scanner(System.in);

		for (int i = 0; i <= 1; i++) {
			System.out.print("Entre com a primeira nota do aluno: ");
			nota1 = input.nextDouble();

			System.out.print("Entre com a segunda nota do aluno: ");
			nota2 = input.nextDouble();

			media = (nota1 + nota2) / 2;

			System.out.format("A média da nota do aluno é: %.2f \n", media);

		}
		System.out.println("Sistema encerrado.");
		input.close();
	}

}

package Estrutura_Repeticao_For;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;

		Scanner input = new Scanner(System.in);

		System.out.print("Informe um número: ");
		numero = input.nextInt();

		System.out.print("Os números impares de 1 a " + numero + " são: ");
		for (int i = 0; i <= numero; i++) {
			if (i % 2 == 1)
				System.out.print(i + " ");
		}
		input.close();
	}

}

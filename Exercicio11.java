package Estrutura_Repeticao_For;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, expoente, potencia = 1;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite dois númeoros: ");
		base = input.nextInt();
		expoente = input.nextInt();

		for (int contador = 1; contador <= expoente; contador++) {
			potencia *= base;

			System.out.println(potencia);

		}
		System.out.println("O primeiro número elevado ao segundo é: " + (potencia));
		input.close();

	}
}
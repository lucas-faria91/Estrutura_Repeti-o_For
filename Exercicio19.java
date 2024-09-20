package Estrutura_Repeticao_For;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v0, v, h, g = 0;
		int planeta;

		Scanner input = new Scanner(System.in);

		System.out.println("1-Mercurio");
		System.out.println("2-Venus");
		System.out.println("3-Terra");
		System.out.println("4-Marte");
		System.out.println("5-Jupiter");
		System.out.println("6-Saturno");
		System.out.println("7-Urano");
		System.out.println("8-Netuno");
		System.out.println("9-Plutao");

		System.out.print("Em qual planeta você está? ");
		planeta = input.nextInt();

		System.out.print("Qual a velocidade inicial? ");
		v0 = input.nextDouble();

		switch (planeta) {
		case 1:
			g = 3.7;
			break;
		case 2:
			g = 8.8;
			break;
		case 3:
			g = 9.8;
			break;
		case 4:
			g = 3.8;
			break;
		case 5:
			g = 26.4;
			break;
		case 6:
			g = 11.5;
			break;
		case 7:
			g = 9.3;
			break;
		case 8:
			g = 12.2;
			break;
		case 9:
			g = 0.6;
			break;
		default:
			System.out.println("ERRO: Planeta Desconhecido");
		
		}
		
		for (double t = 0.0; t < 2.1; t +=0.1) {
			
		v = v0 - g * t;
		h = v0 * t - (g * Math.pow(t, 2)) / 2;
		
		System.out.format("\nt = %.2f 	velocidade = %.2f	Altura = %.2f", t, v, h);
		
		}
		input.close();
	}
}
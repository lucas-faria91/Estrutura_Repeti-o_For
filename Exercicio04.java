package Estrutura_Repeticao_For;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int cont = 0, x;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite um numero: ");
			x = input.nextInt();
			if (x < 0)
				cont++;
		}

		System.out.println("Foram lidos " + cont + " números negativos.");
		
		input.close();

	}

}

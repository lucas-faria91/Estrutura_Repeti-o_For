package Estrutura_Repeticao_For;

public class Exercicio18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tempo;
		double temperatura, soma = 0, maior, menor, maior19 = 0, menor16 = 0;

		maior = menor = temperatura = 19.06 + 0.211 * Math.cos(0.08721) + (-5.51 * Math.sin(0.08721));
		System.out.println(temperatura = 19.06 + 0.211 * Math.cos(0.08721) + (-5.51 * Math.sin(0.08721)));
		
		for (tempo = 1; tempo <= 48; tempo++) {
			temperatura = 19.06 + 0.211 * Math.cos(0.08721 * tempo) + (-5.51 * Math.sin(0.08721 * tempo));
			soma += temperatura;
			if (temperatura > maior) {
				maior = temperatura;
			}
			if (temperatura < menor) {
				menor = temperatura;
			}
			if (temperatura > 19) {
				maior19++;
			}
			if (temperatura < 16) {
				menor16++;
			}
			System.out.format("\nTemperatura no instante %d = %.2f", tempo, temperatura);

		}
		System.out.format("\n\nTemperatura Média = %.2f", soma / 48);
		System.out.format("\nMaior Temperatura = %.2f", maior);
		System.out.format("\nMenor Temperatura = %.2f", menor);
		System.out.format("\nHoras acima de 19 = %.2f", maior19);
		System.out.format("\nHoras abaixo de 16 = %.2f", menor16);
	}
}

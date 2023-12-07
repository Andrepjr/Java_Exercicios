package java_exercicios_9_3;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		int numero;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		numero = leia.nextInt();

		if (numero % 2 == 0 && numero >= 0) {
			System.out.println("O numero " + numero + " é par e positivo");

		} else if (numero % 2 != 0 && numero >= 0) {
			System.out.println("O numero " + numero + " é ímpar e positivo");

		} else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O número " + numero + " é par e negativo");
		} else if (numero % 2 != 0 && numero < 0) {
			System.out.println("O número " + numero + " e ímpar e negativo");
		}

	}

}

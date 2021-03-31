package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] fiados = new int[10];

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome do cliente: ");
		String nome = scanner.nextLine();

		for (int i = 0; i < fiados.length; i++) {
			System.out.print("Informe o valor da compra: ");
			fiados[i] = Integer.valueOf(scanner.nextLine());
		}

		int total = somaWhile(fiados);

		if (total > 0) {
			System.out.println("Cliente: " + nome + " deve: " + total);
		} else {
			System.out.println("Valor do fiado não é aceitável");
		}

	}

	public static int somaWhile(int[] fiados) {
		int i = 0;
		int total = 0;
		while (i < fiados.length) {
			total += fiados[i];
			i++;
		}
		return total;
	}

	public static int somaFor(int[] fiados) {
		int total = 0;
		for (int i = 0; i < fiados.length; i++) {
			total += fiados[i];
		}
		return total;
	}

	public static int somaForeach(int[] fiados) {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}

}
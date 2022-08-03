package regrade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RegraDe3 {

	public static void main(String[] args) {
		// variaveis
		double x, y, valor;

		// objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");

		// entrada
		System.out.println("Regra de 3");
		System.out.println("X% de y = valor");
		System.out.print("Digite o valor de X: ");
		x = teclado.nextDouble();
		System.out.print("Digite o valor de y: ");
		y = teclado.nextDouble();

		// processamento
		valor = (x * y) / 100;

		// saida
		System.out.println(x + "% de " + y + " = " + formatador.format(valor));

		teclado.close();

	}

}

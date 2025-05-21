package Questão4;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {

		final double S = 1509;

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual seu salário?:");
		double salario = sc.nextDouble();
		System.out.println("Você ganha " + salario / S + " salarios minimos");
	sc.close();
	}

}

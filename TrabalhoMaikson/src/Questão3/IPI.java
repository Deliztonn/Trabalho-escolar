package Questão3;

import java.util.Scanner;

public class IPI {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome da 1° peça: ");
		String N1 =sc.next();
		System.out.print("\nCódigo de "+N1+": ");
		int C1 = sc.nextInt();
		double V1;
		do {
		System.out.print("\nValor de "+N1+": R$ ");
		 V1 = sc.nextInt();
		} while (V1<0);
		int Q1;
		do {	
		System.out.print("\nQuantidade de estoque de "+N1+" : ");
		Q1 = sc.nextInt();
		} while (Q1<1);
		
		
		System.out.print("\nNome da 2° peça: ");
		String N2 =sc.next();
		System.out.print("\nCódigo de "+N2+": ");
		int C2 = sc.nextInt();
		double V2;
		do {
			System.out.print("\nValor de "+N2+": R$");
			V2 = sc.nextInt();
		} while (V2<0);
		int Q2;			
		do {	
			System.out.print("\nQuantidade de estoque de "+N2+" : ");
			Q2 = sc.nextInt();
		} while (Q2<1);
		
		System.out.print("\nQuanto % gostaria de acresecentar às peças?:  ");
		double ipi = sc.nextInt();
		C1=C2;
		System.out.println("\nSoma do valor vezes a quantidade de cada peça com a/decréscimo aplicado:");
		double soma = ((Q1*V1 + Q2*V2) * ((ipi/100) +1));
		System.out.println(soma);
		sc.close();
	}

}

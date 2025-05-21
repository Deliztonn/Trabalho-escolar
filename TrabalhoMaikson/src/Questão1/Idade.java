package Questão1;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade em :");
		System.out.print("Anos:  ");  int anos  = sc.nextInt();
		System.out.print("Meses: ");  int meses = sc.nextInt();
		System.out.print("Dias:  ");  int dias  = sc.nextInt();
	
		int soma = anos*365 + meses*30 + dias; 
		
		System.out.println("Você tem " +soma+ " dias de vida ao todo"); 
	
		sc.close();
	}

}

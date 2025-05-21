package Questão2;

public class Media {

	public static void main(String[] args) {

		System.out.println("Média aritmética dos números 8,9,7:");
		int media1 = (8 + 9 + 7) / 3;
		System.out.println(media1);

		System.out.println("Média aritmética dos números 4,5,6:");
		int media2 = (4 + 5 + 6) / 3;
		System.out.println(media2);

		System.out.println("Soma das médias: \n"+ (media1+media2)+"\n");
		
		System.out.println("Média da média:");
		double Mm = media1 + media2 / 2;
	
		System.out.println("reajuste de 1% na média das médias: \n"+ (Mm + (Mm* 0.01)));
		
	}
}

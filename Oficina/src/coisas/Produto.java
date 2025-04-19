package coisas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Produto {

	Scanner sc = new Scanner(System.in);

	private int id = 0;
	private String Nome;
	private int Quantidade;
	private double Preco;

	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private String Entrada;
	private LocalDate Validade;

	


	public void Preenchimento() {
		
		System.out.print("Nome do produto                   : ");
		this.Nome = sc.next();
		System.out.print("Quantidade de estoque             : ");
		this.Quantidade = sc.nextInt();
		System.out.print("Preço do produto                  : ");
		this.Preco= sc.nextDouble();
		sc.nextLine();
		System.out.print("Validade do produto(dd/mm/aaaa)   : ");
		setEntrada(sc.nextLine());
		System.out.println();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.Quantidade = quantidade;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double preco) {
		this.Preco = preco;
	}

	public String getValidade() {
		String validade = Validade.format(formato);
		return validade;

	}

	public void setEntrada(String Entrada) {
		this.Entrada = Entrada;
		Validade = LocalDate.parse(Entrada, formato);
	}

	@Override
	public String toString() {
		return " Id = " + id + ", Nome= " + Nome + ", Quantidade= " + Quantidade + ", Preco= " + Preco + ", Validade " + getValidade();
	}

}

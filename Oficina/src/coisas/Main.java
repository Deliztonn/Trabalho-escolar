package coisas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanho = 0;
		boolean cond = true;
		int id = 0;

		List<Produto> produtos = new ArrayList<>();
		Produto p = new Produto();
		System.out.println("=====================================================================");
		System.out.println("         BEM VINDO AO SISTEMA DE GESTÃO DE PRODUTOS!!");
		System.out.println("=====================================================================");
		System.out.println("     Vamos adicionar os produtos");
		System.out.print("Quantos produtos diferentes serão adicionados: ");
		tamanho = sc.nextInt();
		for (int i = 0; i < tamanho; i++) {
			Produto produto = new Produto();
			System.out.println(" " + (i + 1) + "° Produto:");
			produto.setId(id++);
			produto.Preenchimento();
			produtos.add(produto);
		}
		System.out.println("Seu(s) produto(s):");
		for (Produto produto : produtos) {
			System.out.println(produto.toString());

		}

		while (cond == true) {
			System.out.println("\n=================================");
			System.out.println("              MENU");
			System.out.println("=================================\n");
			System.out.println("[1]- Adicionar produto");
			System.out.println("[2]- Editar produto");
			System.out.println("[3]- Remover produto");
			System.out.println("[4]- Visualizar produtos");
			System.out.println("[5]- Sair");
			System.out.print(" Opção >> ");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Quantos produtos serão adicionados? : ");
				tamanho = sc.nextInt();
				for (int i = 0; i < tamanho; i++) {
					System.out.println("Produto " + (i + 1) + "/" + tamanho);
					Produto produto = new Produto();
					produto.setId(id++);
					produto.Preenchimento();
					produtos.add(produto);

				}

				break;
			case 2:
				System.out.println("Que produto você deseja editar?(Id)");
				for (Produto produto : produtos) {
					System.out.println("Id: " + produto.getId() + ", Nome: " + produto.getNome());
				}
				System.out.print(">> ");
				int ide = sc.nextInt();
				boolean encontrado = false;
				for (Produto produto : produtos) {
					if (ide == produto.getId()) {
						produto.Preenchimento();
						encontrado = true;
					}
				}
				if (!encontrado) {
					System.err.println("Produto não encontrado");
				}
				break;

			case 3:
				System.out.println("Que produto você deseja remover?(Id)");
				for (Produto produto : produtos) {
					System.out.println("Id: " + produto.getId() + ", Nome: " + produto.getNome());
				}
				System.out.print(">> ");
				int ids = sc.nextInt();
				encontrado = false;
				for (Produto produto : produtos) {
					if (ids == produto.getId()) {
						System.out.println("Tem certeza que deseja remover " + produto.getNome() + "?[sim/não]");
						encontrado = true;
						String resp = sc.next().toLowerCase();
						if (resp.equals("sim")) {
							produtos.remove(produto.getId());
						}
					}
				}
				if (!encontrado) {
					System.out.println("Produto não encontrado");
				}

				break;
			case 4:
				for (Produto Produtos : produtos) {
					System.out.println(Produtos.toString());
				}

				break;
			case 5:
				cond = false;
				System.out.println("Muito Obrigado!!");
				break;

			default:
				break;
			}
		}
	}
}

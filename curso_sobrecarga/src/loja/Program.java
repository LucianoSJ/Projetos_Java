package loja;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produtos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Produto: ");
		String produtos = sc.nextLine();
		
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		
		Produtos produto = new Produtos(produtos, valor);// Apertar Ctrl + Espaço
		
		System.out.println();
		System.out.println("Produto: " + produto);
		System.out.println();
		
		System.out.print("Enter com a quantidade que deseja inserir: ");
		int qtd = sc.nextInt();
		produto.addProduto(qtd);
		System.out.println();
		System.out.println("Entrada: " + produto);
		System.out.println();
		
		System.out.print("Enter com a quantidade que deseja remover: ");
		qtd = sc.nextInt();
		produto.retiraProduto(qtd);
		System.out.println();
		System.out.println("Saída: " + produto);
		sc.close();

	}

}

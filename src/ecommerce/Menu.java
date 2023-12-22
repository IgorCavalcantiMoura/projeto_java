package ecommerce;

import ecommerce.util.Cores;

import ecommerce.model.Produto;

import ecommerce.model.ProdutoRoupa;

import ecommerce.model.ProdutoLivro;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int opcao;
		
		ProdutoRoupa r1 = new ProdutoRoupa(321, 15, 10, "Blusa", 1, 38);
		r1.visualizar();
		
		ProdutoLivro l1 = new ProdutoLivro(541, 47, 8, "Harry Potter", 2, "Generation");
		l1.visualizar();
		
		while (true) {

			System.out.println(Cores.TEXT_WHITE + Cores.ANSI_BLUE_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                    MERCADO LIVRE                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar todos Produtos                ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Excluir Produto                      ");
			System.out.println("            6 - Comprar                              ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao = leia.nextInt();

			if (opcao == 7) {
				System.out.println("\nMercado Livre - Compre com um clique!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Cadastrar Produto\n\n");

					break;
				case 2:
					System.out.println("Listar todos Produtos\n\n");

					break;
				case 3:
					System.out.println("Consultar dados do Produto - por número\n\n");

					break;
				case 4:
					System.out.println("Atualizar dados do Produto\n\n");

					break;
				case 5:
					System.out.println("Apagar a Produto\n\n");

					break;
				case 6:
					System.out.println("Comprar\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
    
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Igor Cavalcanti Moura");
		System.out.println("Generation Brasil - icavalcantimoura@gmail.com");
		System.out.println("https://github.com/IgorCavalcantiMoura/projeto_java");
		System.out.println("*********************************************************");
	}
	

}

package ecommerce;

import ecommerce.util.Cores;
import ecommerce.controller.ProdutoController;
import ecommerce.model.Produto;

import ecommerce.model.ProdutoRoupa;

import ecommerce.model.ProdutoLivro;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int opcao, numero, quantidade , tipo, tamanho;
		float valor;
		String nome, editora;
		
		ProdutoController produto = new ProdutoController();
		
	
		
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
			//System.out.println("            4 - Atualizar Dados do Produto           ");
			System.out.println("            5 - Excluir Produto                      ");
			System.out.println("            6 - Comprar                              ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			if (opcao == 7) {
				System.out.println("\nMercado Livre - Compre com um clique!");
				sobre();
                 leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Cadastrar Produto\n\n");
					System.out.println("Digite o Número do Produto: ");
					numero = leia.nextInt();	
					System.out.println("Digite o Nome do Produto: ");
					leia.skip("\\R?");
					nome = leia.nextLine();
					System.out.println("Digite a quantidade do Produto: ");
					leia.skip("\\R?");
					quantidade = leia.nextInt();
					
					do {
						System.out.println("Digite o Tipo do Produto (1-Roupa ou 2-Livro): ");
						tipo = leia.nextInt();
					}while(tipo <1 && tipo >2);
					
					System.out.println("Digite o Preço do Produto (R$): ");
					valor = leia.nextFloat();
					
					switch(tipo) {
					case 1 -> {
						System.out.println("Digite o tamnaho: ");
						tamanho = leia.nextInt();
						produto.cadastrar(new ProdutoRoupa(numero, valor, quantidade,nome, tipo, tamanho));
					}
					case 2 -> {
						System.out.println("Digite a editora: ");
						editora = leia.nextLine();
						produto.cadastrar(new ProdutoLivro(numero, valor, quantidade, nome,tipo, editora));
					}
				}
					keyPress();
					break;
				case 2:
					System.out.println("Listar todos Produtos\n\n");
					produto.listarTodas();
					keyPress();
					break;
				case 3:
					System.out.println("Consultar dados do Produto - por número\n\n");
					System.out.println("Digite o número do produto: ");
					numero = leia.nextInt();
					keyPress();
					break;
				case 4:
					System.out.println("Atualizar dados do Produto\n\n");
					keyPress();
					break;
				case 5:
					System.out.println("Apagar a Produto\n\n");
					
					System.out.println("Digite o número do produto: ");
					numero = leia.nextInt();
					
					produto.deletar(numero);
					keyPress();
					break;
				case 6:
					System.out.println("Comprar\n\n");
					System.out.println("Digite o número do produto: ");
					numero = leia.nextInt();
					
					do {
						System.out.println("Digite a quantidade do produto: ");
						quantidade = leia.nextInt();	
					}while(quantidade <=0);
					
					produto.comprar(numero, quantidade);
					
					keyPress();
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					keyPress();
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
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}



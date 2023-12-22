package ecommerce.controller;

import java.util.ArrayList;

import ecommerce.model.Produto;
import ecommerce.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {
	
	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero =0;

	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaCollection(numero);
		
		if(produto != null)
			produto.visualizar();
		else
			System.out.println("\n Produto número: " + numero + " não foi encontrado!");
		
	}

	@Override
	public void listarTodas() {
		for(var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\n A produto número " + produto.getNumero() + " foi criado!");
		
	}

	@Override
	public void atualizar(Produto produto) {
		var buscaProduto = buscarNaCollection(produto.getNumero());
		if(buscaProduto != null) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produto);
			System.out.println("\n O produto número: " + produto.getNumero() + " foi atualizado com sucesso!");
		}else
			System.out.println("\n O produto número " + produto.getNumero() + "não foi encontrado!");
		
	}

	@Override
	public void deletar(int numero) {
		var produto = buscarNaCollection(numero);
		
		if(produto != null) {
			if(listaProdutos.remove(produto) == true);
			System.out.println("\n O produto número: " +  numero + " foi deletada com sucesso!");
		}else
			System.out.println("\n O produto: " + numero + " não foi encontrado!");
	}

	@Override
	public void comprar(int numero, int quantidade) {
		var produto = buscarNaCollection(numero);
		
		if (produto != null) {
			if(produto.comprar(quantidade) == true);
			System.out.println("\n Compra do produto " + numero + " foi efetuada com sucesso!");
		}else
			System.out.println("\n O produto numero: " + numero + " não foi encontrado!");
		
	}
	
	public Produto buscarNaCollection(int numero) {
		for(var produto : listaProdutos) {
			if(produto.getNumero()== numero) {
				return produto;
			}
		}
		return null;
	}

	}



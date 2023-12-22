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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comprar(int numero, float quantidade) {
		// TODO Auto-generated method stub
		
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



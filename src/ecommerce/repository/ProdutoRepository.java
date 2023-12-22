package ecommerce.repository;

import ecommerce.model.Produto;

public interface ProdutoRepository {
	
	
		public void procurarPorNumero(int numero);
		public void listarTodas();
		public void cadastrar(Produto conta);
		public void atualizar(Produto conta);
		public void deletar(int numero);
		public void comprar(int numero, float quantidade);
		

}

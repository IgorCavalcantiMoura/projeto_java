package ecommerce.model;

public class ProdutoLivro extends Produto {
	private String editora;

	public ProdutoLivro(int numero, float valor, int quantidade, String nome, int tipo, String editora) {
		super(numero, valor, quantidade, nome, tipo);
		this.editora = editora;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Editora: " + this.editora);
	}
    
	    
}

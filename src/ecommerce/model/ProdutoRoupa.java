package ecommerce.model;

public class ProdutoRoupa extends Produto {
 private int tamanho;

public ProdutoRoupa(int numero, float valor, int quantidade, String nome, int tipo, int tamanho) {
	super(numero, valor, quantidade, nome, tipo);
	this.tamanho = tamanho;
}

public int getTamanho() {
	return tamanho;
}

public void setTamanho(int tamanho) {
	this.tamanho = tamanho;
}
@Override
public void visualizar() {
	super.visualizar();
	System.out.println("Tamanho: " + this.tamanho);
}

}

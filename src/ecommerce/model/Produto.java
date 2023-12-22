package ecommerce.model;

public abstract class Produto {
	
	private int numero;
	private float valor;
	private int quantidade;
	private String nome;
	private int tipo;
	
	public Produto(int numero, float valor, int quantidade, String nome, int tipo) {
		super();
		this.numero = numero;
		this.valor = valor;
		this.quantidade = quantidade;
		this.nome = nome;
		this.tipo = tipo;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
public boolean comprar (int quantidade) { 
		
		if(this.getQuantidade() < quantidade) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
			
		this.setQuantidade(this.getQuantidade() - quantidade);
		return true;
	}
	
	public void visualizar() {
		
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Roupa";
		break;
		case 2:
			tipo = "Livro";
		break;
		}

		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("***********************************************************");
		System.out.println("Numero do produto: " + this.numero);
		System.out.println("Preço: " + this.valor);
		System.out.println("Quantidade: " + this.quantidade);
		System.out.println("Produto: " + this.nome);

	}
	

}

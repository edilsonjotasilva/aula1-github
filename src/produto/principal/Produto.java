package produto.principal;

public class Produto {
	String nome;
	double preco;
	int quantidade;
	

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		
	}
	
	public double valorEstoque() {
		return preco * quantidade;
	}

	public int adicionaProduto(int quant) {
		return this.quantidade += quant;
	}

	public int removeProduto(int quant) {
		return this.quantidade -= quant;
	}

	@Override
	public String toString() {
		return "Produto [Nome= " + nome + "\nPreco=" + preco + "\nQuantidade= " + quantidade + "\nValor Em Estoque "
				+ valorEstoque() + "]";
	}

}

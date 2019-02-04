package util;

public class ProdutoVetor {
	private String nome;
	private double preco;
	double maior;
	
	
	public ProdutoVetor(String nome, double preco) {
		this.preco = preco;
		this.nome = nome;
		
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "ProdutoVetor [nome=" + nome + ", preco=" + preco + "]";
	}
	



}

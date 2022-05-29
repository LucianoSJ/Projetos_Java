package entidade;

public class Produtos {
	
	public int idProduto, codBarras, qtd, estqueMinimo, idFornecedor;
	public String produto, dataCadastro;
	public double custo, valor;
	
// Construtor
	public Produtos(String produto, double valor, int qtd) {
		this.produto = produto;
		this.valor = valor;
		this.qtd = qtd;
		}

//Sobrecarga	
	public Produtos(String produto, double valor) {
		this.produto = produto;
		this.valor = valor;
		}
	
    public double valorTotalEmEstoque() {
    	return valor * qtd;
    }
    
    public void addProduto(int qtd) {
    	this.qtd += qtd;// recebe a this.qtd + this.qtd + qtd
    }
    
    public void retiraProduto(int qtd) {
    	this.qtd -= qtd;// recebe a this.qtd + this.qtd + qtd
    }
    
    public String toString() {
    	return produto
    		+ ", R$ "	
    		+ String.format("%.2f", valor)
    		+ ", "
    		+ qtd
    		+ " unidades, Total: R$ "
    		+ String.format("%.2f", valorTotalEmEstoque());
    }
}

package entidade;

public class Produtos {
	private String name;
	private double price;
	private int qtd;

	public Produtos() {
	}

	public Produtos(String name, double price, int qtd) {
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}

//Sobrecarga	
	public Produtos(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQtd() {
		return price;
	}

	public double valorTotalEmEstoque() {
		return price * qtd;
	}

	public void addProduto(int qtd) {
		this.qtd += qtd;// recebe a this.qtd + this.qtd + qtd
	}

	public void retiraProduto(int qtd) {
		this.qtd -= qtd;// recebe a this.qtd + this.qtd + qtd
	}

	public String toString() {
		return name + ", R$ " 
	                + String.format("%.2f", price) 
	                + ", " + qtd + " unidades, Total: R$ "
				    + String.format("%.2f", valorTotalEmEstoque());
	}
}
package entities;

public class Produto {

		public String name;
		public double price;
		public int quantity;
		
	public double totalValueInStock() {
		return price * quantity; //Ou seja vamos multiplicar preco vezes quantidade para saber total do valor
	}
	public void addProducts(int quantity) {
		this.quantity +=quantity; //This referencia como o atributo da classe
	}
	public void removeProduct(int quantity) {
		this.quantity -=quantity;
	}
	
	public String toString() {
		return name 
		+ ", $ "
		+ String.format("%.2f",price)
		+ ", "
		+ quantity
		+ " units: total: $ "
		+ String.format("%.2f",totalValueInStock());
		
	}
		

	}



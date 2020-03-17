package course;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Course {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto product = new Produto();
		System.out.println("Enter product data : ");
		System.out.print("Name: ");
		product.name=sc.nextLine();
		System.out.print("Price:");
		product.price =sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity=sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the numbe of products to be add in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("update data: " + product);
		
		System.out.println();
		System.out.println("Enter the numbe of products to be removed from stock: ");
		quantity=sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.println("update data: " + product);
		
		
		
		
		
		
		
		
		
		sc.close();
		
		
		

	}

}

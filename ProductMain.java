package com.expe;

import java.util.Scanner;

class ProductException extends Exception {
	ProductException(String s) {
		super(s);
	}
}

class Product {
	public void productPriceCheck(float price) {// member function
		try {
			if (price < 0 || price >= 10000) {
				throw new ProductException(" Invalid Product Price");
			}else {
				System.out.println("Valid Product price");
			}
		} catch (ProductException e) {
			e.printStackTrace();
		}

	}
}

public class ProductMain {

	public static void main(String[] args) {
		float price;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter product price");

		price=scan.nextFloat();
		System.out.println("product price is:"+price);
		Product pr = new Product();
		pr.productPriceCheck(price);
	}

}

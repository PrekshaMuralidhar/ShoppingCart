package com.shopping.cart;

import java.util.HashMap;
import java.util.Scanner;

import com.shopping.dao.CartDao;

public class Billing {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter the SKU quantity for product A");

	    int quantityA = myObj.nextInt(); // Read user input
	    System.out.println("Enter the SKU quantity for product B");

	    int quantityB = myObj.nextInt(); // Read user input
	    System.out.println("Enter the SKU quantity for product C");

	    int quantityC = myObj.nextInt(); // Read user input
	    System.out.println("Enter the SKU quantity for product D");

	    int quantityD = myObj.nextInt(); // Read user input
	
	    Cart cartObject=new Cart();
	    HashMap<String, Integer> cart=new HashMap<>();
	    cart.put("A", quantityA);
	    cart.put("B", quantityB);
	    cart.put("C", quantityC);
	    cart.put("D", quantityD);
	    cartObject.setCart(cart);
	    
	    
	    CartDao cartDao=new CartDao();
	    cartDao.totalBill(cartObject);
	}
}

package com.shopping.cart;

import java.util.HashMap;

public class Cart {

	private HashMap<String, Integer> cart=new HashMap<>();

	public Cart() {
		super();
	}

	public HashMap<String, Integer> getCart() {
		return cart;
	}

	public void setCart(HashMap<String, Integer> cart) {
		this.cart = cart;
	}
	
	
}

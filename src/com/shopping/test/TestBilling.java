package com.shopping.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.Test;

import com.shopping.cart.Cart;
import com.shopping.dao.CartDao;

public class TestBilling {
	CartDao cartDao=null;
	Cart cartObject=null;

	@Test
	public void testShoppingCartTest1() {
		
		cartDao=new CartDao();
		HashMap<String, Integer> cart=new HashMap<>();
	    cart.put("A", 1);
	    cart.put("B", 1);
	    cart.put("C", 1);
	    cart.put("D", 0);
	    cartObject=new Cart();
	    cartObject.setCart(cart);
	    
	   int actualBillAmount= cartDao.totalBill(cartObject);
	   assertEquals(100, actualBillAmount);
	}
	
	@Test
	public void testShoppingCartTest2() {
		
		cartDao=new CartDao();
		HashMap<String, Integer> cart=new HashMap<>();
	    cart.put("A", 5);
	    cart.put("B", 5);
	    cart.put("C", 1);
	    cart.put("D", 0);
	    cartObject=new Cart();
	    cartObject.setCart(cart);
	    
	   int actualBillAmount= cartDao.totalBill(cartObject);
	   assertEquals(370, actualBillAmount);
	}
	
	@Test
	public void testShoppingCartTest3() {
		
		cartDao=new CartDao();
		HashMap<String, Integer> cart=new HashMap<>();
	    cart.put("A",3);
	    cart.put("B", 5);
	    cart.put("C", 1);
	    cart.put("D", 1);
	    cartObject=new Cart();
	    cartObject.setCart(cart);
	    
	   int actualBillAmount= cartDao.totalBill(cartObject);
	   assertEquals(280, actualBillAmount);
	}
	
}

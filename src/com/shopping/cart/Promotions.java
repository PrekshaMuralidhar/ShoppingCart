package com.shopping.cart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Promotions {
	public final static int promoQuantity1 =3;
	public final static int promoQuantity2 =2;
	public final static int promoQuantity3 =1;
	public final static int promoQuantity4 =1;
	public final static int discountForProduct1 =130;
	public final static int discountForProduct2 =45;
	public final static int discountForProducts =30;
	public static final String Product1 ="A";
	public static final String Product2 ="B";
	public static final String Product3 ="C";
	public static final String Product4="D";
	public static final String CombinedPromo="C&D";
	
	
	 public Promotions() {
		super();
		// TODO Auto-generated constructor stub
	}

	 public HashMap<String,Object> getPromotions() {
		 
		Object[][]  promo3,promo2,promo1 = null;
		 
	    promo1=new Object[][] {{Product1,promoQuantity1,discountForProduct1}};
	    promo2=new Object[][] {{Product2,promoQuantity2,discountForProduct2}};
	    promo3=new Object[][]{{promoQuantity3,Product3},{promoQuantity4,Product4},{discountForProducts}};  
		HashMap<String,Object> promotionCodes=new HashMap<>();
		promotionCodes.put(Product1, promo1);
		promotionCodes.put(Product2, promo2);
		promotionCodes.put(CombinedPromo, promo3);
		
		return promotionCodes;
		 
	 }
	
		
		
	

}	
	
	
	
	

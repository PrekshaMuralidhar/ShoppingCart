package com.shopping.dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.shopping.cart.Cart;
import com.shopping.cart.Promotions;

public class CartDao {

	public static final int rateOfA = 50;
	public static final int rateOfB = 30;
	public static final int rateOfC = 20;
	public static final int rateOfD = 15;
	public static final String Product1 = "A";
	public static final String Product2 = "B";
	public static final String Product3 = "C";
	public static final String Product4 = "D";
	HashMap<String, Integer> rates = null;

	public CartDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int totalBill(Cart cartObject) {

		rates = new HashMap<>();
		rates.put(Product1, rateOfA);
		rates.put(Product2, rateOfB);
		rates.put(Product3, rateOfC);
		rates.put(Product4, rateOfD);

		Promotions promo = new Promotions();
		HashMap promotions = promo.getPromotions();
		Set set = promotions.entrySet();
		Iterator it = set.iterator();
		int totalBill = 0;
		while (it.hasNext()) {
			int billProduct = 0;
			Map.Entry entry = (Map.Entry) it.next();
			if ((entry.getKey()).toString().length() < 2) {
				//Promotion for "N" items of single product
				Object[][] value = (Object[][]) entry.getValue();
				int modulus = (Integer) (value[0][1]);
				int discountPrice = (Integer) (value[0][2]);
				;
				int quantity = cartObject.getCart().get(entry.getKey());
				billProduct = ((quantity / modulus) * discountPrice)
						+ ((quantity % modulus) * rates.get(entry.getKey()));
			} else {
				//Promotion for combined products
				String key = (String) entry.getKey();
				String[] keys = key.split("&");
				Object[][] promotion = (Object[][]) entry.getValue();
				int quantityA = cartObject.getCart().get(keys[0]);
				int quantityB = cartObject.getCart().get(keys[1]);

				if (quantityA > quantityB) {
					billProduct = (quantityB * rates.get(keys[1])) +

							((quantityA - quantityB) * rates.get(keys[0]));
				} else if (quantityA == quantityB) {
					billProduct = (quantityB * ((Integer) (promotion[2][0])));

				}

				else {
					billProduct = (quantityA * rates.get(keys[0])) + ((quantityB - quantityA) * rates.get(keys[1]));
				}

			}

			totalBill = totalBill + billProduct;
		}

		System.out.println("Total Bill after applying promotions : " + totalBill);

		return totalBill;
	}

}

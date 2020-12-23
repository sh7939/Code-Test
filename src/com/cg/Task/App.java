package com.cg.Task;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String args[]) {
		App app = new App();
		app.enquiry("Watch EUR (330x0.9)", "USD (330)");// Watch EUR (330x0.9),
														// USD (330)
		app.insert(4, "phone", 650d);

	}

	public void enquiry(String itemName, String currencyAlpha) {

		List<Product> plist = new ArrayList<>();

		Product p1 = new Product(1, "Watch", 330.00);
		Product p2 = new Product(2, "LED Remote", 40.00);
		Product p3 = new Product(3, "Laptop", 800.00);
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		List<ExchangeRate> exlist = new ArrayList<>();

		ExchangeRate e1 = new ExchangeRate("EUR", 0.9);
		ExchangeRate e2 = new ExchangeRate("INR", 70);

		exlist.add(e1);
		exlist.add(e2);

		double price = 0.0;
		for (Object p : plist) {
			Product pp = (Product) p;
			if (pp.getItemName().equals(itemName)) {
				for (Object e : exlist) {
					ExchangeRate ex = (ExchangeRate) e;
					if (ex.getCurrencyAlpha().equals(currencyAlpha)) {
						price = pp.getItemCost() * ex.getCurrencyValue();
					}
				}
			}
		}

		System.out.println(itemName + " Price is USD 330.00" + "with exchange rate 0.9 is " + price);
	}

	public void insert(Integer itemID, String itemName, Double itemCost) {

		List<Product> plist = new ArrayList<>();
		Product p = new Product(itemID, itemName, itemCost);
		plist.add(p);
		System.out.println("Insertion is done successfully...");

	}

}

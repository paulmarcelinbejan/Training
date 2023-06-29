package com.paulmarcelinbejan.training.designpattern.behavioral.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import com.paulmarcelinbejan.training.designpattern.behavioral.strategy.example.Order;
import com.paulmarcelinbejan.training.designpattern.behavioral.strategy.example.PayByCreditCard;
import com.paulmarcelinbejan.training.designpattern.behavioral.strategy.example.PayByPayPal;
import com.paulmarcelinbejan.training.designpattern.behavioral.strategy.example.PayStrategy;

// Strategy Design Pattern
//
// Lo Strategy pattern va usato:
//  - quando si vogliono usare diverse varianti di un algoritmo all'interno di un oggetto ed essere in grado di passare da un algoritmo all'altro durante l'esecuzione.
//  - quando si hanno molte classi simili che differiscono solo per il modo in cui eseguono alcuni comportamenti.
//
// Lo Strategy consente di definire una famiglia di algoritmi, inserire ciascuno di essi in una classe separata e rendere i loro oggetti intercambiabili.
public class StrategyDesignPattern {

	private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static Order order = new Order();
	private static PayStrategy strategy;

	static {
		priceOnProducts.put(1, 2200);
		priceOnProducts.put(2, 1850);
		priceOnProducts.put(3, 1100);
		priceOnProducts.put(4, 890);
	}

	public static void main(String[] args) throws IOException {
		while (!order.isClosed()) {
			int cost;

			String continueChoice;
			do {
				System.out.print("""
						Please, select a product:\

						1 - Mother board\

						2 - CPU\

						3 - HDD\

						4 - Memory\

						""");
				int choice = Integer.parseInt(reader.readLine());
				cost = priceOnProducts.get(choice);
				System.out.print("Count: ");
				int count = Integer.parseInt(reader.readLine());
				order.setTotalCost(cost * count);
				System.out.print("Do you wish to continue selecting products? Y/N: ");
				continueChoice = reader.readLine();
			} while ("Y".equalsIgnoreCase(continueChoice));

			if (strategy == null) {
				System.out.println("""
						Please, select a payment method:\

						1 - PalPay\

						2 - Credit Card""");
				String paymentMethod = reader.readLine();

				// Client creates different strategies based on input from user,
				// application configuration, etc.
				if ("1".equals(paymentMethod)) {
					strategy = new PayByPayPal();
				} else {
					strategy = new PayByCreditCard();
				}
			}

			// Order object delegates gathering payment data to strategy object,
			// since only strategies know what data they need to process a
			// payment.
			order.processOrder(strategy);

			System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
			String proceed = reader.readLine();
			if ("P".equalsIgnoreCase(proceed)) {
				// Finally, strategy handles the payment.
				if (strategy.pay(order.getTotalCost())) {
					System.out.println("Payment has been successful.");
				} else {
					System.out.println("FAIL! Please, check your data.");
				}
				order.setClosed();
			}
		}
	}

}

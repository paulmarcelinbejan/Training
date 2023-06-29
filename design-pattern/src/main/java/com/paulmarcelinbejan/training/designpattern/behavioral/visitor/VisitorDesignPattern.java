package com.paulmarcelinbejan.training.designpattern.behavioral.visitor;

import com.paulmarcelinbejan.training.designpattern.behavioral.visitor.example.Book;
import com.paulmarcelinbejan.training.designpattern.behavioral.visitor.example.Fruit;
import com.paulmarcelinbejan.training.designpattern.behavioral.visitor.example.ItemElement;
import com.paulmarcelinbejan.training.designpattern.behavioral.visitor.example.ShoppingCartVisitor;
import com.paulmarcelinbejan.training.designpattern.behavioral.visitor.example.ShoppingCartVisitorImpl;

// Visitor Design Pattern
//
// Il Visitor pattern va usato:
//  - per ripulire la logica di business dei comportamenti ausiliari.
//  - quando un comportamento ha senso solo in alcune classi di una gerarchia di classi, ma non in altre.
//
// Il Visitor consente di separare gli algoritmi dagli oggetti su cui operano.
public class VisitorDesignPattern {

	public static void main(String[] args) {
		ItemElement[] items = { new Book(20, "1234"), new Book(100, "5678"),
				new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple") };

		int total = calculatePrice(items);
		System.out.println("Total Cost = " + total);
	}

	private static int calculatePrice(ItemElement[] items) {
		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (ItemElement item : items) {
			sum = sum + item.accept(visitor);
		}
		return sum;
	}

}

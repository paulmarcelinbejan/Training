package com.paulmarcelinbejan.training.designpattern.behavioral.visitor.example;

public interface ShoppingCartVisitor {

	int visit(Book book);

	int visit(Fruit fruit);

}

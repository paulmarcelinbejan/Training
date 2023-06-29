package com.paulmarcelinbejan.training.designpattern.behavioral.visitor.example;

public interface ItemElement {

	int accept(ShoppingCartVisitor visitor);

}

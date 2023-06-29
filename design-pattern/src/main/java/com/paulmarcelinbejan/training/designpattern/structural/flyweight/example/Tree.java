package com.paulmarcelinbejan.training.designpattern.structural.flyweight.example;

import java.awt.Graphics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Tree {

	private int x;
	private int y;
	private TreeType type;

	public void draw(Graphics g) {
		type.draw(g, x, y);
	}
}

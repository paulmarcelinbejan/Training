package com.paulmarcelinbejan.training.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

import com.paulmarcelinbejan.training.designpattern.creational.prototype.example.Rectangle;
import com.paulmarcelinbejan.training.designpattern.creational.prototype.example.Shape;
import com.paulmarcelinbejan.training.designpattern.creational.prototype.example.TinyCircle;

// Il Prototype Pattern va usato:
//  - quando la creazione di un oggetto è costoso in termini di tempo e risorse e abbiamo già un oggetto simile esistente.
//
// Il Prototype Pattern infatti fornisce un meccanismo di copia dell'oggetto originale in uno nuovo:
// per esempio :
//  - attraverso l'implementazione dell'interfaccia Cloneable.
//  - la creazione di un costruttore che prende come parametro un oggetto dello stesso tipo, e copia tutti i campi dal source in una nuova istanza target.
//
// Da fare massima attenzione, tra shallow copy e deep copy.
public class PrototypeDesignPattern {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		List<Shape> shapesCopy = new ArrayList<>();

		TinyCircle circle = new TinyCircle();
		circle.x = 10;
		circle.y = 20;
		circle.radius = 15;
		circle.color = "red";
		shapes.add(circle);

		TinyCircle anotherCircle = (TinyCircle) circle.clone();
		shapes.add(anotherCircle);

		Rectangle rectangle = new Rectangle();
		rectangle.width = 10;
		rectangle.height = 20;
		rectangle.color = "blue";
		shapes.add(rectangle);

		cloneAndCompare(shapes, shapesCopy);
	}

	private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
		for (Shape shape : shapes) {
			shapesCopy.add(shape.clone());
		}

		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) != shapesCopy.get(i)) {
				System.out.println(i + ": Shapes are different objects (yay!)");
				if (shapes.get(i).equals(shapesCopy.get(i))) {
					System.out.println(i + ": And they are identical (yay!)");
				} else {
					System.out.println(i + ": But they are not identical (booo!)");
				}
			} else {
				System.out.println(i + ": Shape objects are the same (booo!)");
			}
		}
	}

}

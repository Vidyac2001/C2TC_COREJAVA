package com.cg.abstractclassdemo;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square s = new Square();
		s.calArea();
		s.show();
		
	

		Rectangle r = new Rectangle();
		r.calArea();
		r.show();

		// dynamic binding//runtime poly//late binding

		Shape shape;
		shape = new Square(3.0f);
		shape.calArea();
		shape.show();

		shape = new Rectangle(10, 20);
		shape.calArea();
		shape.show();

	}

}

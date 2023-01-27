package com.lq.exercies;

public class boxDriver {

	
	public static void main(String[] args) {
//		Exercise 1: Creating Objects
		Box box1 = new Box(0,6,7);
		Box box2 = new Box(10);
		
		System.out.println("Box 1 Length is "+box1.getLength());
		System.out.println("Box 1 Width is "+box1.getWidth());
		System.out.println("Box 1 Height is "+box1.getHeight());
		System.out.println("Box 2 Length is "+box2.getLength());
		System.out.println("Box 2 Width is "+box2.getWidth());
		System.out.println("Box 2 Height is "+box2.getHeight());

//		Exercise 2: Test Business Methods
		/*		4.Call each set method for box1
		changing the values to the following
		and then use the get methods*/
		box1.setLength(3);
		box1.setWidth(4);
		box1.setHeight(5);
		
		System.out.println("Box 1 Length is "+box1.getLength());
		System.out.println("Box 1 Width is "+box1.getWidth());
		System.out.println("Box 1 Height is "+box1.getHeight());
	
//		5.Call the getSurfaceArea()
		double surface= box1.getSurfaceArea();
//		Call the getVolume()
		double volume = box1.getVolume();
		System.out.println("Box 1 Volume is "+volume+ " cube units and its Surface Area is "+surface+" square units");
		
//		6.Execute the printBox() for box1
		box1.printBox();
		
//		7. Using the setLength()
		System.out.println();
		box1.setLength(-5);
		box1.printBox();
	}
}
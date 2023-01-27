package com.lq.exercies;

//Exercise 1: Creating Classes and Attributes
public class Box {

	private double height,width,length;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height=height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length=length;
	}
	
//	 Exercise 2: Create Constructors
	
	Box(double length, double width, double height){
		this.length=length;
		this.width=width;
		this.height=height;
	}
	
	Box(double a){
		this(a,a,a);
	}
	
//	Exercise 3: Create Business Methods
	public double getVolume() {
		return (length*width*height);
	}
	
	public double getSurfaceArea() {
		double surface=((length*width)+(length*height)+(height*width))*2;
		return surface;
	}

//	Exercise 4: Create a printBox Method
	
	public void printBox() {
		if(length<=0||width<=0||height<=0) {
			System.out.println("Invalid values");
		}
		else {
			System.out.printf("Length = %d\nWidth = %d\nHeight = %d\nVolume = %d\nSurface Area = %d",getLength(),getWidth(),getHeight(),getVolume(),getSurfaceArea());
		}
	}

}

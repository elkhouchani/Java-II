package com.lq.exercies;

//Exercise 1: Creating Classes and Attributes
public class Box {

	private double height,width,length;
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height<=0) 
			System.out.println("Height must be greater than 0");
		else
			this.height=height;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width<=0) 
			System.out.println("Width must be greater than 0");
		else
			this.width=width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if(length<=0) 
			System.out.println("Length must be greater than 0");
		else
			this.length=length;
	}
	
//	 Exercise 2: Create Constructors
	
	Box(double length, double width, double height){
		if(length<=0 || width<=0||height<=0)
		{
			this.length =2;
			this.height=1;
			this.width=1;
		}
		else 
		{
			this.length=length;
			this.width=width;
			this.height=height;
		}
		
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
			System.out.printf("Length = %f\nWidth = %f\nHeight = %f\nVolume = %f\nSurface Area = %f",getLength(),getWidth(),getHeight(),getVolume(),getSurfaceArea());
		}
	}

}

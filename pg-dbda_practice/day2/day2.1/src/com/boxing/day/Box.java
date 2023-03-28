package com.boxing.day;

public class Box {
	//fields 
	private double width;
	private double depth;
	private double height;
	
	public Box(double width, double depth, double height) {
		this.width=width;
		this.depth=depth;
		this.height=height;
	}//end of parameterized ctor
	
	public String getBoxDims() {
		return "Dims for the box: "+this.width+" "+this.depth+" "+this.height;
	}//end of getBoxDims method
	
	public double getBoxVol() {
		System.out.print("The vol of the box: ");
		return this.width*this.depth*this.height;
	}//end of getBoxVol method

}//end of Box class

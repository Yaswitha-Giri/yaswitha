package com.abc.graphics;
public class Rectangle
{
	private double length,breadth;
	public Rectangle(){}
	public Rectangle(double length,double breadth)
	{
		this.length=length; this.breadth=breadth;
	}
	public double area()
	{
		return length*breadth;
	}
}
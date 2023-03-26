package p1;

public class Circle extends BoundedShape
{
	double radius;
	public Circle(int x,int y,double radius)
	{
		super(x,y);
		this.radius=radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	//added implementation of abstract method in derived class 
	public double area()
	{
		return Math.PI*radius*radius;
	}
}

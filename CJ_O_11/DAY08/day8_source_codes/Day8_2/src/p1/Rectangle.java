package p1;

public class Rectangle extends BoundedShape
{
	double width,height;
	
	public Rectangle(int x,int y,double width,double height)
	{
		super(x,y);
		this.width=width;
		this.height=height;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	public double area()
	{
		return width*height;
	}
	
}

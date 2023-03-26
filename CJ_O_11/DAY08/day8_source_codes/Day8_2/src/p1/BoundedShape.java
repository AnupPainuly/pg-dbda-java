package p1;

public abstract class BoundedShape 
{
	int x,y;
	
	public BoundedShape(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "BoundedShape [x=" + x + ", y=" + y + "]";
	}
	//when we specify any method as abstract
	// we just simply supply declaration
	
	public abstract double area();
}

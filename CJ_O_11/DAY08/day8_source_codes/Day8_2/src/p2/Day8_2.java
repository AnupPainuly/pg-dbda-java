package p2;

import p1.*;

public class Day8_2 {

	public static void main(String[] args) 
	{
		BoundedShape bs[]= {new Circle(3,2,6),new Rectangle(6,7,5,7)};
		for(BoundedShape b : bs)
		{	
			System.out.println(b);
			System.out.println("Area = "+b.area());
		}
	}
}



/*
public class Day8_2 {

	public static void main(String[] args) 
	{
		BoundedShape bs[]= {new Circle(3,2,5),new Rectangle(6,7,8,9)};
		System.out.println("Circle Area method is called "+bs[0].area());
		System.out.println("Rectangle area method is called "+bs[1].area());
		
	}
}

*/

/*
public class Day8_2 {

	public static void main(String[] args) 
	{
		Circle c1=new Circle(5,4,3);
		System.out.println("Area of Circle = "+c1.area());
		System.out.println(c1);
		
		Rectangle r1=new Rectangle(2,4,6,8);
		System.out.println("Area of Rectagle "+r1.area());
		System.out.println(r1);
	}

}


*/
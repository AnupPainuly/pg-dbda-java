
//car is-a vehicle
class Vehicle
{	
	private int vid;
	private String color;
	
	public Vehicle() 
	{
		super();
	}

	public Vehicle(int vid, String color) 
	{
		super();
		this.vid = vid;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", color=" + color + "]";
	}
	
	
	
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void disp() // overridden method 
	{
		System.out.println("Vehicle ID = "+this.vid+" Color = "+this.color);
	}
	
		
}

class Car extends Vehicle
{
	private int cid;
	private int price;
	
	public Car() 
	{
		super();
	}
	public Car(int vid, String color,int cid,int price) 
	{
		super(vid, color);
		this.cid=cid;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	void disp() //function overriding 
	{
		super.disp(); 
		System.out.println("Car ID = "+this.cid+" Price = "+this.price);
	}
	
}

class Bike extends Vehicle
{
	private int engine_number;
	private int cost;
	public int getEngine_number() {
		return engine_number;
	}
	public void setEngine_number(int engine_number) {
		this.engine_number = engine_number;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int vid, String color,int engine_number, int cost) 
	{
		super(vid, color);
		this.engine_number = engine_number;
		this.cost = cost;
		
	}
	
	void disp()
	{
		super.disp();
		System.out.println("Engine number = "+this.engine_number);
		System.out.println("Cost = "+this.cost);
	}
}


public class Day8_1 
{
	public static void main(String[] args)
	{
		Car c1=new Car();
		c1.disp();
		
		Car c2=new Car(123,"White",456,10);
		c2.disp();
		System.out.println();
		
		Bike b1= new Bike();
		b1.disp();
		Bike b2=new Bike(987,"black",232,70000);
		b2.disp();
	}

}

package p1;

public interface Printer 
{
	//for every data member inside interface
	// javac adds public static final 
	
	double DATA = 1234.56;
	
	//by default each method inside the interface
	//is considered by javac as public abstract 
	void print(String msg);
}

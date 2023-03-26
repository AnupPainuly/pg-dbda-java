class Test{
	int num1;
	int num2;
	
	Test(){
		this.num1=0;
		this.num2=0;
	}
	
	Test(int num1, int num2){
		this.num1=num1;
		this.num2=num2;
	}
	void display() {
		System.out.printf("%d %d",num1, num2);
	}
	
}
public class Day4_8 {
	public static void main(String[] args) {
		Test t1=new Test(31,64);
		final Test t2=new Test(53, 646); //final object
		Test t3=new Test(64, 686);
		final Test t4=t1; //final ref. also this an e.g. of ref copy.
		t1.display();
		t2.display();
		t3.display();
		t4.display();
		//t4=t1; //can not reassign final ref.
		//t2=new Test(4242, 46464);//can not modify final object
		
		
	}
}

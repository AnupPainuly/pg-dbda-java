import java.util.ArrayDeque;

//ArrayDeque
public class Day12_8 {

	public static void main(String[] args) {
		ArrayDeque<Integer> a1=new ArrayDeque<Integer>();
		a1.add(32);
		a1.add(22);
		a1.add(10);
		a1.add(20);
		a1.add(30);
		System.out.println("Array Deque = "+a1);
		System.out.println("remove first "+a1.removeFirst());
		System.out.println("element = "+a1.element());
	}

}

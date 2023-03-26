import java.util.Stack;

public class Day12_3 {

	public static void main(String[] args)
	{
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		System.out.println("Stack = "+stk);
		System.out.println("Top Element = "+stk.peek());
		System.out.println("Pop method = "+stk.pop());
		System.out.println("Stack = "+stk);
		System.out.println("is stack is empty ? "+stk.empty());
		System.out.println("search element 40 = "+stk.search(40));
		//1-based position
		// which ever is top element it is considered as at first position (1)
		System.out.println("search element 20 = "+stk.search(20));
		System.out.println("search element 88 = "+stk.search(88));

	}

}
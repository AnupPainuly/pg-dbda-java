import java.util.function.BiFunction;

// Method reference to static method of a class


class Multiplication
{
	public static int multiply(int a,int b)
	{
		return a * b;
	}
}

public class Day16_9 {

	public static void main(String[] args)
	{
		BiFunction<Integer,Integer,Integer> ref = Multiplication::multiply;
		int result = ref.apply(4, 3);
		System.out.println("Result = "+result);
	}

}

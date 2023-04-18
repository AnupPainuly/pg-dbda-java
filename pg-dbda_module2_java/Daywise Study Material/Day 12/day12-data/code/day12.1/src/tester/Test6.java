package tester;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test6 {

	public static void main(String[] args) {
		// attach stream to int[] (src) --filter even nos : intermediate op -- display
		// even nos : terminal op.
		int[] data = { 10, 11, 21, 67, 34, 13, 78, 45, 49, 72, 73, 100 };
		// Arrays.stream(int[] data) ---> IntStream
		IntStream stream = Arrays.stream(data) // IntStream : 10....100
				.filter(i -> i % 2 == 0); // IntStream : even nos --intermediate
		stream.forEach(even -> System.out.print(even + " ")); // terminal op
		// un comment next line to understand run time err : IllegalStateExc : strm is
		// alrdy closed!!
//		stream.forEach(even -> System.out.print(even+" ")); //terminal op

	}

}

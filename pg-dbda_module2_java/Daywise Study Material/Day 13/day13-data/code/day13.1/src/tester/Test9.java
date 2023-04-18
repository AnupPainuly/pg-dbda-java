package tester;

import java.util.stream.IntStream;

public class Test9 {

	public static void main(String[] args) {
		// print sum of all odd numbers in the range 1-100
//rangeClosed, filter ,sum
		int sum=IntStream.rangeClosed(1, 100)//Intstream 1-100
		.filter(i -> i % 2 !=0) //int strm of odd nums
		.sum();//terminal op.
		System.out.println("sum ="+sum);
	}

}

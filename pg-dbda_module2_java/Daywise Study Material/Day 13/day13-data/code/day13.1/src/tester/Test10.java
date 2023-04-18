package tester;

import java.util.stream.IntStream;

public class Test10 {

	public static void main(String[] args) {
		// print sum of squares all odd numbers in the range 1-100
//rangeClosed, filter ,map ,sum
		int sum=IntStream.rangeClosed(1, 100)//Intstream 1-100
		.filter(i -> i % 2 !=0) //int strm of odd nums
		.map(i -> i*i) //int strm of sq. odd nums
		.sum();//terminal op.
		System.out.println("sum ="+sum);
	}

}

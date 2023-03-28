package com.primal.types;

public class TestingPrimitiveTypes {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2=12;
		//byte b3=b1+b2;//can not convert from to int to byte
		//fixing the above error by type casting
		byte b3=(byte)(b1+b2);
		
	}

}
/*
 * 
 * There are 8 primitive data types in java. char, boolean and rest on the line 19.
 * widening is converting lower data type to higher data type. widening is done automatically by the compiler
 * narrowing is converting higher data type to lower data type. This need type casting.
 * double>float>long>int>short>byte
 * 
*/
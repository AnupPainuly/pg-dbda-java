//First Java Application

/*
Author: Akshita Chanchlani
Organization : Sunbeam
Date : 13th Feb 2023
*/

// Normally we write main() method inside the class
// name of the class in which main() is present is 
//same as the file name 
class Demo
{
    public static void main(String args[])
    {
         System.out.println("Hello Everyone!!");
    } //end of main()
} //end of Demo class

// To compile 
 // javac Demo.java
// To execute
 // java Demo
// to view the class file
 // javap  -c  Demo.class

 //public
 // since main is called by OS , outside its scope 

 //static
// because we do not create the object of the class
// in which main() is residing
//so we declare main() as static

 //void
 //main() is not returning any value ,so its return type is void
 
 //main()
 // entry point function (method) 

 //String args[]
// Are used for taking command line arguments 

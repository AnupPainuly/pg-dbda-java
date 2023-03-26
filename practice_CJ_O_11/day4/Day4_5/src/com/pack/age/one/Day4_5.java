package com.pack.age.one;

import com.pack.age.two.*;

public class Day4_5 {
	public static void main(String[] args) {
		Employee eobj=new Employee();
		eobj.accept();
		Manager mobj=new Manager();
		mobj.accept();

		eobj.display();
		mobj.display();
		
	}

}

//note to self: please think twice before sc.close.
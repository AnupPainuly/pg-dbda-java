package com.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.core.app.Product;

public interface ShopUtils {
	//adding a static method to return the list of some products
	static List<Product> populateProductList(){
		List<Product> list = new ArrayList<>();
		list.add(new Product(0, "Bread",100.2,LocalDate.parse("2020-01-01")));
		list.add(new Product(0,"Jam",10.2,LocalDate.parse("2020-01-04")));
		return list;
	}//end of populateProductList method
	
	static Map<Integer, Product> populateProductMap(List<Product> productList){
		Map<Integer, Product> map = new HashMap<>();
		for(Product p:productList) {
			map.put(p.getId(),p);
		}
		System.out.println("poulated product map");
		return map;
	}//end of populateProductMap

	Map<Integer, Product> productMap = populateProductMap(populateProductList());
	static void displayProductList(Map<Integer, Product> map) {
		System.out.println("displaying product map functionally");
		productMap.forEach((k,v) ->{
			System.out.println(k+" : "+v);
		});
	}//end of displayProductList method
}

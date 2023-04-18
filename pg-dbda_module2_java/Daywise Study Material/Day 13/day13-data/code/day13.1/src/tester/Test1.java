package tester;

import java.util.List;

import com.shop.core.Category;
import com.shop.core.Product;
import static utils.ShopUtils.populateProductList;

import utils.ShopUtils;

public class Test1 {

	public static void main(String[] args) {
		// get product list from the utils
		List<Product> productList = populateProductList();
		productList.stream()//Stream<Product> : src
		.forEach(p -> System.out.println(p));//terminal op.
		//filter all products with category=fruits n display them
		System.out.println("filter list");
		productList.stream() //Stream<Product> 
		.filter(p -> p.getProductCategory()==Category.FRUITS) //Stream<Product> : fruits
		.forEach(p -> System.out.println(p));
		
		
		
		

	}

}

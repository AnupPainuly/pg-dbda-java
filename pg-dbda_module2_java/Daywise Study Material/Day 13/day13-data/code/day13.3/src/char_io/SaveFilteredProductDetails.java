package char_io;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.shop.core.Product;

import utils.IOUtils;
import utils.ShopUtils;

//Save details of the filtered products in text file
public class SaveFilteredProductDetails {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			//0. get sample products
			List<Product> productList = ShopUtils.populateProductList();
			System.out.println("all products");
			productList.forEach(System.out::println);
			//1. accept inputs
			System.out.println("Enter min price , max price");
			double min=sc.nextDouble();
			double max=sc.nextDouble();
			System.out.println("Enter file name");
			String fileName=sc.next();
			//2 filter data n collect it in a list
			List<Product> filteredProducts = productList.stream()
			.filter(p -> p.getPrice()>min && p.getPrice()<max) //Stream of filtered products
			.collect(Collectors.toList());
			//Invoke a static  method of IOUtils i/f , to store filtered products in the text file
			IOUtils.storeProducts(filteredProducts,fileName);
			System.out.println("products stored ....");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}

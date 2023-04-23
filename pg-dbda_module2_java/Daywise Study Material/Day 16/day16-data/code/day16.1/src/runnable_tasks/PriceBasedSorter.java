package runnable_tasks;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Map;
import java.util.stream.Stream;

import com.shop.core.Product;

public class PriceBasedSorter implements Runnable {
	// state
	private Map<Integer, Product> products;
	private String fileName;

	public PriceBasedSorter(Map<Integer, Product> products, String fileName) {
		super();
		this.products = products;
		this.fileName = fileName;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
		 Stream<Product> sortedProductStream = products.values() //Collection<Product>
		 .stream() //Stream<Product>
		 .sorted((p1,p2) -> ((Double)p1.getPrice()).compareTo(p2.getPrice()));
		 //I/O stream 
		 //Java app --> pw --> fw --> file
		 try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		 {
			 sortedProductStream.forEach(p -> pw.println(p));//pw::println
		 }//pw.close() --data will be save d in text file
		 System.out.println("sorted product details as per price saved!");
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " got exc " + e);
		}
		System.out.println(Thread.currentThread().getName() + " over");

	}

}

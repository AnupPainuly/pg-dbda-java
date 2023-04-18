package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehiclePriceComparator implements Comparator<Vehicle> {
//asc order for vehicle price
	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		System.out.println("in vehicle price comparator : desc");
		if (o1.getBasePrice() < o2.getBasePrice())
			return 1;
		if (o1.getBasePrice() == o2.getBasePrice())
			return 0;
		return -1;
	}

}

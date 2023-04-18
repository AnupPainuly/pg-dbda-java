package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehicleDatePriceComparator implements Comparator<Vehicle>{

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		System.out.println("in vehicle date price comp");
		int ret=o1.getManufactureDate().compareTo(o2.getManufactureDate());
		if(ret == 0) //dates same --> proceed to price based comparison
			return ((Double)o1.getBasePrice()).compareTo(o2.getBasePrice());
		return ret;
	}

}

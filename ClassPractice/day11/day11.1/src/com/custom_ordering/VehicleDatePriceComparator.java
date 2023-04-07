package com.custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehicleDatePriceComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		System.out.println("in vehicle price comparator: asc");
//		if (o1.getManufactureDate().isAfter(o2.getManufactureDate()))
//			return -1;
//		if (o1.getManufactureDate() == o2.getManufactureDate())
//		{
//			if (o1.getBasePrice() < o2.getBasePrice())
//				return -1;
//			if (o1.getBasePrice() == o2.getBasePrice())
//				return 0;
//			return 1;
//		}
//		return 1;

		int ret = o1.getManufactureDate().compareTo(o2.getManufactureDate());
		if (ret == 0)
			return ((Double) o1.getBasePrice()).compareTo(o2.getBasePrice());
		return ret;

	}

}

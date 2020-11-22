package com.collec;
import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class CompartorClass implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Customer c1 = (Customer) o1;
		Customer c2 = (Customer) o2;
		if (c1.accno < c2.accno) {
			return 1;
		} else {
			return -1;
		}
	}

}

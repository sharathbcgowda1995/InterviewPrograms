package com.java.concepts;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {

	public static void main(String[] args) {
		List<Laptop> laptop = new ArrayList<>();
		laptop.add(new Laptop(51000, 12, "HP"));
		laptop.add(new Laptop(52000, 16, "Dell"));
		laptop.add(new Laptop(50000, 8, "Lenovo"));

		for (Laptop lp : laptop) {
			System.out.println(lp);
		}

		Comparator<Laptop> cmp = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if (o1.getPrice() > o2.getPrice()) {
					return 1;
				} else if (o1.getPrice() < o2.getPrice()) {
					return -1;
				} else {
					return 0;
				}
			}
		};
		
		Collections.sort(laptop, cmp);

		// Collections.sort(laptop);//this will work with two comparator and comparable

		for (Laptop lp : laptop) {
			System.out.println(lp);
		}
	}
}

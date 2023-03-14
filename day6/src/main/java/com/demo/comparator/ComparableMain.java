package com.demo.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		Laptop laps = new Laptop(12, "HP", "Elitebook");
		Laptop laps2 = new Laptop(6, "Lenovo", "Ideapad");
		Laptop laps3 = new Laptop(8, "Dell", "Insprion");

		List<Laptop> laplist = new ArrayList<>();
		laplist.add(laps);
		laplist.add(laps2);
		laplist.add(laps3);

		Collections.sort(laplist);

		System.out.println(laplist);

		/*
		 * -----------------------------------------------------------------------------
		 * ----------
		 */

		Comparator<Laptop> comp = new Comparator<>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				if (o1.getRam() > o2.getRam()) {
					return 1;

				}

				else {
					return -1;

				}

			}

		};

		Collections.sort(laplist, comp);

		System.out.println(laplist);

	}

}

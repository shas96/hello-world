package com.lae.sample.add.numbers;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		AddNumbers addNumbers = new AddNumbers();
		List<Integer> aNumbers = new ArrayList<Integer>();
		aNumbers.add(10);
		aNumbers.add(11);
		aNumbers.add(12);
		aNumbers.add(13);
		aNumbers.add(14);
		aNumbers.add(15);
		aNumbers.add(16);
		aNumbers.add(9);
		System.out.println("Final sum value is : "+addNumbers.addNumbers(aNumbers));
	}
}

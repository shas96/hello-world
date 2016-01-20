package com.lae.sample.add.numbers;

import java.util.List;

public class AddNumbers {

	public Integer addNumbers(List<Integer> aNumbers){
		Integer iAddUpValue = 0;
		for(Integer iNumber : aNumbers){
			iAddUpValue += iNumber;
		}
		return iAddUpValue;
	}
}

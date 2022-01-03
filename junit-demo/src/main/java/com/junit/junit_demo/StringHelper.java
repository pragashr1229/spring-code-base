package com.junit.junit_demo;

public class StringHelper {

	public String getfirst2Chars(String str) {
		if (str.length() <= 2)
			return "AAA";

		String first2Chars = str.substring(0, 2);

		return first2Chars;
	}

	
	//ABCD => false , ABAB => true , cd => true A => false,
	
	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}

}
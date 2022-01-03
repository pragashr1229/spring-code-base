package com.junit.junit_demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraySort() {
		int numbers[] = { 1, 9, 6, 12 };
		int expected[] = { 1, 6, 9, 12 };

		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		// String str = "";
		int numbers[] = null;
		int expected[] = { 1, 6, 9, 12 };

		Arrays.sort(numbers);

		assertArrayEquals(expected, numbers);
	}

	@Test
	public void assertThrowsException() {
		String str = "";
		assertThrows(IllegalArgumentException.class, () -> {
			Integer.valueOf(str);
		});
	}
}
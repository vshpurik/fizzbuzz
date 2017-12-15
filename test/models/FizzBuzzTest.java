package models;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void testFizzBuzzPozitiveLimit() {
		int maxVal = 15;
		FizzBuzz fizzBuzz = new FizzBuzz();
		FizzBuzzResult result = fizzBuzz.calculateFizzBuzz(maxVal);
		
		// expected results
		List<Integer> expectedFizz = Arrays.asList(3, 6, 9, 12);
		List<Integer> expectedBuzz = Arrays.asList(5, 10);
		List<Integer> expectedFizzBuzz = Arrays.asList(15);

		checkResults(expectedFizz, expectedBuzz, expectedFizzBuzz, result);
	}

	@Test
	public void testFizzBuzzNegativeLimit() {
		int maxVal = -15;
		FizzBuzz fizzBuzz = new FizzBuzz();
		FizzBuzzResult result = fizzBuzz.calculateFizzBuzz(maxVal);
		
		// expected results
		List<Integer> expectedFizz = Arrays.asList(-3, -6, -9, -12);
		List<Integer> expectedBuzz = Arrays.asList(-5, -10);
		List<Integer> expectedFizzBuzz = Arrays.asList(-15);

		checkResults(expectedFizz, expectedBuzz, expectedFizzBuzz, result);
	}

	@Test
	public void testFizzBuzzEdgeCase0() {
		int maxVal = 0;
		FizzBuzz fizzBuzz = new FizzBuzz();
		FizzBuzzResult result = fizzBuzz.calculateFizzBuzz(maxVal);
		
		// expected results
		List<Integer> expectedFizz = Arrays.asList();
		List<Integer> expectedBuzz = Arrays.asList();
		List<Integer> expectedFizzBuzz = Arrays.asList();

		checkResults(expectedFizz, expectedBuzz, expectedFizzBuzz, result);
	}

	@Test
	public void testFizzBuzzEdgeCase1() {
		int maxVal = 1;
		FizzBuzz fizzBuzz = new FizzBuzz();
		FizzBuzzResult result = fizzBuzz.calculateFizzBuzz(maxVal);
		
		// expected results
		List<Integer> expectedFizz = Arrays.asList();
		List<Integer> expectedBuzz = Arrays.asList();
		List<Integer> expectedFizzBuzz = Arrays.asList();

		checkResults(expectedFizz, expectedBuzz, expectedFizzBuzz, result);
	}

	private void checkResults(
		List<Integer> expectedFizz,
		List<Integer> expectedBuzz,
		List<Integer> expectedFizzBuzz,
		FizzBuzzResult result) {
		
		assertEquals(expectedFizz, result.fizz);
		assertEquals(expectedBuzz, result.buzz);
		assertEquals(expectedFizzBuzz, result.fizzBuzz);
	}
}

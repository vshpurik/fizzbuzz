package models;

import java.util.ArrayList;
import java.util.List;

/**
 *  This class implements business logic of the FizzBuzz service. 
 * @author vlad
 *
 */
public class FizzBuzz {
	private static int FIZZ_FREQ = 3;
	private static int BUZZ_FREQ = 5;
	private static int FIZZ_BUZZ_FREQ = FIZZ_FREQ * BUZZ_FREQ;
	
	/**
	 * This method calculates Fizz, Buzz, and FizzBuzz lists for the requested
	 * maxValue and creates FizzBuzzResult response object.   
	 * @param maxValue
	 * @return
	 */
	public FizzBuzzResult calculateFizzBuzz(int maxValue) {
		List<Integer> fizz = getValues(FIZZ_FREQ, maxValue);
		List<Integer> buzz = getValues(BUZZ_FREQ, maxValue);
		List<Integer> fizzBuzz = getFizzBuzzValues(maxValue);
		return new FizzBuzzResult(fizz, buzz, fizzBuzz);
	}
	
	private List<Integer> getValues(int freq, int maxValue) {
		List<Integer> result = new ArrayList<>();
		if (maxValue > 0) {
			for (int i=freq; i<=maxValue; i += freq) {
				if (i % FIZZ_BUZZ_FREQ != 0) {
					result.add(i);
				}
			}
		} else {
			for (int i=-freq; i>=maxValue; i -= freq) {
				if (i % FIZZ_BUZZ_FREQ != 0) {
					result.add(i);
				}
			}
		}
		
		return result;
	}

	private List<Integer> getFizzBuzzValues(int maxValue) {
		List<Integer> result = new ArrayList<>();
		if (maxValue > 0) {
			for (int i=FIZZ_BUZZ_FREQ; i<=maxValue; i += FIZZ_BUZZ_FREQ) {
				result.add(i);
			}
		} else{
			for (int i=-FIZZ_BUZZ_FREQ; i>=maxValue; i -= FIZZ_BUZZ_FREQ) {
				result.add(i);
			}
		}
		
		return result;
	}

}

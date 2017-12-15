package models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class is utilized to store calculation results and deserialize them into json format.
 * @author vlad
 *
 */
public class FizzBuzzResult {
	@JsonProperty("Fizz")
	public List<Integer> fizz;
	
	@JsonProperty("Buzz")
	public List<Integer> buzz;
	
	@JsonProperty("FizzBuzz")
	public List<Integer> fizzBuzz;
	
	public FizzBuzzResult(
		List<Integer> fizz,
		List<Integer> buzz,
		List<Integer> fizzBuzz) {
		
		this.fizz = fizz;
		this.buzz = buzz;
		this.fizzBuzz = fizzBuzz;
	}

}

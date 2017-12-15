package controllers;

import models.FizzBuzz;
import models.FizzBuzzResult;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/** 
 * This controller implements support for the /fizzbuzz route.
 * 
 * @author vlad
 *
 */
public class FizzBuzzController extends Controller {

    public Result fizzbuzz(Integer maxValue) {
    	// Create an instance of the FizzBuzz model class and calculate result.
    	FizzBuzz fizzBuzz = new FizzBuzz();
    	FizzBuzzResult result = fizzBuzz.calculateFizzBuzz(maxValue);
    	
    	// Play framework automatically adds "Content-Type: application/json" to the http response header
    	// if JsonNode object is passed into the ok() method. 
        return ok(Json.toJson(result));
    }

}

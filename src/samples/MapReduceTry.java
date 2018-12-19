package samples;

import java.util.Arrays;
import java.util.List;

public class MapReduceTry {
	
	public static void main(String[] args)
	{
		double total = 0;
		final List<Double> costBeforeTax = Arrays.asList(100.0, 200.0, 300.0, 400.0, 500.0);
		for (double cost : costBeforeTax) {
			double price = (double)cost + .12*(double)cost;
//			System.out.println(price);
			total = total + price;
		}
		System.out.println("Total: " + total);
		
		//Java 8 Lambda
		System.out.println("Lambda-----------------------------");
//		costBeforeTax.stream().map((cost) -> (double)cost +.12*(double)cost).forEach(System.out::println);
//		double bill = costBeforeTax.stream().reduce(0.0, (a, b) -> a + b);
		double bill = (double) costBeforeTax.stream().map((cost) -> cost + .12*cost).reduce(0.0, (a, b) -> a + b);
		System.out.println("Bill is: " + bill);
		
//		String[] myArray = {"this", "is", "a", "sentence"};
//		String result = Arrays.stream(myArray).reduce("", (a,b) -> a + b + " ");
//		System.out.println("result is: " + result);
	}

}

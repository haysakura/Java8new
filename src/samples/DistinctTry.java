package samples;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class DistinctTry {
	
	public static void main(String[] args)
	{
//		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
//		List<Integer> distinct = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
//		System.out.printf("Original List: %s£¬ %nSquare without duplications: %s %n", numbers, distinct);
		
		List<Integer> primes = Arrays.asList(1, 3, 5, 23, 12, 34, 56, 14, 29);
		IntSummaryStatistics stats = primes.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Highest prime number in List: " + stats.getMax());
		System.out.println("Lowest prime number in List: " + stats.getMin());
		System.out.println("Sum of all prime numbers: " + stats.getSum());
		System.out.println("Average of all prime numbers: " + stats.getAverage());	
	}

}

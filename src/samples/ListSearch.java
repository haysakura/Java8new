package samples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListSearch {
	
	public static void main(String[] args)
	{
		List features = Arrays.asList("L", "D", "S", "Dt");
		for (Object feature : features) {
			System.out.println(feature);
		}
		
		System.out.println("-------------------------------");
		// Java 8 Lambda
		features.forEach(n -> System.out.println(n));
		
		System.out.println("-------------------------------");
		// Java 8 fangfayinyong
		features.forEach(System.out::println);
			
	}
	

}

package samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterTry {
	
	public static void main(String[] args)
	{
		List<String> strList = Arrays.asList(
				"Hello",
				"ZYY",
				"S",
				"Good",
				"Great"
		);
		
		// use filter to generate a new list.
		List<String> filtered = strList.stream().filter(x -> x.length()>2).collect(Collectors.toList());
		System.out.printf("Original List: %s, filtered list: %s %n", strList, filtered);
		
		String strListUpper = strList.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println(strListUpper);		
	}
	

}

package samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFilterTry 
{
	
	public static void main(String[] args)
	{
		List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		
		System.out.println("Languages which starts with J: ");
		filter(languages, (str) -> ((String) str).startsWith("J"));
		
		System.out.println("Languages which ends with a: ");
		filter(languages, (str) -> ((String) str).endsWith("a"));
		
		System.out.println("Print all languages: ");
		filter(languages, (str) -> true);
		
		System.out.println("Print no languages: ");
		filter(languages, (str) -> false);
		
		System.out.println("Print languages whose length greater than 4: ");
		filter(languages, (str) -> ((String) str).length()>4);
		
	}
	
	public static void filter(List names, Predicate condition)
	{
		for (Object name : names) 
		{
			if (condition.test(name)) {
				System.out.println(name + " ");
			}
		}
	}

}

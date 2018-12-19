package samples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredoicateAndTry {
	
	public static void main(String[] args)
	{
		List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
		
		Predicate<String> startsWithJ = (n) -> n.startsWith("J");
		Predicate<String> fourletterLong = (n) -> n.length()==4;
		
		languages.stream()
		.filter(startsWithJ.and(fourletterLong))
		.forEach((n) -> System.out.println("nName, which starts with 'J' and four letter long is: " + n));
		
	}

}

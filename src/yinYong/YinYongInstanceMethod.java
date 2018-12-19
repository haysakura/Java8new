package yinYong;

import java.util.Arrays;
import java.util.List;

public class YinYongInstanceMethod {
	
	public void main(String[] args)
	{
		Person[] persons = new Person[10];
		
		String[] strings = {"Hello", "Wrold"};
		
		ComparisonProvider provider = new ComparisonProvider();
		
		Arrays.sort(persons, (a,b) -> provider.compareByAge(a, b));
		
		Arrays.sort(persons, provider::compareByAge);
		
		Arrays.sort(strings, String::compareToIgnoreCase);
		
	}

	private class ComparisonProvider
	{
		public int compareByName(Person a, Person b)
		{
			return a.getName().compareTo(b.getName());
		}
		
		public int compareByAge(Person a, Person b)
		{
			return a.getBirthday().compareTo(b.getBirthday());
		}
	}
	
}

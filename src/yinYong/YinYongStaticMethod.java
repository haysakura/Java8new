package yinYong;

import java.util.Arrays;
import java.util.Comparator;

public class YinYongStaticMethod {

	public static void main(String[] args) {
		
		Person[] persons = new Person[10];
		
		String[] sss = new String[10];
		
		// use anonymous
		Arrays.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person arg0, Person arg1) {
				// TODO Auto-generated method stub
				return arg0.birthday.compareTo(arg1.birthday);
			}
						
		});
		
		// use lambda 
		Arrays.sort(persons, (p1, p2) -> p1.birthday.compareTo(p2.birthday));
		
		// use lambda and static method
		Arrays.sort(persons, (p1, p2) -> Person.compareByAge(p1, p2));
		
		// Yinyong and use static method
		Arrays.sort(persons, Person::compareByAge);

	}

}

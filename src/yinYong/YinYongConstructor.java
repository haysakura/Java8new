package yinYong;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class YinYongConstructor {
	
	public static <T,S extends Collection<T>, D extends Collection<T>> D transferElements(S sourceCollections, Supplier<D> collectionFactory)
	{
		D result = collectionFactory.get();
		for (T t:sourceCollections) {
			result.add(t);
		}
		return result;
	}
	
	
	public static void main(String[] args)
	{
		Person[] persons = new Person[10];
		
		final List<Person> personList = Arrays.asList(persons);
		
		//use lambda
		Set<Person> perSet = transferElements(personList, () -> new HashSet<Person>());
		
		// method YinYong, YinYong constructor
		Set<Person> persons2 = transferElements(personList, HashSet::new);
	}
	

}

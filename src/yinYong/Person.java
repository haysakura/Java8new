package yinYong;

import java.time.LocalDate;

public class Person {
	
	public enum Sex
	{
		Male,
		Female
	}

	String name;
	LocalDate birthday;
	Sex gender;
	String emailAddress;
	
	public String getEmailAddress()
	{
		return emailAddress;
	}
	
	public Sex genGender()
	{
		return gender;
	}
	
	public LocalDate getBirthday()
	{
		return birthday;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static int compareByAge(Person a, Person b)
	{
		return a.birthday.compareTo(b.birthday);
	}
	
}

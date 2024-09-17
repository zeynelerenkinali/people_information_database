import java.util.Scanner;

public class Person 
{
	Scanner sc = new Scanner(System.in);
	String address, name, surname;
	long phone;
	int age;
	void contactInformation(String address, long phone)
	{
		this.address = address;
		this.phone = phone;
	}
	
	void ıdInformation(String name, String surname, int age)
	{
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
}
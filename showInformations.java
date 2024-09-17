public class showInformations 
{
	void showInformation(Person person)
	{
		System.out.println(Main.LIGHT_BLUE + Main.BOLD + "\n||Id Information||" + Main.RESET);
		System.out.println("Name: "+ person.name);
		System.out.println("Surname: "+ person.surname);
		System.out.println("Age: "+ person.age);
		System.out.println(Main.LIGHT_BLUE + Main.BOLD +"\n||Contact Information||" + Main.RESET);
		System.out.println("Address: "+ person.address);
		System.out.println("Phone: "+ person.phone);
	}
}
import java.util.Scanner;
public class Main {
	public static final String GREEN = "\033[0;32m", LIGHT_BLUE = "\033[0;94m",BLUE = "\u001b[34m", RED = "\033[0;31m", RESET = "\033[0m", SHADE = "\033[0;90m", AQUA = "\u001b[38;2;145;231;255m", BOLD = "\u001b[1m", UNDERLINE = "\u001b[4m", WHITE_BACKGROUND = "\u001B[47m"; //blue is light blue not the real one
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Person[] person = new Person[20]; 
		String name, surname, address;
		int age, counter;
		long phone;
		showInformations information = new showInformations();
		while(true)
		{
			System.out.print("How many person do you want to add?(0-20) ");
			counter = sc.nextInt();
			while(counter <= 0 || counter > person.length) // getting an appropriate value between 0 and 20
			{
				System.out.print(RED + BOLD + "You've entered a value not in the range or unappropriate value!"+RESET+"\nPlease enter an appropriate value: ");
				counter = sc.nextInt();
			}
			System.out.println(GREEN + BOLD + "List is empty Please fill in!" + RESET);
			for(int i = 0; i < counter; i++) // filling by the user until there is no person to add list
			{
				person[i] = new Person();
				System.out.println(LIGHT_BLUE + BOLD +"\n||Id Information||" + RESET);
				System.out.print("Please enter "+ (i+1) + ". person's name: ");
				name = sc.next();
				System.out.print("Please enter "+ (i+1) + ". person's surname: ");
				surname = sc.next();
				System.out.print("Please enter "+ (i+1) + ". person's age: ");
				age = sc.nextInt();
				System.out.println(LIGHT_BLUE + BOLD + "\n||Contact Information||" + RESET);
				System.out.print("Please enter "+ (i+1) + ". person's address: ");
				sc.nextLine(); // clearing white spaces or new lines before getting address value(it gave error like output because of that it's added)
				address = sc.nextLine();
				System.out.print("Please enter "+ (i+1) + ". person's phone number: ");
				phone = Long.parseLong(sc.nextLine());
				person[i].contactInformation(address, phone);
				person[i].ıdInformation(name, surname, age);
				if((counter-i-1) != 0)
					System.out.println(counter-i == 1 ? GREEN + "\n||"+(counter-i-1) + " person left||" + RESET: GREEN +"\n||"+(counter-i-1) + " people left||" + RESET);
				else
					System.out.println(GREEN + BOLD + "There is no person left to fill...\n||Leaving||" + RESET);
			}
			System.out.print("\nDo you want to see the list of people informations?(y, n) ");
			char answ = sc.next().charAt(0);
			if(Character.toLowerCase(answ) == 'y') // if yes it will print data of people by function showInformations 
			{
				for(int i = 0; i < counter; i++)
				{
					System.out.println(UNDERLINE + BOLD + "\n" + person[i].name + "'s informations" + RESET);
					information.showInformation(person[i]);
				}
				System.out.print("\nDo you want to create another list?(y, n) ");
				answ = sc.next().charAt(0);
				if(Character.toLowerCase(answ) == 'y')
					continue;
				else
					break;
			}
			else
			{
				System.out.println(GREEN + BOLD + "||Quitting||" + RESET);
				sc.close();
				break;
			}
		}
	}
}
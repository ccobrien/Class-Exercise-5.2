import java.util.Scanner;

public class PersonDriver {
	public static void main(String [] args)
	{
		Person personOne = new Person();
		Person personTwo = new Person();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the first person's name.");
		String name = keyboard.next();
		personOne.setName(name);
		System.out.println("The first person's name is " + personOne.getName() + ".");
				
		System.out.println("Please enter " + personOne.getName() + "'s age.");
		int age = keyboard.nextInt();
		personOne.setAge(age);
		
		System.out.println(personOne.getName() + "'s age is " + personOne.getAge()+ ".");
		
		System.out.println("Please enter the second person's name.");
		String nameTwo = keyboard.next();
		personTwo.setName(nameTwo);
		System.out.println("The second person's name is " + personTwo.getName() + ".");
				
		System.out.println("Please enter " + personTwo.getName() + "'s age.");
		int ageTwo = keyboard.nextInt();
		personTwo.setAge(ageTwo);
		
		System.out.println(personTwo.getName() + "'s age is " + personTwo.getAge() + ".");
		keyboard.close();
		
		if(name.equals(nameTwo) && (age - ageTwo == 0))
		{
			System.out.println(personOne.getName() + " and " + personTwo.getName() + " are the same.");
		}
		else
		{
			if((age - ageTwo == 0))
			{
				System.out.println(personOne.getName() + " and " + personTwo.getName() + " are the same age.");
			}
			else if(age >= ageTwo)
			{
				System.out.println(personOne.getName() + " is older than " + personTwo.getName() + ".");
			}
			else
			{
				System.out.println(personTwo.getName() + " is older than " + personOne.getName() + ".");
			}
			
			if(name.equals(nameTwo))
			{
				System.out.println("Both people have the same name, " + personOne.getName() + ".");
			}
		}
	}
}


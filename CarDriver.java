
import java.util.Scanner;
public class CarDriver {
	public static void main(String [] args)
	{
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the first car's color.");
		String color = keyboard.next();
		car1.setColor(color);
		
		System.out.println("Please enter the first car's horse power.");
		int horsePwr = keyboard.nextInt();
		car1.setHorsePwr(horsePwr);
		
		System.out.println("Please enter the first car's engine size.");
		int engine = keyboard.nextInt();
		car1.setEngine(engine);
		
		System.out.println("Please enter the first car's make.");
		String make = keyboard.next();
		car1.setMake(make);
		
		
		System.out.println("Please enter the second car's color.");
		String color2 = keyboard.next();
		car2.setColor(color2);
		
		System.out.println("Please enter the second car's horse power.");
		int horsePwr2 = keyboard.nextInt();
		car2.setHorsePwr(horsePwr2);
		
		System.out.println("Please enter the second car's engine size.");
		int engine2 = keyboard.nextInt();
		car2.setEngine(engine2);
		
		System.out.println("Please enter the second car's make.");
		String make2 = keyboard.next();
		car2.setMake(make2);
		
		System.out.println("Please enter the third car's color.");
		String color3 = keyboard.next();
		car3.setColor(color3);
		
		System.out.println("Please enter the third car's horse power.");
		int horsePwr3 = keyboard.nextInt();
		car3.setHorsePwr(horsePwr3);
		
		System.out.println("Please enter the third car's engine size.");
		int engine3 = keyboard.nextInt();
		car3.setEngine(engine3);
		
		System.out.println("Please enter the third car's make.");
		String make3 = keyboard.next();
		car3.setMake(make3);
		
		System.out.println("Car one's " + car1);
		System.out.println("Car two's " + car2);
		System.out.println("Car three's " + car3);
		
		keyboard.close();
	}
}

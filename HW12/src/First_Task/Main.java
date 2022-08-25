package First_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List <String> materials = new ArrayList<String>();
		materials.add("Default leather");
		materials.add("Alkantara");
		materials.add("Elephant leather");
		materials.add("Crocodile leather");
		materials.add("LuisVuiton leather");
		materials.add("Gucci leather");

		while (true) {
			Scanner scn = new Scanner(System.in);
			System.out.println(
					"=============================================" + "\n" + "-Press '0' to create new Array of Cars" + "\n" + "-Press '1' to exit");
			int arrCreateKey = scn.nextInt();

			try {
				if (arrCreateKey == 0) {
					System.out.println("Array was created successfully");

					Random rnd = new Random();
					int listSize = 2;
					
					List <Car> Cars = new ArrayList<Car>(listSize);
					
					for(int i = 0; i < listSize; i++) {
						Cars.add(new Car(rnd.nextInt(601 - 1) + 100,
								rnd.nextInt(32 - 1) + 1990,
								new Helm(rnd.nextInt(4-1)+15, materials.get(rnd.nextInt(6-1)+1)),
								new Engine(rnd.nextInt(14-1)+2)));		
					}
					
					while (true) {
						System.out.println("-Press '1' to see all Array values" + "\n"
								+ "-Press '2' to fill all objects with the same car" + "\n" 
								+ "-Press '3' to exit");
						int consoleKey = scn.nextInt();
						
						if (consoleKey == 1) {
							System.out.println(Cars.toString());
						} 
						else if (consoleKey == 2) {
							for(int i=0; i < listSize; i++) {
								Cars.remove(0);
								Cars.add(new Car(500, 2017, new Helm(21, "Crocodile leather"), new Engine(16)));
							}
							System.out.println(Cars.toString());
						} 
						else if (consoleKey == 3) {
							break;
						} 
						else throw new IllegalStateException();
					}
				} 
				else if (arrCreateKey == 1) {
					break;
				} 
				else throw new IllegalStateException();
			} 
			catch (IllegalStateException e) {
				System.err.println("You entered wrong number");
			}

			
		}
		
	}
}

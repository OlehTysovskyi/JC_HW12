package Third_Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {		
						
		List list = new ArrayList();
		
		list.add("a");
		list.add(12);
		list.add(new Plane("cy-27", 1200, 30));
		System.out.println("-List with 3 elements: " + "\n" + list.toString());
		
		list.remove(0);
		list.remove(1);
		System.out.println("-List with deleted 2 first elements: " + "\n" + list.toString());
		
		list.add(21.21);
		list.add(new Plane("B-45", 2000, 30));
		System.out.println("-Final list: " + "\n" + list.toString());

	}
	
}

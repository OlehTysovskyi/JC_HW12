package Third_Task;

public class Plane {	
	
	private String name;
	private int enginePower, wingsWidth;
	
	Plane(String name, int enginePower, int wingsWidth){
		this.name = name;
		this.enginePower = enginePower;
		this.wingsWidth =  wingsWidth;
	}

	@Override
	public String toString() {
		return "Plane [name='" + name + "'; enginePower=" + enginePower + "hp; wingsWidth=" + wingsWidth + "m]";
	}
	
	
	
	
}

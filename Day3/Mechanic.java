abstract class Vehicle {
	int vin;
	int speed;
	String name;
	
	Vehicle(int vin, int speed,String name){
	this.vin=vin;
	this.speed=speed;
	this.name=name;
	}
	 void details(){
	System.out.println("Vin:" + vin);
	System.out.println("Speed:" + speed);
	System.out.println("Name:" + name);}

	abstract void drive();
	abstract void inspect();
	}
class Bike extends Vehicle {
	Bike(int vin,int speed, String name){
	 super(vin,speed,name);
	}
	void drive() {
	System.out.println("Bike Drive started");
	}
	void inspect() {
	System.out.println("Inspect vehicle Bike");
	}
}
class Car extends Vehicle {
	Car(int vin,int speed, String name){
	 super(vin,speed,name);
	}
	void drive() {
	System.out.println("Car Drive started");
	}
	void inspect() {
	System.out.println("Inspect vehicle Car");
	}

}
public class Mechanic {
	public static void main(String[] args) {
		
		Bike b = new Bike(3, 29, "duke");
		b.drive();
		b.inspect();
		
	}
}
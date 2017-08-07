class Automobile {
		int speed;
		String colour;
		String model;
		private double price;
		
		double getprice(){
		System.out.println("in get price");
		return this.price;}

		void setprice(int price){
		this.price=price;
		}

		Automobile() {
		this.speed=0;
		this.colour=null;
		this.model=null;
		this.price=0;
		}		

		Automobile(int speed, String colour, String model, double price) {
		this.speed=speed;
		this.colour=colour;
		this.model=model;
		this.price=price;
		}
		void accelerate(){
		speed=speed+10;
		}
		void stop() {
		System.out.println("Vehicle stopped!!");
		}
		void brake() {
		speed=speed-10;
		}
		void start() {
		System.out.println("Vehicle started!!");
		}
	
public static void main(String[] args) {
		Automobile automobile=new Automobile();
		automobile.stop();
		Car c= new Car(50,"blue","audi",389000,4);
		c.start();
		c.stop();
		double p=c.getprice();
		System.out.println(p);
	}
               
    }

class Car extends Automobile {
		int occupants;
                void start() {
		super.start();
		}
		void stop() {
		super.stop();
		}

		Car(int speed, String colour, String model, double price,int occupants) {
		super(speed,colour,model,price);
		this.occupants=occupants;
		}

		

	
	}
class Bus extends Automobile {
		int seats;
		int numberOfDoors;
		void accelerate() {
		super.accelerate();
		}

		Bus(int speed, String colour, String model, double price,int seats,int numberOfDoors) {
		super(speed,colour,model,price);
		this.seats=seats;
		this.numberOfDoors=numberOfDoors;

		}

   
}


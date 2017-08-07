class Flyingcar extends Car {
				String engine;
				String wingsType;

				void accelerate() {
				speed=speed+100;
				}
				Flyingcar(int speed, String colour, String model, double price,int occupants,String engine){
				super(speed,colour, model, price,occupants);
				this.engine=engine;
			}
}

class Sportscar extends Car {
				String companyName;
				Sportscar(int speed, String colour, String model, double price,int occupants,String engine){
				super(speed,colour, model, price,occupants);
				this.com=engine;
			}
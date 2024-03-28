package overloadingandoverridingpolymorbism;

class Vehicle {
	public void start() {
		System.out.println("VEHICLE IS STARTED");
	}

	public void stop() {
		System.out.println("VEHICLE IS STOPED");
	}

}

class Bike extends Vehicle {
	public void start() {
		System.out.println("BIKE IS STARTED");
	}

	public void stop() {
		System.out.println("BIKE IS STOPPED");
	}
}
class Car extends Vehicle {

	public void start() {
		System.out.println("CAR IS STARTED");
	}

	public void stop() {
		System.out.println("CAR IS STOPPED");
	}
}

public class VehicleHerarchy {

	public static void main(String[] args) {
		Vehicle vehicle = new Bike();

		Vehicle vehicle1 = new Car();
		vehicle.start();

		vehicle.stop();

		vehicle1.start();

		vehicle1.stop();

	}
}

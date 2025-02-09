package hierarchicalinheritance;

class Vehicle {
	void start()
	{
		System.out.println("Vehicle is starting..");
		
	}
	void stop()
	{
		System.out.println("vehicle is stopping..");
	}

}
class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Drive by driver");
	}
}
class Bike extends Vehicle
{
	void ride()
	{
		System.out.println("Ride by rider");
	}
}
class HierarchicalMain
{
	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
		c.stop();
		System.out.println("******");
		Bike b=new Bike();
		b.start();
		b.ride();
	}
}
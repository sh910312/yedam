package Test1;

class Bus extends Driver {
	String busNum;

	Bus() {
	}

	Bus(String busNum) {
		this.busNum = busNum;
	}

	String busNum() {
		return busNum;
	}

	void setbusNum(String busNum) {
		this.busNum = busNum;
	}

	void start(Driver driver) {
		driver.start();
	}
	void run(Driver driver) {
		driver.run();
	}
	void stop(Driver driver) {
		driver.stop();
	}
	
}

class Taxi extends Driver {

	String taxiNum;

	Taxi() {
	}

	Taxi(String taxiNum) {
		this.taxiNum = taxiNum;
	}

	String taxiNum() {
		return taxiNum;
	}

	void settaxiNum(String taxiNum) {
		this.taxiNum = taxiNum;
	}
}

class Driver {

	void start(Bus bus) {
		bus.start();
	}

	void start() {
		System.out.println("출발");
	}

	void run() {
		System.out.println("가는중");
	}

	void stop() {
		System.out.println("멈춤");
	}
}

public class VehicleEx {

	public static void main(String[] args) {

		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Driver driver = new Driver();

		String busNum1 = "555";
		String taxiNum1 = "24아3511";


		bus.setbusNum(busNum1);
		taxi.settaxiNum(taxiNum1);
		driver.start();
		
		
		System.out.println("버스번호: " + bus.busNum());

		System.out.println("택시번호: " + taxi.taxiNum());

		// driver.start(new Bus());

	}

}

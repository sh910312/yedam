package AAAA;

class Driver {
	// 필드
	String run;
	int stop;

	void run() {
		System.out.println("달리다");
	}

	void stop() {
		System.out.println("멈추다");
	}

}

class Carr {

	String name;
	String num;

	Carr() {
	}

	Carr(String name, String num) {
		this.name = name;
		this.num = num;
	}

	String getName() {
		return name;
	}

	String getNum() {
		return num;
	}

	void setName(String name) {
		this.name = name;
	}

	void setNum(String num) {
		this.num = num;
	}
}

public class CarEEx {

	public static void main(String[] args) {

		Carr car = new Carr();
		Carr car2 = new Carr();
		Carr car3 = new Carr();
		Driver driver = new Driver();

		String carname = "승용차";
		String carname2 = "SUV";
		String carname3 = "자전거";

		String carnum = "13바2424";
		String carnum2 = "14아2414";
		String carnum3 = "31사5555";

		car.setName(carname);
		car.setNum(carnum);
		car2.setName(carname2);
		car2.setNum(carnum2);
		car3.setName(carname3);
		car3.setNum(carnum3);

		driver.run();

		System.out.println("종류  " + car.getName() + "\n번호: " + car.getNum());
		driver.stop();
		System.out.println("종류  " + car2.getName() + "\n번호: " + car2.getNum());
		System.out.println("종류  " + car3.getName() + "\n번호: " + car3.getNum());

	}
}
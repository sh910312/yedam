package AAAA;

class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 3);
	Tire frontRightTire = new Tire("앞오른쪽", 5);
	Tire backLeftTire = new Tire("뒤왼쪽", 5);
	Tire backRightTire = new Tire("뒤왼쪽", 5);

	// run()
	int run() {
		System.out.println("자동차가 달리비낟");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("자동차 멈춤");
	}

}

class Tire {
	// 필드
	public int maxR; // 최대 회전수
	public int aR; // 현재 누적된 회전수
	public String location; // 장착위치

	// 생성자
	public Tire(String location, int maxR) {
		this.location = location;
		this.maxR = maxR;
	}

	// 메소드
	public boolean roll() { // 수명
		++aR;
		if (aR < maxR) {
			System.out.println(location + "Tire 수명" + (maxR - aR));
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크***");
			return false;
		}

	}// end of roll()

} // end of class

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 20; i++) {
			int pl = car.run();
			switch (pl) {
			case 1:
				System.out.println("앞왼쪽타이어교체");
				car.frontLeftTire = new Hktire("앞왼쪽", 5);
				break;
			case 2:
				System.out.println("앞오른쪽쪽타이어교체");
				car.frontRightTire = new Tire("앞오른쪽", 2);
				break;
			case 3:
				System.out.println("뒤 왼쪽 타이어교체");
				car.backLeftTire = new Khtire("뒤왼쪽쪽", 5);
				break;
			case 4:
				System.out.println("뒤왼쪽쪽타이어교체");
				car.backRightTire = new Tire("뒤왼쪽", 2);
				break;

			}
			System.out.println("--------------");
		}
	}

}

class Hktire extends Tire {

	public Hktire(String location, int maxR) {
		super(location, maxR); // 매개값이 두개인 생성자를 super에 호출

	}

	@Override
	public boolean roll() {
		++aR;
		if (aR < maxR) {
			System.out.println(location + "HkTire 수명: " + (maxR - aR) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Hktire 펑크 ***");
			return false;

		}
	}

}
class Khtire extends Tire {

	public Khtire(String location, int maxR) {
		super(location, maxR); // 매개값이 두개인 생성자를 super에 호출

	}

	@Override
	public boolean roll() {
		++aR;
		if (aR < maxR) {
			System.out.println(location + "KhTire 수명: " + (maxR - aR) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Khtire 펑크 ***");
			return false;

		}
	}

}

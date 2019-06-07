package yedamOracle.com;

public class Rec1 {
	
	double height;
	double width;
		
	Rec1 () {
		}
	
	Rec1(double a, double b) { // 생성자는클래스 이름과 똑같아야함
		height = a; //
		width = b; // 
	}
		
	void getArea() {
		System.out.println("넓이는 " + height*width/2);
	}
	
	double getArea(double a) {
		return a*a/2;
	}
	double getArea(double a, double b) {
		return a*b/2;
	}
	
}

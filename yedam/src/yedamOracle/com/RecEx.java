package yedamOracle.com;

public class RecEx {

	public static void main(String[] args) {
		Rec tr = new Rec(1,3);
		tr.getArea(); // void 값 찍어냄 System.out 생략 void에 system.out썻기때문에
		System.out.println(tr.getArea(3));// double a 불러냄
		double result = tr.getArea(22,11);// double a,b 불러냄
		System.out.println(result);

	}

}

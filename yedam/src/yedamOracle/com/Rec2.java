package yedamOracle.com;

import java.util.Scanner;

public class Rec2 {

	public static void main(String[] args) {
		
		Scanner sr = new Scanner(System.in);
		double i = sr.nextDouble();
		//입력 받을 변수(i)를 선언하고 
		//System.out.(tr.getArea(i)); 를 쓴다
		
		Rec tr = new Rec(1,3);
		tr.getArea(); // void 값 찍어냄 System.out 생략 void에 system.out썻기때문에
		System.out.println(tr.getArea(i));
		// 입력받을 변수 작성
	}

}

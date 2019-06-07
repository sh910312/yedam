package com.yedam.KimSuho;

import java.util.Scanner;

public class PerBMIEX {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		PerBMI bmi = new PerBMI("나이", "이름", "합계(몸무게,키)");

		String age = sc.nextLine();
		String name = sc.nextLine();
//		String hap = sc.nextLine();

		bmi.setage(age);
		bmi.setname(name);
		//bmi.sethap(hap);

		System.out.println(bmi.getage() + " / " + bmi.getname() + " / " + bmi.gethap(sc.nextInt(),sc.nextInt()));

		// System.out.println(bmi.getage() + " / "+bmi.getname()+" / "+bmi.gethap());

	}

}

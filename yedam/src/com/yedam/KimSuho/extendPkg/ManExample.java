package com.yedam.KimSuho.extendPkg;

import java.util.Scanner;

public class ManExample {
	public static void main(String[] args) {
		
		Man[] manAry = new Man[5];

		Scanner sc = new Scanner(System.in);
		int menu = 1;
		String name, company, major;
		while (true) {
			System.out.println("입력하세요 ==== 1)학생정보입력 2)교수정보입력 3)전체조회 4)종료.");
			menu = sc.nextInt();
			if (menu == 1) {
				
				System.out.println("1번을 선택했습니다.");
				System.out.println("학생이름");
				name = sc.next();
				sc.nextLine();
				System.out.println("학생학번");
				major = sc.next();
				sc.nextLine();

		
				Man man = new UnivMan(name, major);
				insertInfo(man, manAry);

			} else if (menu == 2) {
			
				System.out.println("2번을 선택했습니다.");
				System.out.println("교수이름");
				name = sc.next();
				sc.nextLine();
				System.out.println("교수번호");
				company = sc.next();
				sc.nextLine();

			
				Man man = new BusineseMan(name, company);
				insertInfo(man, manAry);

			} else if (menu == 3) {
				
				System.out.println("3번을 선택했습니다");
				listInfo(manAry);

			} else {
				System.out.println("종료");
				// break;
				System.exit(0);
			}
		}

	}


	static void listInfo(Man[] mAry) {
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] != null)
				mAry[i].tellYourName();
		}
	}


	static void insertInfo(Man m, Man[] mAry) {
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] == null) {
				mAry[i] = m;
				break;
			}
		}
		System.out.println(" ");
	}
}

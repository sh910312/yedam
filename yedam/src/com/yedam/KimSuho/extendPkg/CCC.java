package com.yedam.KimSuho.extendPkg;

import com.yedam.KimSuho.AAA;

public class CCC {
		
	public static void main(String[] args) {
		
		
		int num =1;
		int [][] ary = new int [7][7];
		System.out.println("=========순서대로=========");
		for (int i=0; i<5; i++) {
		
			for (int j=0; j<5; j++) {
				ary[i][j] = num;
				num++;
			}
		}
		
		
		for (int i = 0; i <5; i++) {
			for(int j=0; j<5; j++) {
						
				System.out.printf("%5d",ary[i][j]);
				
			}
			System.out.println();
				
		}

		int num1 =1;
		int N = 0;
		int [][] ary1 = new int [7][7];
		System.out.println("=========90도 회전=========");
		for (int i=0; i<5; i++) {
		
			for (int j=0; j<5; j++) {
				ary1[i][j] = num1;
				num1++;
			}
		}
				
		for (int i = 0; i <5; i++) {
			for(int j=0; j<5; j++) {
						
				System.out.printf("%5d",ary1[j][4-i]);
			}
			System.out.println();
				
		}
		
		
		
		
		/*
		int[][] ary = new int[8][15]; // 세로8칸 가로10칸
		int num  = 1;
		for(int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
			ary [i][j] = num;
			num ++;
			}
		} // end of for
		for(int i=0; i<4; i++) {
			for (int j=0; j<4; j++) {
				System.out.printf("%2d", ary[i][j]);
			}
				
		System.out.println();
		}
			*/
		
		/*
		int [][] ary = new int[][] {{1}, {2,3}, {4,5,6}};
		
		System.out.println("[0]의 크기 : " + ary[0].length);
		System.out.println("[1]의 크기 : " + ary[1].length);
		System.out.println("[2]의 크기 : " + ary[2].length);
		*/
		
		
		
		/*String str1 = "Hello2";
		String str2 = "Hello1";
		String str3 = new String("hello");
		
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
		
		System.out.println(str1.compareTo(str2));

		*/
		
		
		
	}

}

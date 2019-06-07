package com.yedam.KimSuho.extendPkg;

import java.util.Scanner;

public class InterpaceMain {

	public static void main(String[] args) {
		
		InterfaceMan[] manAry = new InterfaceMan[5];
		Scanner sc = new Scanner(System.in);
				
		InterfaceMan man_s = new InterfaceStudent ("김김김","010-1234-1234","hahahahaha");
		InterfaceMan man_p = new InterfaceProfessor ("이이이","010-9876-5432","papapapapa");
		
		man_s.getInfo();
		man_p.getInfo();
	

	}

}

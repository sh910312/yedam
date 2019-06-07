package com.yedam.KimSuho.extendPkg;

public class AbstractMain {

	private static AbstractStudent AbstractMan;

	public static void main(String[] args) {
		
		AbstractMan man_s = new AbstractStudent("첫번째","빠라빠빰");
		AbstractMan man_p = new AbstractProfessor("두번째", "삐리삐뿌");
		
		man_s.getInfo();
		man_p.getInfo();
		

	}

}

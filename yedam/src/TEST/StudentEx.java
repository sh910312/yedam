package TEST;

import java.util.Scanner;

public class StudentEx {

	public static void main(String[] args) {
		
		System.out.println("============================ 학  생 정 보 ===============================");
		Student student = new Student("1111\t","홍길동\t","영어\t","1991년 10월 8일");
		
		student.StudentInfo();
		
		System.out.println("=======================================================================");
		
		
		
		
		
		
		
		
		
		
		/*int num = 10;
		Student student = new Student("1111-111","dsfa","1857");
		
		System.out.println(student.getStudentNo());
		System.out.println(student.getName());
		System.out.println(student.getMajor());
		*/
		
		
		
		
		
		
		// 1. student 필드에 학생생일을 담을 수 있는 필드
		// 	 - set, get 메소드 정의
		// 2. student 클래스의 메소드 추가.
		//   - void getStudentInfo() => 학번:1111, 이름: 홍길동,
		//								전공: 영어, 생일: 1991-01-01
		
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		Student a = new Student("학번","이름","전공");
	
		System.out.println(a.gethak()+" / "+a.getname()+" / "+a.getmajor());
				
		String hak = sc.nextLine();
		String name = sc.nextLine();
		String mojor = sc.nextLine();
		
		a.sethak(hak);
		a.setname(name);
		a.setmajor(mojor);
		
		System.out.println(a.gethak()+" / "+a.getname()+" / "+a.getmajor());
		
			*/	
	}

}

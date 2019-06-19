package List;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/* 	학생정보를 저장하는 프로그램(Ver.1.0)
	만든이: 김수호(2019.06.13)
	최종수정일: 2019.6.13
	어려운점:
	
	1. 저장
	2. 조회(sno)
	3. 삭제(sno)
*/

class Student {

	int sno;
	String name;
	String major;

	Student() {
	}

	Student(int sno, String name, String major) {
		this.sno = sno;
		this.name = name;
		this.major = major;

	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	class Linkedlist<E> {
		private E Ex;

		public void set(E e) {

			Ex = e;

		}

		public String toString() {
			return Ex + "df";
		}
	}

}

public class CollectionEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<String> set = new CollectionEx<String>();
		{

			List<Student> list = new LinkedList<>();

			// list.add(new LinkedList<>());

			Student a = new Student();

			System.out.println("번호입력");
			int sno = sc.nextInt();
			System.out.println("이름입력");
			String name = sc.next();
			System.out.println("전공입력");
			String major = sc.next();

			a.setSno(sno);
			a.setName(name);
			a.setMajor(major);

			System.out.println("학생번호: " + a.getSno() + "\n" + "학생이름: " + a.getName() + "\n" + "학생전공: " + a.getMajor());

		}

	}
}
package com.yedam.KimSuho;

import TEST.Student;

public class StudyClassMain {
	public static void main(String[] args) {
		// 1.반정보생성
		Professor professor = new Professor("p1111","김교수","english");
		Student student1 = new Student("s1111", "홍길동", "english");
		Student student2 = new Student("s2222", "김유신", "english");
		Student student3 = new Student("s3333", "이순신", "english");
		Student[] studentAry = new Student[5];
		StudyClass sclass = new StudyClass("english",professor,studentAry);
		
		
		
/*		studentAry[0] = student1;
		studentAry[1] = student2;
		studentAry[2] = student3;
*/
		
		insertStudent(sclass, student1);
		insertStudent(sclass, student2);
		insertStudent(sclass, student3);
		sclass.setProfessor(professor);
		sclass.setStudentAry(studentAry);
		System.out.println(sclass.classInfo());
	}
	static void insertStudent(StudyClass sc, Student stud) {
		sc.setStudentInfo(stud);
	}
}

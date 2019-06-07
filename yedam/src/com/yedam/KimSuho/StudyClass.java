package com.yedam.KimSuho;

import java.util.Arrays;

import TEST.Student;

public class StudyClass {
	// 필드...
	String className;
	Professor professor;
	Student[] studentAry;// = new Student[5];
	// 생성자...
	public StudyClass() {
		super();
	}
	public StudyClass(String className, Professor professor, Student[] studentAry) {
		super();
		this.className = className;
		this.professor = professor;
		this.studentAry = studentAry;
	}
	// 메소드..
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Student[] getStudentAry() {
		return studentAry;
	}
	public void setStudentAry(Student[] studentAry) {
		this.studentAry = studentAry;
	}
	@Override
	public String toString() {
		return "StudyClass [className=" + className + ", professor=" + professor + ", studentAry="
				+ Arrays.toString(studentAry) + "]";
	}
	public String classInfo() {
		String studAry = "[학생정보 list]\n";
		for(int i=0;i<studentAry.length;i++)
			if(studentAry[i]!=null)
			studAry += (i+1)+". "+studentAry[i].getName() +"/ "+studentAry[i].getStudentNo()+"\n";
		return "반이름:["+className+"]\n담당교수:["+professor.getName()+"]\n"+studAry;
	}
	// [반이름]
	// [담임선생님]
	// 1.학생1/ 학번1111
	// 2.학생2/ 학번2222
	// 3.학생3/ 학번3333
	public void setStudentInfo(Student std) {
		for(int i=0;i<studentAry.length;i++) {
			if(studentAry[i]==null) {
				studentAry[i] = std;
				break;
			}
		}
	}
}

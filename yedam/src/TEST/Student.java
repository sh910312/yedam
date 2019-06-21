package TEST;

public class Student {
	
//	String studentNo;
//	String name;
//	String mojor;
//	String yy;
//	
//	Student() {} // 생성자 소환하기 위해서 필요함 "Student" 라는 생성자
//	
//	  
//	  Student() {} // 생성자를 불러내기 위해 필요함 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 
//
//	  ex) Student student = new Student("1개"); <<< 이걸 쓰기위해서 필요함(생성자가 1개일때)
//	  ex) Student student = new Student("1개","2개"); <<< 이걸 쓰기위해서 필요함(생성자가 2개일때)
//	  ex) Student student = new Student("1개","2개","3개"); <<< 이걸 쓰기위해서 필요함(생성자가 3개일때)
//	  ex) Student student = new Student("1개","2개","3개","4개"); <<< 이걸 쓰기위해서 필요함(생성자가 4개일때)
//	  
//	  Student (String a) { // 생성자가 1개 일때
//	  	this.a = a;
//	  }
//	 
//	  Student (String a, String b) { // 생성자가 2개 일때
//	  	this.a = a;
//	  	this.b = b;
//	 
//	  Student (String a, String b, String c) { // 생성자가 3개 일때
//	  	this.a = a;
//	  	this.b = b;
//	  	this.c = c;
	  
	  
	  
	  
	  

//	
//	Student(String studentNo, String name, String mojor, String yy){
//		
//		this.studentNo = studentNo;
//		this.name = name;
//		this.mojor = mojor;
//		this.yy = yy;		
//	}
//
//	public String getStudentNo() {
//	return this.studentNo;
//	}
//
//	public void setStudentNo(String studentNo) {
//		this.studentNo = studentNo;
//	}
//
//	public String getName() {
//		return this.name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getMojor() {
//		return this.mojor;
//	}
//
//	public void setMojor(String mojor) {
//		this.mojor = mojor;
//	}
//
//	public String getYy() {
//		return this.yy;
//	}
//
//	public void setYy(String yy) {
//		this.yy = yy;
//	}
//	
//	public void StudentInfo() {
//		System.out.println("학번 : "+studentNo+"이름 : "+name+"전공 : "+mojor+"생년월일 : "+yy);
//	}
//	
//*/	
		
	
	
	
	
	
	
	
	
	
	
	 String studentNo;
	 String name;
	 String major;
	
	Student(){
	}
	
	Student(String studentNo, String name, String major){ //생성자 오버로딩 : 생성자 타입을 다르게 해서 여러번 정의하는것
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}
	// 매소드 리턴타입 메소드명 매개변수 >>> 시그너처
	String getStudentNo() {
		return this.studentNo;
	}
	String getName() { // 똑같은 매소드일 경우 변수를 입력해서 다르게 해야한다. 오버로딩 가능
		return this.name;
	}
	String getMajor() {
		return this.major;
	}
	void setStudentNo(String studentNo) {
		this.studentNo = studentNo; // this 는 필드 String StudentNo 는 매개변수
	}
	void setName(String name) {
		this.name = name;
	}
	void setMajor(String major) {
		this.major = major;
	}
	@Override
	public String toString() {
		return "Student [studentNo=" + studentNo + ", name=" + name + ", major=" + major + "]";
	}
	
}
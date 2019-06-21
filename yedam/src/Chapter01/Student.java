package Chapter01;

public class Student {

	String name;
	int age;

	public Student(String name, int age) {
		this.name= name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.name == ((Student) obj).name && this.age == ((Student) obj).age)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Student s1 = new Student("hong", 20);
		Student s2 = new Student("hong", 20);

		System.out.println(s1.equals(s2));
	}

}

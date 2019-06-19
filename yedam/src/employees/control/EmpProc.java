package employees.control;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import employees.EmpService;
import employees.Employee;
import employees.impl.EmpServiceImpl;

public class EmpProc {
	Scanner sc = new Scanner(System.in);
	EmpService service = EmpServiceImpl.getInstance();

	public void execute() {

		loginCheck(); // 로그인체크
		int menu = 0;
		while (true) {

			System.out.println("메뉴를 선택하세요. 1)단건조회   2)전체조회   3)입력   4)수정   5)삭제   9)종료");

			menu = sc.nextInt();

			if (menu == 1) { // 단건 조회
				getEmpProc();
			} else if (menu == 2) { // 전체 조회
				getEmpListProc();
			} else if (menu == 3) { // 3번 입력
				insertEmp();
			} else if (menu == 4) { // 4번 수정
				updateEmp();
			} else if (menu == 5) { // 5번 삭제
				deleteEmp();
			} else if (menu == 9) { // 종료

				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			}
		}
	}

	// 로그인 체크
	public void loginCheck() {

		Map<String, String> map = service.memberInfo();

		while (true) {

			System.out.println("ID를 입력하세요.");
			String id = sc.nextLine();
			System.out.println("비밀번호를 입력하세요.");
			String pw = sc.nextLine();

			if (map.containsKey(id)) {

				if (map.get(id).equals(pw)) {
					System.out.println("===로그인이 되었습니다===\n");
					break;
				} else {

					System.out.println("패스워드가 틀렸습니다. 다시 입력해주세요");
				}
			} else {
				System.out.println("존재하지않는 아이디입니다. 다시입력해주세요.");
			}
		}
	}

	// 3번. 입력
	public void insertEmp() {

		System.out.println("1) 아이디를 입력하세요. ");
		int empId = sc.nextInt();
		sc.nextLine();

		System.out.println("2) 이름을 입력하세요. ");
		String firstName = sc.nextLine();

		System.out.println("3) 성을 입력하세요. ");
		String lastName = sc.nextLine();

		System.out.println("4) 금액을 입력하세요. ");
		int salary = sc.nextInt();
		sc.nextLine();

		System.out.println("5) 이메일을 입력하세요. ");
		String email = sc.nextLine();

		System.out.println("6) 직업을 입력하세요. ");
		String job_id = sc.nextLine();

		Employee emp = new Employee(empId, firstName, lastName, salary);
		emp.setEmail(email);
		emp.setJobId(job_id);
		service.insertEmp(emp);
	}

	// 4번 수정
	public void updateEmp() {

		System.out.println("1) 수정할 아이디를 입력하세요. ");
		int empId = sc.nextInt();
		sc.nextLine();

		System.out.println("4) 수정할 금액을 입력하세요. ");
		int salary = sc.nextInt();
		sc.nextLine();

		System.out.println("5) 수정할 이메일을 입력하세요. ");
		String email = sc.nextLine();

		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		emp.setEmail(email);
		emp.setSalary(salary);
		service.updateEmp(emp);
	}

	// 5번 삭제
	public void deleteEmp() {

		System.out.println("1) 삭제할 아이디를 입력하세요. ");
		int empId = sc.nextInt();
		sc.nextLine();

		Employee emp = new Employee();
		emp.setEmployeeId(empId);
		service.deleteEmp(emp);
	}

	// 1번 단건조회
	public void getEmpProc() {
//		EmpService service = new EmpServiceImpl(); // 신규생성된 클래스
		System.out.println("조회할 ID를 입력하세요.");
		int empId = sc.nextInt();
		Employee emp = service.getEmp(empId);
		System.out.println(emp);
	}

	// 2번 전체조회
	public void getEmpListProc() {

//		EmpService service = new EmpServiceImpl();
		List<Employee> list = service.getEmpList();
		for (Employee emp : list) {
			System.out.println(emp);
		}

	}

}

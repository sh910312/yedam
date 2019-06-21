package ac.yedam.prod.control;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import ac.yedam.prod.InOutService;
import ac.yedam.prod.InOutVo;
import ac.yedam.prod.ProductService;
import ac.yedam.prod.ProductVo;
import ac.yedam.prod.impl.InOutServiceImpl;
import ac.yedam.prod.impl.ProductServiceImpl;

public class ProdProc {

	Scanner sc = new Scanner(System.in);
	ProductService service = ProductServiceImpl.getInstance();
	InOutService service1 = InOutServiceImpl.getInstance();

	public void execute() {

		System.out.println("\t\t\t\t\t로그인을 하세요 (아이디:1111 비밀번호:1111)\n");

		loginCheck(); // 로그인 메소드

		while (true) {

			int main = 0;
			int menu = 0;
			int menu1 = 0;

			while (true) {
				System.out.println("\n 메뉴를 선택하세요. 1)상품 2)재고 3)만든이 ================== 9)종료");

				try {
					main = sc.nextInt();
					sc.nextLine();
				} catch (InputMismatchException e) {
					System.out.println("=====존재하지 않는 메뉴입니다! 다시 입력해주세요 1)상품 2)재고 3)만든이 9)종료=====");
					sc.nextLine();
					continue;
				}
			
			
				if (main == 1) { // 1번 메인화면

					System.out.println("메뉴를 선택하세요. 1)상품조회 2)상품등록 3)상품변경) 4)상품전체조회 5)상위메뉴");

					try {
						menu = sc.nextInt();
						sc.nextLine();
					} catch (InputMismatchException e) {
						System.out.println("=====존재하지 않는 메뉴입니다! 다시 입력해주세요 1)상품조회 2)상품등록 3)상품변경) 4)상품전체조회 5)상위메뉴=====");
						sc.nextLine();
						continue;
					}
				
			
					sc.nextLine();
					if (menu == 1) { // 1번 상품조회
						getPvo();
					} else if (menu == 2) { // 상품등록
						insertPvo();
					} else if (menu == 3) { // 상품변경
						updatePvo();
					} else if (menu == 4) { // 전상품조회
						getPvoList();
					} else if (menu == 5) { // 상위메뉴
						continue;
					}
					
				}	
				
				
					
				else if (main == 2) { // 2번 재고
					System.out.println("메뉴를 선택하세요. 1)입고등록 2)출고등록 3)총수량 5)상위메뉴");

					try {
						menu1 = sc.nextInt();
						sc.nextLine();
					} catch (InputMismatchException e) {
						System.out.println("=====존재하지 않는 메뉴입니다! 다시 입력해주세요 1)입고등록 2)출고등록 3)총수량 5)상위메뉴=====");
						sc.nextLine();
						continue;
					}
					
				
		
					sc.nextLine();

					if (menu1 == 1) { // 입고
						insertIOV();
					} else if (menu1 == 2) { // 출고
						insertIOV1();
					} else if (menu1 == 3) { // 전체재고
						getIOVList();
					} else if (menu1 == 5) { // 상위메뉴
						continue;
					}

				 else if (main == 3) {
					System.out.println("======================================================");
					System.out.println("\t김수호 : 열심히합니다");
					System.out.println("======================================================");
				} else if (main == 9) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					}
		
				}
				
			}	
		}	

	// 로그인
	public void loginCheck() {

		Map<String, String> map = service.memberInfo();

		while (true) {

			System.out.println("=========ID를 입력하세요=========");
			String id = sc.nextLine();
			System.out.println("=======비밀번호를 입력하세요=======");
			String pw = sc.nextLine();

			if (map.containsKey(id)) {

				if (map.get(id).equals(pw)) {
					for (int a = 0; a <= 10; a++) {
						System.out.println("★====★====★ 로그인 완료 ★====★====★");
					}
					break;

				} else {

					System.out.println("패스워드가 틀렸습니다. 다시 입력해주세요");
				}
			} else {
				System.out.println("존재하지않는 아이디입니다. 다시입력해주세요.");
			}
		}
	}

	// 1번 상품조회
	public void getPvo() {

		System.out.println("조회할 상품을 입력하세요.");
		String code = sc.nextLine();
		ProductVo pvo = service.getPvo(code);
		System.out.println(pvo);
	}

	// 2번 상품등록
	public void insertPvo() {

		System.out.println("1) 등록할 상품코드를 입력하세요 ");
		String code = sc.nextLine();

		System.out.println("2) 상품이름을 입력하세요. ");
		String name = sc.nextLine();

		System.out.println("3) 금액을 입력하세요. ");
		int price = sc.nextInt();
		sc.nextLine();

		ProductVo pvo = new ProductVo(code, name, price);

		service.insertPvo(pvo);
	}

	// 3번 상품변경

	public void updatePvo() {

		System.out.println("1) 변경할 상품코드를 입력하세요. ");
		String code = sc.nextLine();
		sc.nextLine();

		System.out.println("2) 변경할 상품이름을 입력하세요. ");
		String name = sc.nextLine();

		System.out.println("3) 변경할 상품금액을 입력하세요. ");
		int price = sc.nextInt();
		sc.nextLine();

		ProductVo pvo = new ProductVo();
		pvo.setCode(code);
		pvo.setName(name);
		pvo.setPrice(price);

		service.updatePvo(pvo);

	}

	// 4번 전상품 조회
	public void getPvoList() {

		List<ProductVo> list = service.getPvoList();
		for (ProductVo Pvo : list) {
			System.out.println(Pvo);
		}
	}

	// 입고등록
	public void insertIOV() {

		System.out.println("1) 입고코드를 입력하세요. ");
		String code = sc.nextLine();

		System.out.println("2) 입고 수량을 입력하세요. ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.println("3) 입고 날짜를 입력하세요.(예> 2019년 06월 20일");
		String data = sc.nextLine();

		InOutVo iov = new InOutVo(code, number, data);

		service1.insertIOV(iov);
	}

	// 출고등록
	public void insertIOV1() {

		System.out.println("1) 출고코드를 입력하세요 ");
		String code = sc.nextLine();
		sc.nextLine();
		System.out.println("2) 출고 수량을 입력하세요. ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("3) 출고 날짜를 입력하세요.(예> 2019년 06월 20일");
		String data = sc.nextLine();

		InOutVo iov = new InOutVo(code, number, data);

		service1.insertIOV(iov);
	}

	// 재고 총 수량
	public void getIOVList() {

		List<InOutVo> list = service1.getIOVList();
		for (InOutVo iov : list) {
			System.out.println(iov);
		}
	}

}

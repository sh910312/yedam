package ac.yedam.prod.control;

import java.util.List;
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

		int main = 0;

		while (true) {

			System.out.println("메뉴를 선택하세요. 1)상품 2)재고 9)종료");

			main = sc.nextInt();
			sc.nextLine();

			if (main == 1) {

				int menu = 0;
				System.out.println("메뉴를 선택하세요. 1)상품조회 2)상품등록 3)상품변경) 4)상품전체조회 5)종료");
				menu = sc.nextInt();

				if (menu == 1) { // 상품단건조회
					getPvo();
				} else if (menu == 2) { // 상품등록
					insertPvo();
				} else if (menu == 3) { // 상품변경
					updatePvo();
		
				} else if (menu == 4) { // 상품 전체조회
					getPvoList();
				}
			} else if (main == 2) {

				int menu1 = 0;
				System.out.println("메뉴를 선택하세요. 1)입고처리 2)출고처리 3)전체재고 5)상위메뉴");
				menu1 = sc.nextInt();

				if (menu1 == 1) { // 입고처리

				} else if (menu1 == 2) { // 출고처리

				} else if (menu1 == 3) { // 전체재고
					getIOVList();
				} else if (menu1 == 5) { // 상위메뉴

				}

			}

			else if (main == 9) { // 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			}
		}
	}

	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ product 상품 단건 조회 1번 입력시
	public void getPvo() {

		System.out.println("조회할 상품을 입력하세요.");
		String code = sc.nextLine();
		ProductVo pvo = service.getPvo(code);
		System.out.println(pvo);
	}

	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ product 상품 등록 ProductVo 부분 2번 입력
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

	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ product 상품변경 3번 입력

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

	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ product 상품 전체 조회 4번 입력
	public void getPvoList() {

		List<ProductVo> list = service.getPvoList();
		for (ProductVo Pvo : list) {
			System.out.println(Pvo);
		}
	}

	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ TXN 상품 전체 조회 4번 입력
	public void getIOVList() {

		List<InOutVo> list = service1.getIOVList();
		for (InOutVo iov : list) {
			System.out.println(iov);
		}
	}

}

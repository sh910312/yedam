package AAAA;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableEx {

	public static void main(String[] args) {

		Map<String, String> map = new Hashtable<>();
		map.put("String", "11");
		map.put("Summer", "111");
		map.put("fall", "1111");
		map.put("winter", "111111");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=====아이디 비밀번호 입력하세요=====\n");
			System.out.println("아이디를 입력하세요");
			String id = sc.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String pw = sc.nextLine();

			System.out.println();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인완료");
					break;
				} else
					System.out.println("-비밀번호가 일치하지 않습니다 다시 입력하세요-\n");
			} else {
				System.out.println("-입력한 아이디가 존재하지않습니다. 다시 입력하세요-");
			}

		}

	}

}

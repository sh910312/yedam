package TEST;

public class AccountExample { // 예외처리 클래스

		public static void main(String[] args) {
			try {
				findClass();
			} catch (ClassNotFoundException e) {
				System.out.println("존재하지안흔ㄴ ㅋ클래스");
				e.printStackTrace();
			}

		}

		static void findClass() throws ClassNotFoundException {

			Class t = Class.forName("java.lang.String2");
			System.out.println(t.getName());

		}
	}
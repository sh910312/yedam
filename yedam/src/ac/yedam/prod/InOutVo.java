package ac.yedam.prod;

public class InOutVo {

	private String code; // 코드이름

	private int number; // 출고숫자

	private int data; // 날짜

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "InOutVo [code=" + code + ", number=" + number + ", data=" + data + "]";
	}

}

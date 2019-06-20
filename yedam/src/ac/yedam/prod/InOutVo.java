package ac.yedam.prod;

public class InOutVo {

	private String code; // 코드이름
	private int number; // 입출고 숫자
	private String data; // 날짜

	public InOutVo() {
		super();
	}

	public InOutVo(String code, int number, String data) {
		super();
		this.code = code;
		this.number = number;
		this.data = data;
	}

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

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "InOutVo [code=" + code + ", number=" + number + ", data=" + data + "]";
	}

}

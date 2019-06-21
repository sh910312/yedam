package ac.yedam.prod;

public class ProductVo {

	private String code; // 상품코드
	private String name; // 상품이름
	private int price; // 상품가격

	public ProductVo() {
		super();
	}

	public ProductVo(String code, String name, int price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductVo [code=" + code + ", name=" + name + ", price=" + price + "]";
	}

}

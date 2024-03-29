package ac.yedam.prod;

import java.util.List;
import java.util.Map;

public interface ProductService { // 상품정보

	public ProductVo getPvo(String code); // 상품조회

	public void insertPvo(ProductVo pvo); // 상품등록

	public void updatePvo(ProductVo pvo); // 상품수정

	public List<ProductVo> getPvoList(); // 전체조회

	Map<String, String> memberInfo(); // 로그인체크

}
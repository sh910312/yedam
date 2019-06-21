package ac.yedam.prod.impl;

import java.util.List;
import java.util.Map;

import ac.yedam.prod.ProductService;
import ac.yedam.prod.ProductVo;

public class ProductServiceImpl implements ProductService {
	private static ProductServiceImpl singLeton = new ProductServiceImpl();
	private ProductServiceImpl() {
	}
	public static ProductServiceImpl getInstance() {
		return singLeton;
	}
	ProductDAO dao = new ProductDAO();

	@Override
	public ProductVo getPvo(String code) { // 상품 조회
		return dao.getPvo(code);
	}
	@Override
	public void insertPvo(ProductVo pvo) { // 상품 등록
		dao.insertPvo(pvo);
	}
	@Override
	public void updatePvo(ProductVo pvo) { // 상품 수정
		dao.updatePvo(pvo);
	}
	@Override
	public List<ProductVo> getPvoList() { // 전체조회
		return dao.getPvoList();
	}
	@Override
	public Map<String, String> memberInfo() { // 로그인
		
		return dao.memberInfo();
	}

}

package ac.yedam.prod.impl;

import java.util.List;

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
	public ProductVo getPvo(String code) { // 한건 검색
		return dao.getPvo(code);
	}
	@Override
	public void insertPvo(ProductVo pvo) { // 입력
		dao.insertPvo(pvo);
	}
	@Override
	public void updatePvo(ProductVo pvo) { // 수정
		dao.updatePvo(pvo);
	}
	@Override
	public List<ProductVo> getPvoList() { // 전체조회
		return dao.getPvoList();
	}

}

package ac.yedam.prod.impl;

import java.util.List;

import ac.yedam.prod.InOutService;
import ac.yedam.prod.InOutVo;

public class InOutServiceImpl implements InOutService {
	private static InOutServiceImpl singLeton = new InOutServiceImpl();

	private InOutServiceImpl() {
	}

	public static InOutService getInstance() {
		return singLeton;
	}

	InOutDAO dao = new InOutDAO();

	@Override
	public void insertIOV(InOutVo iov) { // 입고등록
		dao.insertIOV(iov);

	}

	@Override
	public void insertIOV1(InOutVo iov) { // 출고등록
		dao.insertIOV1(iov);

	}

	@Override
	public List<InOutVo> getIOVList() { // 재고 총 수량

		return dao.getIOVList();
	}

}
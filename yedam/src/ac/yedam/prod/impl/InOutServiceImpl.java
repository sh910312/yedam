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
	public List<InOutVo> getIOVList() { // 전체조회

		return dao.getIOVList();
	}
}
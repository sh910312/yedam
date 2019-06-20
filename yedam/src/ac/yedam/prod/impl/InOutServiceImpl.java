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
	public void insertIOV(InOutVo iov) {
		dao.insertIOV(iov);

	}

	@Override
	public void insertIOV1(InOutVo iov) {
		dao.insertIOV1(iov);

	}

	@Override
	public List<InOutVo> getIOVList() {

		return dao.getIOVList();
	}

}
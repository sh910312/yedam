package ac.yedam.prod;

import java.util.List;

public interface InOutService { // 입출고관리

	// 입고
	public void insertIOV(InOutVo iov);

	// 출고
	public void insertIOV1(InOutVo iov);

	// 전체재고
	public List<InOutVo> getIOVList();

}

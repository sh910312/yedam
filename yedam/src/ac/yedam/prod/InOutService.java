package ac.yedam.prod;

import java.util.List;

public interface InOutService {

	
	//입고
	public void insertIOV(InOutVo iov);	
	
	//출고
	public void insertIOV1(InOutVo iov);
	
	//전체재고
	public List<InOutVo> getIOVList(); //전체조회
	
		
	//상위메뉴
	
	
}


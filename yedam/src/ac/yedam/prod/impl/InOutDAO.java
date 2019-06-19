package ac.yedam.prod.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ac.yedam.prod.InOutVo;
import employees.common.DAO;

public class InOutDAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ 전체 조회
	public List<InOutVo> getIOVList() {

		conn = DAO.getConnet();
		String sql = "select product_code, txn_qty, receipt_issue_date from yedam_prod_txn";

		InOutVo iov = null;
		List<InOutVo> list = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {

				iov = new InOutVo();

				iov.setCode(rs.getString("product_code"));
				iov.setNumber(rs.getInt("txn_qty"));
				iov.setData(rs.getInt("receipt_issue_date"));
				list.add(iov);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return list;

	}

}
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

	// 입고
	public void insertIOV(InOutVo iov) {

		conn = DAO.getConnet();
		String sql = "insert into yedam_prod_txn values(?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, iov.getCode());
			pstmt.setInt(2, iov.getNumber());
			pstmt.setString(3, iov.getData());

			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입고등록 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 출고
	public void insertIOV1(InOutVo iov) {

		conn = DAO.getConnet();
		String sql = "insert into yedam_prod_txn values(?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, iov.getCode());
			pstmt.setInt(2, iov.getNumber());
			pstmt.setString(3, iov.getData());

			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 출고등록 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 재고 총 수량
	public List<InOutVo> getIOVList() {

		conn = DAO.getConnet();
		String sql = "select * from onhand_view";

		InOutVo iov = null;
		List<InOutVo> list = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {

				iov = new InOutVo();

				iov.setCode(rs.getString("product_code"));
				iov.setNumber(rs.getInt("onhand_qty"));
				
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
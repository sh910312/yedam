package ac.yedam.prod.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ac.yedam.prod.ProductVo;
import employees.common.DAO;

public class ProductDAO {

	// 필요한 필드 선언
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ 상품 단건 조회
	public ProductVo getPvo(String code) {

		conn = DAO.getConnet();

		String sql = "select product_code, product_name, pruduct_price	from yedam_product	where product_code='" + code
				+ "'";

		ProductVo pvo = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			if (rs.next()) {

				pvo = new ProductVo();

				pvo.setCode(rs.getString("product_code"));
				pvo.setName(rs.getString("product_name"));
				pvo.setPrice(rs.getInt("pruduct_price"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return pvo;
	}

	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ 상품 등록 ProductVo 부분 2번 입력
	public void insertPvo(ProductVo pvo) {

		conn = DAO.getConnet();
		String sql = "insert into yedam_product (PRODUCT_CODE, PRODUCT_NAME, PRUDUCT_PRICE)" + "values (?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, pvo.getCode());
			pstmt.setString(2, pvo.getName());
			pstmt.setInt(3, pvo.getPrice());

			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 등록 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ 상품변경 3번 입력

	public void updatePvo(ProductVo pvo) {

		conn = DAO.getConnet();
		String sql = "update yedam_product set product_name = ?, pruduct_price = ? where product_code = ?";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, pvo.getName());
			pstmt.setInt(2, pvo.getPrice());
			pstmt.setString(3, pvo.getCode());

			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 수정 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★ 상품 전체 조회 4번 입력
	public List<ProductVo> getPvoList() {

		conn = DAO.getConnet();
		String sql = "select product_code, product_name, pruduct_price from yedam_product";

		ProductVo pvo = null;
		List<ProductVo> list = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {

				pvo = new ProductVo();

				pvo.setCode(rs.getString("product_code"));
				pvo.setName(rs.getString("product_name"));
				pvo.setPrice(rs.getInt("pruduct_price"));
				list.add(pvo);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return list;

	}

}
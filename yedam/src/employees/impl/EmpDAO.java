package employees.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import employees.Employee;
import employees.common.DAO;

public class EmpDAO {
	// 필요한 필드 선언.
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	// 4번 수정
	public void updateEmp(Employee emp) {

		conn = DAO.getConnet();
		String sql = "update emp_temp set email= ?, salary = ? where employee_id = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getEmail());
			pstmt.setInt(2, emp.getSalary());
			pstmt.setInt(3, emp.getEmployeeId());

			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 수정 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 5번 삭제
	public void deleteEmp(Employee emp) {

		conn = DAO.getConnet();
		String sql = "delete from emp_temp where employee_id = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());

			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 삭제 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 로그인체크
	public Map<String, String> memberInfo() {

		conn = DAO.getConnet();
		String sql = "select id, passwd from login_temp";
		String id, pw;

		Map<String, String> map = new HashMap<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("passwd");
				map.put(id, pw);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return map;
	}

	// 1번 입력
	public void insertEmp(Employee emp) {

		conn = DAO.getConnet();
		String sql = "insert into emp_temp (employee_id, first_name, last_name, email, salary, job_id, hire_date)"
				+ "values (?,?,?,?,?,?,sysdate)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setInt(5, emp.getSalary());
			pstmt.setString(6, emp.getJobId());

			int r = pstmt.executeUpdate();
			System.out.println(r + " 건이 입력 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 2번 전체사원조회.
	public List<Employee> getEmpList() {

		conn = DAO.getConnet();
		String sql = "select employee_id, first_name, last_name, salary," + "email, job_id from emp_temp";

		Employee emp = null;
		List<Employee> list = new ArrayList<>();

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {

				emp = new Employee();

				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
				list.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return list;
	}

	// 한건 조회
	public Employee getEmp(int empId) {

		conn = DAO.getConnet();
		String sql = "select employee_id, first_name, last_name, salary,"
				+ "email, job_id from emp_temp where employee_id=" + empId;

		Employee emp = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {

				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));// 101
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setEmail(rs.getString("email"));
				emp.setJobId(rs.getString("job_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return emp;
	}
}

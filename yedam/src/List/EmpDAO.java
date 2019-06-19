package List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	public static void main(String[] agrs) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Connection conn = DriverManager.getConnection(url, user, pw);
		PreparedStatement pstmt = conn
				.prepareStatement("select employee_id, first_name, last_name, email from employees");

		ResultSet rs = pstmt.executeQuery();
		Employees emp = null;
		List<Employees> list = new ArrayList<>();

		while (rs.next()) {

			emp = new Employees();
			emp.setEmployeeId(rs.getInt("employee_id"));
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastname(rs.getString("last_name"));
			emp.setEmail(rs.getString("email"));

			list.add(emp);

		}
		for (Employees empl : list) {
			System.out.println(empl.getEmployeeId()+"\t"+empl.getFirstName() + "-" + empl.getLastname()+"\t\t"+empl.getEmail());
		}

	}
}

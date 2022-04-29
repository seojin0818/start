package test.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GitJDBC {

	public GitJDBC() {
		// 이 클래스가 new 될 때 드라이버로딩이 되도록 처리
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			System.out.println("##### 드라이버 로딩 실패 #####");
		}
	}
	
	// 데이터베이스 작업을 위해 접속이 필요한 경우 커넥션을 만들어서 반환해주는 함수
	public Connection getCon() {
		Connection con = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jennie";
		String pw = "12345";
		
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {}
		return con;
	}
	
	public Connection getCon(String user, String pw) {
		Connection con = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try {
			con = DriverManager.getConnection(url, user, pw);
		} catch(Exception e) {}
		return con;
	}
	
	// Statement가 필요하면 준비해서 반환해주는 함수
	public Statement getStmt(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {}
		return stmt;
	}
	
	// PreparedStatement가 필요하면 준비해서 반환해주는 함수
	public PreparedStatement getPstmt(Connection con, String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		} catch(Exception e) {}
		return pstmt;
	}
	
	// 사용하지 않는 자원을 반환해주는 함수
	public void close(Object o) {
		try {
			if(o instanceof Connection) {
				((Connection) o).close();
			} else if(o instanceof Statement) {
				((Statement) o).close();
			} else if(o instanceof PreparedStatement) {
				((PreparedStatement) o).close();
			} else if(o instanceof ResultSet) {
				((ResultSet) o).close();
			}
		} catch(Exception e) {}
	}
}
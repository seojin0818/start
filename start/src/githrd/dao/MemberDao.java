package githrd.dao;

import java.sql.*;

import githrd.db.*;

public class MemberDao {
	private JennieJDBC db;
	private Connection con;
	
	public MemberDao() {
		db = new JennieJDBC();
		/*
		// 테스트용...
		con = db.getCon();
		System.out.println("######### 커넥션 꺼내오기 성공 ###########");
		db.close(con);
		*/
	}

}

package test.dao;

import java.sql.*;
import java.util.*;

import test.db.*;
import test.sql.*;
import test.vo.*;

public class MemberDao {

	private GitJDBC db;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private MemberSQL mSQL;
	
	public MemberDao() {
		db = new GitJDBC();
		
		mSQL = new MemberSQL();
	}
	
	// 회원번호를 입력하면 해당 회원의 아이디, 이름, 이메일을 출력해주는 함수
	public MemberVO getMembInfo(int mno) {
		MemberVO mVO = new MemberVO();
		con = db.getCon();
		String sql = mSQL.getSQL(mSQL.SEL_MEMBER_INFO);
		pstmt = db.getPstmt(con, sql);
		try {
			pstmt.setInt(1, mno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				mVO.setId(rs.getString("id"));
				mVO.setName(rs.getString("name"));
				mVO.setMail(rs.getString("mail"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		return mVO;
	}
}

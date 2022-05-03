package test.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import day19.Member;
import test.db.GitJDBC;
import test.sql.MemberSQL;
import test.vo.MemberVO;

/*
 	
 	1. 회원번호를 입력하면 그 회원의 메일을 출력하는 기능
 	
 	2. 성별을 입력하면 해당 성별을 가진 회원의 
 		회원번호, 회원이름, 아이디, 메일을 출력해주는 기능
 		
 */


public class Memb01 {
	private GitJDBC db;
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private MemberSQL mSQL;
	private MemberVO mVO;
	

	public Memb01() {
		
	}

	/*
	 * public final int SEL_MAIL = 1001; public final int SEL_GENINFO = 1002;
	 * StringBuffer buff = new StringBuffer();
	 * 
	 * switch(code) { case SEL_MAIL: buff.append("SELECT "); buff.append("	mail ");
	 * buff.append("FROM "); buff.append("	member "); buff.append("WHERE ");
	 * buff.append("	mno = ? ");
	 * 
	 * 
	 * case SEL_GENINFO: buff.append("SELECT ");
	 * buff.append("	mno, name, id, mail "); buff.append("FROM ");
	 * buff.append("	member "); buff.append("WHERE "); buff.append("	gen = ? ");
	 * 
	 * }
	 */
	
	/*
	// 회원번호를 입력하면 그 회원의 메일을 출력하는 함수
		public String getMembInfo(int mno) {
			con = db.getCon();
			String sql = mSQL.getSQL(mSQL.SEL_MEMBER_INFO);
			pstmt = db.getPstmt(con, sql);
			MemberVO mVO = new MemberVO();
			try {
				pstmt.setInt(1, mno);
				rs = pstmt.executeQuery();
				while(rs.next()) {
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
		*/
		

		/*
	// 성별을 입력하면 해당 성별을 가진 회원의 회원번호, 회원이름, 아이디, 메일을 출력해주는 함수
		public ArrayList<MemberVO> getGenInfo(String gen){
			ArrayList<MemberVO> list = new ArrayList<MemberVO>();
			con = db.getCon();
			String sql = mSQL.getSQL(mSQL.SEL_GENINFO);
			pstmt = db.getPstmt(con, sql);
			try {
				pstmt.setString(1, gen);
				rs = pstmt.executeQuery();
				while(rs.next()) {
				MemberVO mVO = new MemberVO();
				mVO.setMno(rs.getInt("mno"));
				mVO.setName(rs.getString("name"));
				mVO.setId(rs.getString("id"));
				mVO.setMail(rs.getString("mail"));
				
				list.add(mVO);
				
				} catch(Exception e) {
					e.printStackTrace();
				} finally {
					db.close(rs);
					db.close(pstmt);
					db.close(con);
				}
				return list;
			}
		
			ArrayList<MemberVO> glist = mDao.getGenInfo("F");
			for(MemberVO m : glist) {
				System.out.println(m);
			}
		}
	*/
}
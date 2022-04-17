package githrd.dao;

import java.sql.*;
import java.util.ArrayList;

import githrd.db.*;
import githrd.sql.*;
import githrd.vo.MemberVO;

public class MemberDao {
	private JennieJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private MemberSQL mSQL;
	
	public MemberDao() {
		db = new JennieJDBC();
		
		// 질의명령을 사용할 준비
		mSQL = new MemberSQL();
	}
		
		/*
		
		테스트용
		con = db.getCon();
		System.out.println("######### 커넥션 꺼내오기 성공 ###########");
		db.close(con);
		
		*/
		
		// 회원번호와 아이디를 조회해서 출력해주는 함수
		public ArrayList<MemberVO> getInfo() {
			// 할 일
			// 반환값 변수 만들고
			ArrayList<MemberVO> list = new ArrayList<MemberVO>();
			
			// 커넥션 연결하고
			con = db.getCon();
			
			// 질의명령 가져오고
			String sql = mSQL.getSQL(mSQL.SEL_ALL);
			
			// 명령 전달 도구 준비하고
			stmt = db.getStmt(con);
			
			try {
				// 질의명령 보내고 결과 받고
				rs = stmt.executeQuery(sql);
				// 데이터 추출
				while(rs.next()) {
					// 한명의 데이터를 저장할 VO를 new 시키고
					MemberVO mVO = new MemberVO();
					
					// 데이터 꺼내고
					int mno = rs.getInt("mno");
					String id = rs.getString("id");
				
					// VO에 채우고
					mVO.setMno(mno);
					mVO.setId(id);
					
					// VO가 완성 됐으므로 list에 채워주기
					list.add(mVO);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				db.close(rs);
				db.close(stmt);
				db.close(con);
		}
			
			return list;
	}
	
		// 회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
		public ArrayList<MemberVO> getMnoInfo(int mno){
			// 반환값 변수
			ArrayList<MemberVO> list = new ArrayList<MemberVO>();
			
			// 커넥션 연결하고
			con = db.getCon();
			
			// 질의명령 가져오고
			String sql = mSQL.getSQL(mSQL.SEL_MNO);
			
			// 명령전달도구 준비하고
			pstmt = db.getPstmt(con, sql);
			
			try {
				// 질의명령 완성하고
				pstmt.setInt(1, mno);
				// 질의명령 보내고 결과 받고
				rs = pstmt.executeQuery();
				// 데이터 꺼내고
				while(rs.next()) {
					// 한명분 데이터 저장할 VO 만들고
					MemberVO mVO = new MemberVO();
					// 데이터 꺼내서 채우고
					mVO.setMno(rs.getInt("mno"));
					mVO.setName(rs.getString("name"));
					mVO.setId(rs.getString("id"));
					mVO.setPw(rs.getString("pw"));
					mVO.setMail(rs.getString("mail"));
					mVO.setTel(rs.getString("tel"));
					
					// 리스트에 VO 담고
					list.add(mVO);
				}
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				db.close(rs);
				db.close(pstmt);
				db.close(con);
			}
			
			return list;
		}
		
		// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수
		public int updateTel(String id) {
			// 할일
			// 반환값 변수
			int cnt = 0;
			
			// 커넥션 연결하고
			con = db.getCon();
			
			// 질의명령 가져오고
			String sql = mSQL.getSQL(mSQL.UPD_TEL);
			
			// 명령전달도구 준비하고
			pstmt = db.getPstmt(con, sql);
			
			try {
				// 질의명령 완성하고
				pstmt.setString(1, id);
				pstmt.setString(2, tel);
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				db.close(pstmt);
				db.close(con);
			}
		}
}

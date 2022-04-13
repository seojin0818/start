package empProj.dao;

/*
	
	이 클래스는 JEmp 테이블에 관련된 데이터베이스 작업만 전담으로 처리해주는 기능들을 모아놓은 클래스
	
 */

import empProj.db.*;
import empProj.sql.*;
import empProj.vo.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.Date;

public class JEmpDao {
	private ScottJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private JEmpSQL jSQL;
	
	public JEmpDao() {
		db = new ScottJDBC();
		jSQL = new JEmpSQL();
	}
	
	// jemp 테이블 생성여부 조회 전담함수
	public int tabCnt() {
		// 반환값 변수
		int cnt = 0;
		// 할 일
		// 커넥션
		con = db.getCON();
		// 질의명령
		String sql = jSQL.getSQL(jSQL.SEL_TNAME);
		// 명령전달도구
		stmt = db.getSTMT(con);
		try {
			// 명령 보내고 결과 받고
			rs = stmt.executeQuery(sql);
			// 데이터 꺼내서 변수에 담고
			rs.next(); // 가상레코드포인터 한 줄 내리고
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		// 반환해주고
		return cnt;
	}
	
	// emp 테이블을 구조만 복사해서 jemp 테이블 만들기 전담함수
	public void addJEmp() {
		// 할 일
		// 커넥션 꺼내오고
		con = db.getCON();
		// 질의명령 꺼내오고
		String sql = jSQL.getSQL(jSQL.ADD_TABLE);
		// 명령전달도구 준비하고
		stmt = db.getSTMT(con);
		// 질의명령 보내고
		try {
			stmt.execute(sql);
			System.out.println("### JEmp 테이블 생성 완료 ###");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(stmt);
			db.close(con);
		}
	}
	
	// 이름, 직급, 부서번호를 jemp 테이블에 추가해주는 함수
	public int insertJemp(EmpVO eVO) {
		// 할 일
		// 반환값 변수
		int cnt = 0;
		// 커넥션
		con = db.getCON();
		// 질의명령
		String sql = jSQL.getSQL(jSQL.INSERT_JEMP);
		// 명령전달도구
		pstmt = db.getPSTMT(con, sql);
		try{
			// 질의명령 완성
			String name = eVO.getEname();
			String job = eVO.getJob();
			int dno = eVO.getDno();
			
			pstmt.setString(1, name);
			pstmt.setString(2,  job);
			pstmt.setInt(3,  dno);
			// 질의명령 보내고 결과 받고
			cnt = pstmt.executeUpdate();
			
			/*
			 	
			 	executeUpdate()는 반환값 타입이 int이고
			 	반환값의 의미는 테이블의 변경된 행수를 의미
			 	
			 */
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
		// 
	}
	
	// 추가 사원 정보를 반환해주는 함수
	public ArrayList<EmpVO> getNewEmp(){
		// 반환값 변수 만들기
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		// 커넥션 꺼내오기
		con = db.getCON();
		// 질의명령 가져오기
		String sql = jSQL.getSQL(jSQL.SEL_NEWEMP);
		// 명령전달도구 준비하기
		stmt = db.getSTMT(con);
		// 질의명령 보내고 결과 받고
		try {
			rs = stmt.executeQuery(sql);
			// 꺼내서 리스트에 담고
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				eVO.setEno(rs.getInt("empno"));
				eVO.setEname(rs.getString("ename"));
				eVO.setJob(rs.getString("job"));
				eVO.setHdate(rs.getDate("hiredate"));
				
				list.add(eVO);
				
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

}

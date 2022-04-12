package empProj.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import empProj.db.*;
import empProj.sql.*;
import empProj.vo.EmpVO;

public class EmpDao {
	
/*
	
	이 클래스를 사용한다는 것 = 이 클래스를 new 시킨다는 것
	그 의미는 오라클에 접속해서 scott 계정이 가지고있는 emp 테이블의 내용을 
	조회하든지, 수정하든지, 삭제하든지 등의 작업을 한다는 것
	
	따라서 이 클래스가 객체가 될 때는
	오라클을 사용할 준비가 돼있어야 함
	이 말은 드라이버 로딩이 돼있어야 한다는 것
	
 */
	
	private ScottJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private EmpSQL eSQL;
	
	public EmpDao() {
		db = new ScottJDBC();
		// 이 순간 ScottJDBC의 인스턴스가 만들어지면 오라클 드라이버를 로딩한 상태
		
		// 질의명령을 사용할 준비
		eSQL = new EmpSQL();
	}
	
	// 모든 사원의 정보를 조회해서 반환해주는 함수
	public ArrayList<EmpVO> getAll() {
		// 할일
		// 반환값 변수 만들기
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		// 이미 드라이버로딩은 끝난 상태이므로 커넥션 꺼내오기
		con = db.getCON();
		
		// 질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.SEL_ALL);
		System.out.println(sql);
		
		// 명령 전달 도구 준비하기
		stmt = db.getSTMT(con);
		
		try {
			// 질의명령 보내고 결과 받기
			rs = stmt.executeQuery(sql);
			
			// 데이터 추출하기
			while(rs.next()) {
				// 한 명의 데이터를 저장할 VO를 new 시키기
				EmpVO eVO = new EmpVO();
				
				// 데이터 꺼내기
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				
				// VO에 채우기
				eVO.setEno(eno);
				eVO.setEname(name);
				eVO.setJob(job);
				eVO.setHdate(hdate);
				eVO.setHtime(htime);
				eVO.setSdate();
				
				// VO가 완성됐으므로 list에 채워주기
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
	
	// 부서번호 리스트 조회 전담 처리함수
	public ArrayList<Integer> getDnoList(){
		// 반환값 변수
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 커넥션
		con = db.getCON();
		// 질의명령
		String sql = eSQL.getSQL(eSQL.SEL_DNOLIST);
		// 명령전달도구
		stmt = db.getSTMT(con);
		// 질의명령 보내고 결과 받고
		try {
			rs = stmt.executeQuery(sql);
			
			// 꺼내서 리스트에 담고
			while(rs.next()) {
				list.add(rs.getInt("deptno")); // 자동 boxing
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		// 리스트 반환하고
		return list;
	}
	
	// 부서리스트 조회 전담 처리함수
	public ArrayList<EmpVO> getDeptList(){
		// 반환값 변수
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		// 커넥션
		con = db.getCON();
		// 질의명령
		String sql = eSQL.getSQL(eSQL.SEL_DEPTLIST);
		// 명령전달도구
		stmt = db.getSTMT(con);
		// 질의명령 보내고 결과 받고
		try {
			rs = stmt.executeQuery(sql);
			
			// 꺼내서 리스트에 담고
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				eVO.setDno(rs.getInt("deptno"));
				eVO.setDname(rs.getString("dname"));
				
				list.add(eVO);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		// 리스트 반환하고
		return list;
		
	}
	
	// 부서번호를 입력 받아서 부서원들의 정보를 반환해주는 함수
	public ArrayList<EmpVO> getDnoInfo(int dno) {
		// 반환값 변수 만들기
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		// 이미 드라이버 로딩은 끝난 상태이므로 커넥션 꺼내오기
		con = db.getCON();
		
		// 질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.SEL_DNOINFO);
		
		// 명령 전달 도구 준비하기
		pstmt = db.getPSTMT(con, sql);
		
		try {
			// 질의명령 완성하기
			pstmt.setInt(1, dno);
			// 질의명령 보내고 결과 받기
			rs = pstmt.executeQuery();
			// 데이터 추출하기
			while(rs.next()) {
				EmpVO eVO = new EmpVO();
				// 데이터 꺼내기
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				Date hdate = rs.getDate("hiredate");
				Time htime = rs.getTime("hiredate");
				int sal = rs.getInt("sal");
				dno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				// VO에 채우기
				eVO.setEno(eno);
				eVO.setEname(name);
				eVO.setJob(job);
				eVO.setHdate(hdate);
				eVO.setHtime(htime);
				eVO.setSdate();
				eVO.setDno(dno);
				eVO.setDname(dname);
				eVO.setLoc(loc);
				
				// VO가 완성됐으므로 list에 채워주기
				list.add(eVO);
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
	
	// 직급을 입력 받아서 해당 직급 사원들의 정보를 반환해주는 함수
	public ArrayList<EmpVO> getJobInfo(String job){
		// 반환값 변수
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		
		// 이미 드라이버 로딩은 끝난 상태이므로 커넥션 꺼내오기
		con = db.getCON();
				
		// 질의명령 가져오기
		String sql = eSQL.getSQL(eSQL.SEL_JOBINFO);
				
		// 명령 전달 도구 준비하기
		pstmt = db.getPSTMT(con, sql);
				
		try {
			// 질의명령 완성하기
			pstmt.setString(1, job);
			
			// 질의명령 보내고 결과 받기
			rs = pstmt.executeQuery();
			
			// 데이터 추출하기
			while(rs.next()) {
			EmpVO eVO = new EmpVO();
			
			// 데이터 꺼내기
			int eno = rs.getInt("empno");
			String name = rs.getString("ename");
			String job1 = rs.getString("job");
			Date hdate = rs.getDate("hiredate");
			Time htime = rs.getTime("hiredate");
			int sal = rs.getInt("sal");
			int grade = rs.getInt("grade");
			String scomm = rs.getString("comm");
						
			// VO에 채우기
			eVO.setEno(eno);
			eVO.setEname(name);
			eVO.setJob(job1);
			eVO.setHdate(hdate);
			eVO.setHtime(htime);
			eVO.setSdate();
			eVO.setSal(sal);
			eVO.setGrade(grade);
			eVO.setScomm(scomm);
						
			// VO가 완성됐으므로 list에 채워주기
			list.add(eVO);
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
	
	// 모든 직급 조회해서 반환해주는 함수
	public ArrayList<String> getAllJob(){
		ArrayList<String> list = new ArrayList<String>();
		
		// Connection
		con = db.getCON();
		// sql
		String sql = eSQL.getSQL(eSQL.SEL_JOBLIST);
		// stmt
		stmt = db.getSTMT(con);
		try {
			// 명령전달하고 결과받고
			rs = stmt.executeQuery(sql);
			// 꺼내서 리스트에 담고
			while(rs.next()) {
				list.add(rs.getString("job"));
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

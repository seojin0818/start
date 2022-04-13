package empProj.sql;

/**
 * 
 * 이 클래스는 JEmp 테이블에 관련된 질의명령을 기억하고 있다가
 * 누군가 특정 질의명령을 달라고 요구하면 해당 질의명령을 반환해주는 기능을 가진 클래스
 * @author 백서진
 * @since	2022.04.13
 * @version v.1.0
 * 
 */

public class JEmpSQL {
	
	public final int SEL_TNAME			= 1001;
	
	public final int SEL_NEWEMP			= 1002;
	
	public final int INSERT_JEMP		= 3001;
	
	public final int ADD_TABLE			= 5001;
	
	// 코드를 입력 받으면서 호출되면 그 코드에 맞는 질의명령을 반환해주는 함수
	public String getSQL(int code) {
		// 반환값 변수
		// 문자열을 계속 누적시켜서 결합해야 하기 때문에
		// 이런 경우는 StringBuffer를 사용하도록 함
		StringBuffer buff= new StringBuffer();
		switch(code) {
		case SEL_TNAME:
			buff.append("SELECT ");
			buff.append("	count(*) cnt ");
			buff.append("FROM ");
			buff.append("	tab ");
			buff.append("WHERE ");
			buff.append("	tname = 'JEMP' ");
			break;
		case ADD_TABLE:
			buff.append("CREATE TABLE jemp ");
			buff.append("AS ");
			buff.append("	SELECT ");
			buff.append("		* ");
			buff.append("	FROM ");
			buff.append("		emp ");
			buff.append("	WHERE ");
			buff.append("		1 = 2 ");
			break;
		case INSERT_JEMP:
			buff.append("INSERT INTO ");
			buff.append("	jemp(empno, ename, job, hiredate, deptno) ");
			buff.append("VALUES( ");
			buff.append("		(SELECT NVL(MAX(empno) + 1, 1001) FROM jemp), ");
			buff.append("		?, ?, sysdate, ? ");
			buff.append(") ");
			break;
		case SEL_NEWEMP:
			buff.append("SELECT ");
			buff.append("	empno, ename, job, hiredate, deptno ");
			buff.append("FROM ");
			buff.append("	jemp ");
			buff.append("WHERE ");
			buff.append("	(SELECT ");
			buff.append("		MAX(empno) ");
			buff.append("	FROM ");
			buff.append("		jemp ");
			buff.append("	GROUP BY ");
			buff.append("		empno ");
			buff.append("	) ");
			break;
					}
		
		// buff를 문자열로 변환해서 반환
		return buff.toString();
	}
}

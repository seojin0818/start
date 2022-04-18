package githrd.sql;

public class MemberSQL {
	// 코드 변수
	public final int SEL_ALL	= 1001;
	public final int SEL_MNO	= 1002;
	public final int UPD_TEL	= 2003;
	
	// 질의명령을 기억하고 있다가 요청하면 반환해주는 함수
	public String getSQL(int code) {
		// 반환값을 만들 변수
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
			buff.append("	mno, id ");
			buff.append("FROM ");
			buff.append("	member ");
			break;
		case SEL_MNO:
			buff.append("SELECT ");
			buff.append("	mno, name, id, pw, mail, tel, joindate jdate ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	mno = ? ");
			break;
		case UPD_TEL:
			buff.append("UPDATE ");
			buff.append("	member ");
			buff.append("SET ");
			buff.append("	tel = ? ");
			buff.append("WHERE ");
			buff.append("	id = ? ");
			break;
		}
		
		return buff.toString();
	}
}

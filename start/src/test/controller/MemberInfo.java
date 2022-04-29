package test.controller;

import java.util.*;

import githrd.vo.MemberVO;
import test.dao.MemberDao;
import test.vo.*;

public class MemberInfo {
	private MemberDao mDao;
	
	public MemberInfo() {
		mDao = new MemberDao();
		Scanner sc = new Scanner(System.in);

		// 회원번호를 입력하면 해당 회원의 정보를 출력해주는 함수
		ArrayList<MemberVO> list = mDao.getMembInfo(sc);
		mnoInfoPrint(list);
		System.out.println();
	}
	
	public void mnoInfoPrint(ArrayList<MemberVO> list) {
		System.out.println("*** 회원 정보조회");
		System.out.println("-----------------------");
		System.out.println("아이디 | 이름 | 메일");
		System.out.println("----------------------");
		for(MemberVO mVO : list) {
			System.out.printf("%10s | %10s | %10s \n", 
					mVO.getId(), mVO.getName(), mVO.getMail());
		}
		System.out.println("----------------------");
	}

}

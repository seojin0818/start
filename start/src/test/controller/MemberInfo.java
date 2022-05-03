package test.controller;

import java.util.*;

import test.vo.*;
import test.dao.*;

public class MemberInfo {
	private MemberDao mDao;
	private MemberVO mVO;
	
	public MemberInfo() {
		
		mDao = new MemberDao();
		Scanner sc = new Scanner(System.in);
		System.out.print("회원번호를 입력하세요! : ");
		int mno = sc.nextInt();

		// 회원번호를 입력하면 해당 회원의 정보를 출력해주는 함수
		MemberVO mvo = mDao.getMembInfo(mno);
		mnoInfoPrint(mvo);
	}
	
	public void mnoInfoPrint(MemberVO mVO) {
		System.out.println("### 회원 정보조회");
		System.out.println("----------------------");
		System.out.println("아이디 : " + mVO.getId());
		System.out.println("이름 : " + mVO.getName());
		System.out.println("메일 : " + mVO.getMail());
	}

	public static void main(String[] args) {
		new MemberInfo();
	}
}

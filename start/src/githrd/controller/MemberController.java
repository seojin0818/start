package githrd.controller;

import java.util.*;

import githrd.dao.*;
import githrd.vo.*;

public class MemberController {
	private MemberDao mDao;
	
	public MemberController() {
		mDao = new MemberDao();
		// 회원번호와 아이디를 조회해서 출력해주는 함수
		ArrayList<MemberVO> list = mDao.getInfo();
		allPrint(list);
		System.out.println();
		
		// 회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
		ArrayList<MemberVO> mlist = mDao.getMnoInfo(1001);
		mnoInfoPrint(mlist);
		System.out.println();
		
		// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수
		updateTel();
	}

	// 회원번호와 아이디를 조회해서 출력해주는 함수
	public void allPrint(ArrayList<MemberVO> list) {
		System.out.println("*** 회원번호와 아이디 조회");
		System.out.println("--------------------------");
		System.out.println("회원번호 | 아이디");
		System.out.println("--------------------------");
		for(MemberVO m : list) {
			System.out.printf("%7d | %10s | \n", m.getMno(), m.getId());
		}
		System.out.println("--------------------------");
	}
	
	// 회원번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	public void mnoInfoPrint(ArrayList<MemberVO> list) {
		System.out.println("*** 1001번 회원 정보조회");
		System.out.println("------------------------");
		System.out.println("회원번호 | 이름 | 아이디 | 비밀번호 | 메일 | 전화번호");
		System.out.println("--------------------------------------------------------------");
		for(MemberVO mVO : list) {
			System.out.printf("%7d | %10s | %10s | %10s | %10s | %10s | %-18s \n", 
					mVO.getMno(), mVO.getName(), mVO.getId(), mVO.getPw(), mVO.getMail(), mVO.getTel(), mVO.getSdate());
		}
		System.out.println("--------------------------------------------------------------");
	}
	
	// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212)해주는 함수
	public void updateTel() {
		mDao.updateTel("jennie", "010-1212-1212");
	}
	
	// [ 선택 ] Scanner 로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	
	
	public static void main(String[] args) {
		new MemberController();
	}

}
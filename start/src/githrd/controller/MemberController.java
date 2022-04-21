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
	
	// [ 선택 ] Scanner로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	public void getJoin(MemberVO mVO) {
		Scanner sc = new Scanner(System.in);
		System.out.print("가입정보를 입력하세요!\n이름 : \n아이디 : \n비밀번호 : \n이메일 : \n전화번호 : \n성별 : ");
		String str = sc.nextLine();
	
		// 데이터베이스 작업 함수 호출
		int result = mDao.getJoin(mVO);
		if(result == 1) {
			System.out.println("회원가입에 성공했습니다.");
		} else {
			System.out.println("회원가입에 실패했습니다");
		}
	}
	
	/*
	 	문제 ] 
	 		
	 		회원리스트를 꺼내오는데
	 		한 페이지당 3명의 아이디, 메일, 가입일을 리스트형식으로 보여주고
	 		그 중에서 한명의 아이디를 입력하면
	 		그 회원의 상세 데이터를 보여주는 기능을 구현하세요.
	 		
	 		한 페이지당 보여주는 리스트의 개수는 3개로 하고
	 		한 페이지당 보여지는 페이지 수는 3개로 한다.
	 		이전, 다음 페이지를 같이 표현해서
	 		이동가능한 페이지 메뉴는 총 5개로 하세요.
	 		이전 페이지를 누르면 현재 보는 페이지가 5페이지라면
	 		3페이지로 이동을 하고
	 		이동가능한 페이지는 1 ~ 3로 변경되어야 한다.
	 		현재 보는 페이지가 1페이지인데 다음을 선택하면
	 		보여지는 페이지는 4페이지가 되고
	 		시작 페이지는 4페이지가 되고 종료 페이지는 6페이지가 되어야 한다.
	 		
	 */
	public static void main(String[] args) {
		new MemberController();
	}

}
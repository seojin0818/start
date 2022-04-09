package empProj.controller;

import java.util.*;

import empProj.dao.*;
import empProj.vo.*;

public class EmpController {
	private EmpDao eDao;
	
	public EmpController() {
		eDao = new EmpDao();
		
		// 모든 사원들의 정보 조회
		ArrayList<EmpVO> list = eDao.getAll();
		for(EmpVO e : list) {
			System.out.println(e);
		}
		
		// 20번 부서를 입력해서 부서원들의 정보 조회
		ArrayList<EmpVO> dlist = eDao.getDnoInfo(20);
		for(EmpVO e : dlist) {
			System.out.println(e);
		}
	
		
		// SALESMAN 직급을 가진 사원들의 정보 조회
		ArrayList<EmpVO> jlist = eDao.getJobInfo("SALESMAN");
		for(EmpVO e1 : jlist) {
			System.out.println(e1);
		}
		
	}
	
	public static void main(String[] args) {
		new EmpController();
	}

}
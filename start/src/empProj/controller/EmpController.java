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
		
		// 20번 부서원들의 정보 조회
		ArrayList<EmpVO> dlist = eDao.getDnoInfo(20);
		for(EmpVO e : dlist) {
			System.out.println(e);
		}
	
		
		// SALESMAN 직급 사원들의 정보 조회
		ArrayList<EmpVO> jlist = eDao.getJobInfo("SALESMAN");
		for(EmpVO e : jlist) {
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		new EmpController();
	}

}
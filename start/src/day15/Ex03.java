package day15;

	/*

	학생 한명의 정보를 저장할 클래스를 제작하세요.

	정보는
		학생이름, 반, 번호, 
		자바, 데이터베이스, 웹, 스프링 점수
		총점, 평균
	를 기억하게 하고

	10명의 학생을 TreeSet에 입력하고
	반 순서대로 정렬되도록 하세요.
	반이 같으면 번호순으로 정렬되도록 하세요.

	*/

	import java.util.*;

	public class Ex03 {

	public Ex03() {
		
		TreeSet set = new TreeSet();
		
		while(true) {
			Student stud = new Student((int)(Math.random() * 9 + 1), (int)(Math.random() * 10 + 1),
					(int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60),
					(int)(Math.random() * 41 + 60), (int)(Math.random() * 41 + 60));
			
			set.add(stud);
			
			if(set.size() == 10) {
				break;
			}
		}
			
			// 출력
			ArrayList list = new ArrayList(set);
			for(Object o : list) {
				System.out.println(o);
			}
		}

	public static void main(String[] args) {
			new Ex03();
		}
	}

package day15.solve;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03 {

	public Test03() {
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		// 입력 받기 전 입력 메세지 출력
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		// 정규식 검사
		// 1. 패턴 정의
		Pattern form = Pattern.compile("[가-힣]{2,5}");
		
		// 2. 패턴 검사
		Matcher mat = form.matcher(name);
		
		// 3. 결과 알아내기
		boolean bool = mat.matches();
		
		String result = bool ? "올바른" : "잘못된";
		
		// 결과 출력
		System.out.println("입력한 이름 [ " + name + " ] 은 " + result + " 이름 입니다.");
	}

	public static void main(String[] args) {

	}

}

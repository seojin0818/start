package day18.solve;

/*

	Runnable 인터페이스를 구현한 스레드 프로그램을 만들어보자.
	
 */

public class Test10 {

	public Test10() {
		// Runnable 인터페이스를 구현한 스레드 프로그램을 실행하는 방법이 조금 다름
		
		// 1. new 시키기
		Heejin heejin = new Heejin();
		Seojin seojin = new Seojin();
		// 아직 두 프로그램은 New Born 상태가 아님
		
		// 2. New Born 상태로 만들어주기
		Thread t1 = new Thread(heejin);
		Thread t2 = new Thread(seojin);
		// 이제서야 두 프로그램이 New Born 상태
		
		// Runnable 상태로 전위시킴
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		new Test10();
	}
}

class Heejin implements Runnable {

	@Override
	public void run() {
	}
	
	public void quest() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("*** 희진씨가 " + (i + 1) + " 번째 질문을 합니다.");
		}
	}
}


class Seojin implements Runnable {

	@Override
	public void run() {
	}
	
	public void answer() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("\t\t\t### 서진씨가 " + (i + 1) + " 번째 대답을 합니다.");
		}
	}
}
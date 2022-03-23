package day18.solve;

public class Test09 {

	public Test09() {
		
		/*
		 	
		 	스레드 프로그램을 실행해보자.
		 	
		 	1. 스레드 프로그램은 반드시 New Born 상태로 만들어야 함
		 		
		 		New Born 상태란?
		 		실행 가능한 프로그램으로 만든다는 의미
		 		==> 자바에서는 new 시키는 것
		 		
		 */
		
		MyThread01 heejin = new MyThread01();
		MyThread02 heejin2 = new MyThread02();
		// 이제 두개의 스레드는 New Born 상태가 되었음
		
		// 이것을 실행하기 위해서는 스레드 프로그램이 Runnable 상태로 전위되면 됨
		
		// New Born 상태의 스레드 프로그램을 Runnable 상태로 전위시키는 명령은 start()
		heejin.start();
		heejin2.start();
		System.out.println("=== 생성자 쪽 종료 ===");
		
	}

	public static void main(String[] args) {
		new Test09();
		System.out.println("### 메인함수 종료 ###");
	}

}


class MyThread01 extends Thread {
	@Override
	public void run() {
		// 김희진씨가 블로킹을 1000개를 하게 할 것
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("### 김희진씨가 블로킹을 합니다! : " + (i + 1 + " 회차"));
		}
	}
}
class MyThread02 extends Thread {
	@Override
	public void run() {
		// 김희진씨가 서브 에이스를 1000번을 하게 할 것
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("\t\t\t*** 김희진씨가" + (i + 1) + " 번째 서브 에이스를 합니다!");
		}
	}
}
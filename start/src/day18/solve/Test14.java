package day18.solve;

public class Test14 {

	public Test14() {
		EndClass eCls = new EndClass(); // New Born 상태
		eCls.start();
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("메인 실행 중" + (i + 1));
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
		
		// 위 명령이 모두 실행이 끝나면 메인 내용이 완료되었으므로 스레드도 종료시켜봄
		eCls.stop();
	}

	public static void main(String[] args) {
		new Test14();
		System.out.println("### 프로그램 종료 ###");
	}

}

class EndClass extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 50 ; i++) {
			System.out.println("\t\t스레드 실행 중입니다." + (i + 1));
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}
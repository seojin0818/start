package day18.solve;

public class Test12 {

	public Test12() {
		Gom g = new Gom();
		Ha h = new Ha();
		// 둘 다 New Born 상태가 되었음
		
		// Runnable 상태로 전위
		g.start();
		h.start();
	}

	public static void main(String[] args) {
		new Test12();
	}

}

class Gom extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("곰돌이가 " + (i + 1) + " 번째 노래를 합니다.");
			
			/*
			 	
			 	한곡을 노래했으니
			 	다른 프로그램에 양보하세요.
			 	즉, Runnable 상태로 전위하세요.
			 	
			 */
			yield();
		}
	}
}

class Ha extends Thread {
	@Override
	public void run() {
		for(int i = 0 ; i < 1000 ; i++) {
			System.out.println("\t\t하리보가 " + (i + 1) + " 번째 노래를 합니다.");
			yield();
		}
	}
}
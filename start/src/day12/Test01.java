package day12;

public class Test01 {
	public Test01() {
		Father f1 = new Son();
		
//		Son s1 = new Father(); ==> X
		
		Father f2 = new Father();
		Son s1 = (Son) f2; // 실행 시 오류 발생 f2 안에는 Son 멤버가 없는게 있을것
	}

	public static void main(String[] args) {
	// 진입점 함수
		new Test01();

	}

}

class Father{
	void abc() {
		System.out.println("######## father ########");
		
	}
}

class Son extends Father {
	void abc() {
		System.out.println("######## Son ########");
	}
}
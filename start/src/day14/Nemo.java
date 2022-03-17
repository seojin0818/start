package day14;

public class Nemo {
	private int width, height, area;
	
	public Nemo() {
		// 생성자 함수를 하나도 정의하지 않으면
		// JVM이 이 클래스를 객체로 만드는 순간
		// 기본 생성자를 만들어서 사용하게 됨
		// 만약 생성자를 하나라도 만들면 JVM이 기본 생성자를 만들지 않음
		// 따라서 생성자를 정의를 할 경우는 내용이 비어있는 기본 생성자도 정의하는 것이 좋음
	}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	// 면적 계산해서 세팅해주는 함수
	public void setArea() {
		// 이 함수를 호출하는 순간은 이미 가로와 세로 길이가 결정된 후일 것
		// 이미 필요한 데이터가 준비가 되어있고 접근이 가능하므로
		// 따로 데이터를 전달받지 않아도 됨
		area = width * height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	// 이 클래스의 내용을 문자열로 반환해주는 함수
	// 출력할 때 자동호출되는 함수
	
	@Override
	public String toString() {
		return "사각형 - 가로 : " + width + " , 세로 : " + height + " , 면적 : " + area;
	}
	
	/*
		
		면적이 같으면 같은 사각형이 되도록 처리해주는 함수

	 */
	
	@Override
	public boolean equals(Object o) {
		// 반환값 변수
		boolean bool = false;
		
		// 입력된 데이터를 원래 형태로 강제 형변환
		Nemo nam = (Nemo) o;
		// 남의 것 면적 꺼내오기
		int myunjuk = nam.getArea();
		// 비교해서 결과 만들기
		bool = area == myunjuk;
				
		return bool;
	}
}

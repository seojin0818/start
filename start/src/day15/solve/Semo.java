package day15.solve;

public class Semo implements Comparable {
	private int width, height;
	private double area;
	
	public Semo() {}
	
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		area = width * height * 0.5;
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

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public int compareTo(Object o) {
		// 나와 다른 Semo를 비교하는 기능이므로
		// 입력된 데이터를 Semo 타입으로 강제 형변환
		Semo s = (Semo) o;
		
		// 정렬 기준은 높이를 기준으로 내림차순 예정
		// 내 높이에서 입력된 세모의 높이를 빼주는 작업
		int result = height - s.getHeight();
		
		// 내림차순 정렬
		return -result;
	}
	
	@Override
	public String toString() {
		return "밑변이 " + width + " , 높이가 " + height + " , 넓이가 " + area + " 인 삼각형";
	}
}
package day12.solve;

public class Nemo extends Figure {

	private int width, height, area;
	
	public Nemo() {}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		
	}
	
	@Override
	public void setArea() {

	area = width * height;
	
	}

	@Override
	public void toPrint() {
	System.out.printf("이 사각형의 가로는 %3d이고 세로는 %3d이고 면적은 %6.2f 입니다.", width, height, area);
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

}

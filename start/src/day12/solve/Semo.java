package day12.solve;

public class Semo extends Figure {
	
	private int width, height;
	private double area;
	
	public Semo() {}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	@Override
	public void setArea() {
		
	area = width * height / 2.0;
		
	}

	@Override
	public void toPrint() {
	
	System.out.printf("이 삼각형의 밑변은 %3d이고 높이는 %3d이고 면적은 %6.2f 입니다.", width, height, area);
		
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
	
}
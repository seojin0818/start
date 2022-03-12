package day12.solve;

public class Nemo extends Figure {

	private int garo, sero, area;
	
	public Nemo() {}
	
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	
	@Override
	public void setArea() {
	
		area = garo * sero;
		
	}

	@Override
	public void toPrint() {
	
		System.out.printf("이 사각형의 가로는 %3d 이고 세로는 %3d 이고 면적은 %6d 입니다.", garo, sero, area);
		System.out.println();
	}

	public int getGaro() {
		return garo;
	}

	public void setGaro(int garo) {
		this.garo = garo;
	}

	public int getSero() {
		return sero;
	}

	public void setSero(int sero) {
		this.sero = sero;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}
	
}


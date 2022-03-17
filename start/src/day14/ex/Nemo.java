package day14.ex;

public class Nemo {
	private int width, height, area;
	
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	public void setArea() {
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
	
	@Override
	public String toString() {
		return "사각형 - 가로 : " + width + " , 세로 : " + height + " , 면적 : " + area;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Nemo nam = null;
		try {
			nam = (Nemo) o;
		} catch(Exception e) {
			return bool;
		}
		int garo = nam.getWidth();
		int sero = nam.getHeight();
		
		bool = (width == garo) && (height == sero);
		
		return bool;
	}
}

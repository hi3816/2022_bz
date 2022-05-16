package two_problem_2;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x, int y ,int width,int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		//인스턴스 생성자~
		
	}
	
	public int square() {
		int square = this.width*this.height;
		return square;
	}

	public void show() {
		System.out.println("좌표는 : ("+ this.x + this.y +")");
		System.out.println("넓이는 : " + square());
	}
	
	public Boolean contains(Rectangle r) {
		if(this.x <= r.x && (this.x + this.width) >= (r.x + r.width)) {
			if(this.y <= r.y &&(this.y + this.height) >= (r.y + r.height)) {
				return true;
			}
		}
		return false;
	}
}

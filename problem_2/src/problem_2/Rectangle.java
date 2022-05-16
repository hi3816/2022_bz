package problem_2;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int square() {
		int square = width*height;
		return square;
	}
	
	public void show() {
		System.out.println("ÁÂÇ¥ : " + "(" + "x" + "y" + ")" + "³ÐÀÌ : " + square());
	}
	
	public Boolean contains(Rectangle r) {
		//if (this.square() >= r.square() || this.x+this.width > r.x+r.width) {
		if (this.x <= r.x && (this.x + this.width) >= (r.x + r.width)) {
			if (this.y <= r.y && (this.y + this.height) >= (r.y + r.height)) {
				return true;
			}
		}
		return false;
	}
}

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
		//�ν��Ͻ� ������~
		
	}
	
	public int square() {
		int square = this.width*this.height;
		return square;
	}

	public void show() {
		System.out.println("��ǥ�� : ("+ this.x + this.y +")");
		System.out.println("���̴� : " + square());
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

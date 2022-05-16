package problem_3;

public class People {
	String name;
	int age;
	int money;
	String job;
	
	public People (String name, int age, int money, String job) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.job = job;
		showInfo();
	}
	
	public boolean payFee(int price) {
		if (this.money > price) {return true;}
		else {return false;}
	}
	public void takeBus() {
		Bus.getInstance();
		Bus.takeBus(this);
		
	}
	public void takeSubway() {
		Subway.getInstance();
		Subway.takeSubway(this);
	}
	public void showInfo() {
		System.out.println("--------������ ���---------");
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("�� : "+money);
		System.out.println("���� : "+job);
		System.out.println("---------------------------");
	}
	
}

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
		System.out.println("--------생성한 사람---------");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("돈 : "+money);
		System.out.println("직업 : "+job);
		System.out.println("---------------------------");
	}
	
}

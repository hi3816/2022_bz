package problem_3;

public class Bus {
	private static Bus instance;
	
	private Bus() {
		System.out.println("--------------");
		System.out.println("버스 최초 생성");
		System.out.println("-------------");
	}
	
	public static Bus getInstance() {
		if(instance == null) {
			instance = new Bus();
			}
		return instance;
		}
		
	
	static int money =0;
	static int studentPrice = 750;
	static int workerPrice = 1250;
	static int passenger = 0;
	
	
	public static void takeBus(People people) {
		if (people.job == "학생" && people.payFee(studentPrice)) {
			people.money -= Bus.studentPrice;
			Bus.money += Bus.studentPrice;
			Bus.passenger++;
			Bus.showInfo(people);
		}
		else if (people.job == "직장인" && people.payFee(workerPrice)) {
			people.money -= Bus.workerPrice;
			Bus.money += Bus.workerPrice;
			Bus.passenger++;
			Bus.showInfo(people);
		}
		else {
			System.out.println("-------------");
			System.out.println("잔액이 부족합니다.");
			System.out.println("-------------");
			}
	}
	
	public static void showInfo(People people) {
		System.out.println("------------------------");
		System.out.println("삐빅! "+people.job+"입니다!");
		System.out.println(people.name+"님의 잔액 : " + people.money);
		System.out.println("버스가 번 수입 : " + money);
		System.out.println(passenger);
		System.out.println("------------------------");
	}
}

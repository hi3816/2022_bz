package problem_3;

public class Subway {
	private static Subway instance;
	
		private Subway() {
		System.out.println("--------------");
		System.out.println("지하철 최초 생성");
		System.out.println("-------------");
	}
	
		public static Subway getInstance() {
		if(instance == null) {
			instance = new Subway();
			}
		return instance;
		}
	
	
	static int money = 0;
	static int studentPrice = 800;
	static int	workerPrice = 1300;
	static int passenger = 0;
	
	
	public static void takeSubway(People people) {
		if(people.job == "학생" && people.payFee(studentPrice)) {
			people.money -= Subway.studentPrice;
			Subway.money += Subway.studentPrice;
			Subway.passenger++;
			Subway.showInfo(people);
		}
		else if(people.job == "직장인" && people.payFee(workerPrice)) {
			people.money -= Subway.workerPrice;
			Subway.money += Subway.workerPrice;
			Subway.passenger++;
			Subway.showInfo(people);
		}
		else {System.out.println("잔액이 부족합니다.");}
		
	}
		public static void showInfo(People people) {
			System.out.println("삐빅! "+people.job+"입니다!");
			System.out.println(people.name+"님의 잔액 : " + people.money);
			System.out.println("지하철이 번 수입 : " + money);
			System.out.println(passenger);
	}
	
}

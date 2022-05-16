package problem_3;

public class Subway {
	private static Subway instance;
	
		private Subway() {
		System.out.println("--------------");
		System.out.println("����ö ���� ����");
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
		if(people.job == "�л�" && people.payFee(studentPrice)) {
			people.money -= Subway.studentPrice;
			Subway.money += Subway.studentPrice;
			Subway.passenger++;
			Subway.showInfo(people);
		}
		else if(people.job == "������" && people.payFee(workerPrice)) {
			people.money -= Subway.workerPrice;
			Subway.money += Subway.workerPrice;
			Subway.passenger++;
			Subway.showInfo(people);
		}
		else {System.out.println("�ܾ��� �����մϴ�.");}
		
	}
		public static void showInfo(People people) {
			System.out.println("�ߺ�! "+people.job+"�Դϴ�!");
			System.out.println(people.name+"���� �ܾ� : " + people.money);
			System.out.println("����ö�� �� ���� : " + money);
			System.out.println(passenger);
	}
	
}

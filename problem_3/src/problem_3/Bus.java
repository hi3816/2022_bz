package problem_3;

public class Bus {
	private static Bus instance;
	
	private Bus() {
		System.out.println("--------------");
		System.out.println("���� ���� ����");
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
		if (people.job == "�л�" && people.payFee(studentPrice)) {
			people.money -= Bus.studentPrice;
			Bus.money += Bus.studentPrice;
			Bus.passenger++;
			Bus.showInfo(people);
		}
		else if (people.job == "������" && people.payFee(workerPrice)) {
			people.money -= Bus.workerPrice;
			Bus.money += Bus.workerPrice;
			Bus.passenger++;
			Bus.showInfo(people);
		}
		else {
			System.out.println("-------------");
			System.out.println("�ܾ��� �����մϴ�.");
			System.out.println("-------------");
			}
	}
	
	public static void showInfo(People people) {
		System.out.println("------------------------");
		System.out.println("�ߺ�! "+people.job+"�Դϴ�!");
		System.out.println(people.name+"���� �ܾ� : " + people.money);
		System.out.println("������ �� ���� : " + money);
		System.out.println(passenger);
		System.out.println("------------------------");
	}
}

package problem_1;

public class main {

	public static void main(String[] args) {
		System.out.println("���� ��� ���α׷� ����");
		int math = 69;
		int science = 90;
		int english = 90;
		Grade me = new Grade(math, science, english);
		System.out.println("����, ����, ���� ������ ����� : " + me.average());
	}

}
 
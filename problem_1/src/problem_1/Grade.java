package problem_1;

public class Grade {
	int math;
	int science;
	int english;
	
	public Grade (int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	public int average() {
		int total = math + science + english;
		int average = total/3;
		return average ;
	}
}

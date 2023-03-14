package day7;

public interface Student {
	void getDetails(int a, String b);

}

class Anonymous {
	public static void main(String[] args) {
		Student stu = (a, b) -> System.out.println(a + " " + b);
		stu.getDetails(15, "Suraj");
	}

}

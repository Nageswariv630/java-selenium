package tasks;
public class KeyWordDemo {
	public static void main(String[] args) {
		final int x = 10;
		int y = 5;
		boolean isJavaFun = true;
		char grade = 'A';
		double score = 95.5;
		for (int i = 0; i < 3; i++) {
			if (x > y) {
				System.out.println("x is large");
			}
		}
		String msg = "Learning Java";
		switch (msg) {
		case "Learning Java":
			System.out.println("Keep going!");
			break;
		default:
			break;
		}
	}
}
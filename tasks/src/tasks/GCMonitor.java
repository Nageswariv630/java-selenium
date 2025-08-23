package tasks;

public class GCMonitor {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			int[] data = new int[1000000];
		}
		System.gc();
		System.out.println("Requested GC");
	}
}
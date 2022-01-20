package DailyMeetings;

public class OddEven {

	public static void main(String[] args) {
		OddEvenPatern();

	}

	/*
	private static void OddEvenPatern() {
		int k = 4;
		for (int i = 1; i <= 5; i++) {
			int lastJCount = 0;
			for (int j = 0; j < k; j++) {
				System.out.print("*");
				lastJCount = j;
			}
			for (int a = lastJCount + 1; a < 5; a++) {
				if (i % 2 == 0)
					System.out.print("E");
				else
					System.out.print("O");
			}
			k--;
			System.out.println();
		}
	}*/
	

	private static void OddEvenPatern() {
		int k = 4;
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("*");
			}
			for (int a = i; a > 0; a--) {
				if (i % 2 == 0)
					System.out.print("E");
				else
					System.out.print("O");
			}
			k--;
			System.out.println();
		}
	}
}

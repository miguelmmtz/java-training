public class Pattern2 {

	public static void main(String[] args) {
		printPattern2();
	}
	
	private static void printPattern2() {
		for(int i = 0; i<5;i++) {
			for(int j=0;j<=5;j++) {
				if(i%2==0) {
					System.out.print("*");
				} else {
					if(j==0 || j==5) 
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

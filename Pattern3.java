public class Pattern3 {

	public static void main(String[] args) {
		printPattern3();
	}

	private static void printPattern3() {
		for(int i = 0; i<5;i++) {
			for(int j=0;j<=5;j++) {
				if(i%2==0) {
					if(j==2||j==3) 
						System.out.print("*");
					else
						System.out.print("O");
				} else {
					if(j==2||j==3) 
						System.out.print("E");
					else
						System.out.print("*");
				}
					
			}
			System.out.println();
		}
	}
}

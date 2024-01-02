
public class Hollow_Rhombus {

	public void Pattern() {
		int n = 10;
		int z = 10;
		for(int a = 1; a<=n; a++) {
			for(int b = 1; b<=n-a; b++) {
				System.out.print(" ");
			}
			for(int b = 1; b<=z; b++) {
				if(a==1||b==1||a==n||b==z) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
			
			
		}
	
	}
}


	



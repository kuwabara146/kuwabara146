
public class task22 {

	public static void main(String[] args) {
		for(int i = 1; i<= 9; i++) {
			for(int j = 1; j<= 9; j++) {
				int k = i * j;

				System.out.print(" ");
				if(k < 10) System.out.print(" ");
				System.out.print(k);
			}

			System.out.println();
		}
	}

}

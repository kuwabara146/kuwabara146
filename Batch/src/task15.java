import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		System.out.println("numA: " + numA);

		int numB = sc.nextInt();
		System.out.println("numB: " + numB);

		int numC = sc.nextInt();
		System.out.println("numC: " + numC);
		sc.close();

		if(numA > numB && numA > numC) {
			System.out.println("最大値: " + numA);
		}else if(numB > numC) {
			System.out.println("最大値: " + numB);
		}else {
			System.out.println("最大値: " + numC);
		}

	}

}

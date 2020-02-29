import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		System.out.println("numA: " + numA);
		int numB = sc.nextInt();
		System.out.println("numB: " + numB);
		sc.close();

		if(numA < 1 || numB < 1) {
			System.out.println("正の整数を入力してください");
		}else if(numA % numB == 0) {
			System.out.println("numBはnumAの約数です");
		}else {
			System.out.println("numBはnumAの約数ではありません");
		}

	}

}

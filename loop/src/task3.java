import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力してください: ");
		long num = sc.nextLong();
		sc.close();

		int i = 0;
		while(num > 0) {
			num /= 10;
			i++;
		}

		System.out.println("桁数: " + i);
	}

}

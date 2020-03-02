import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力してください: ");
		int num = sc.nextInt();
		sc.close();

		int sum = 0;
		int i = 1;
		while(i < num) {
			sum += i;
			System.out.print(i + " + ");
			i++;
		}

		sum += i;
		System.out.println(i + " = " + sum);
	}

}

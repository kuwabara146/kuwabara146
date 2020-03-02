import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("正の整数を入力してください: ");
		int num = sc.nextInt();
		sc.close();

		System.out.print(num + "の約数: ");

		int i = 1;
		while(i < num) {
			if(num % i == 0) {
				System.out.print(i + ",");
			}
			i++;
		}
		System.out.println(i);
	}

}

import java.util.Scanner;

public class task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("数字を入力してください: ");
		int num = sc.nextInt();
		sc.close();

		int sum = 0;
		int i = 0;
		while(i <= num) {
			sum += i;
			i++;
		}

		System.out.println("1～" + num +"までの合計: " + sum);
	}

}

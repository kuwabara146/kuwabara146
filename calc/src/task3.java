import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println(num1);

		int num2 = sc.nextInt();
		System.out.println(num2);

		int num3 = sc.nextInt();
		System.out.println(num3);
		sc.close();

		int a = num1 + num2 + num3;
		System.out.println("合計:" + a);

		int b = a / 3;
		System.out.println("平均(3で割った時):" + b);

		double c = a / 3.0;
		System.out.println("平均(3.0で割った時):" + c);
	}

}

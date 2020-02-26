import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		String a = "ノートPCの値段:";
		int b = 89800;
		char c = '円';

		System.out.println(a + b + c);

		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();
		System.out.println(str1);

		String str2 = sc.nextLine();
		System.out.println(str2);

		sc.close();

		System.out.println(str1 + str2);
	}

}

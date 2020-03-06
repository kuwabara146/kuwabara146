import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("正の整数を入力してください: ");
        int num = sc.nextInt();
        sc.close();

        System.out.print(num + "の約数: ");

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                System.out.print(i + ",");     //受け取った整数を割り切れた場合表示する
            }

        }

        System.out.println(num);               //受け取った整数も約数なので表示する
	}

}

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        int total = num1 + num2 + num3;
        int intAve = total / 3;
        double doubleAve = total / 3.0;

        System.out.println("合計:" + total);
        System.out.println("平均(3で割った時):" + intAve);
        System.out.println("平均(3.0で割った時):" + doubleAve);
    }

}

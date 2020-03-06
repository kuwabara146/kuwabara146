import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("数字を入力してください: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i = 1; i <= num; i++) {
            sum += i;
            System.out.print(i);
            if(i < num) {
                System.out.print(" + ");    //最後のループの1つ前まで"+"を表示する
            }

        }

        System.out.println(" = " + sum);
    }

}

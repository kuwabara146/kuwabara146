import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("numA: ");
        int numA = sc.nextInt();
        System.out.print("numB: ");
        int numB = sc.nextInt();
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

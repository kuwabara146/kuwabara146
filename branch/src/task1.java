import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("10以上の数字を入力してください");
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();

        if(num > 9) {
            System.out.println("値: " + num);
        }else {
            num = num * 10;
            System.out.println("値: " + num);
        }
    }

}

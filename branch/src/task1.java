import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("10以上の数字を入力してください");
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();

        //受け取った整数が1桁の場合は10倍する
        if(num < 10) {
            num = num * 10;
        }
            System.out.println("値: " + num);
    }

}

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.println("数字を入力してください");
        int num = sc.nextInt();
        sc.close();

        if(num >= 10) {
            System.out.println("値: " + num);
        }else {
            System.out.println("値: " + 0 + num);
        }
    }

}

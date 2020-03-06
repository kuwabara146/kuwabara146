import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
//処理1
        String str = "ノートPCの値段:";
        int intPrice = 89800;
        char ch = '円';

        System.out.println(str + intPrice + ch);
//処理2
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();

        System.out.println(str1 + str2);
    }

}

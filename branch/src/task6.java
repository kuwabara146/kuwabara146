import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1から5までの数字を入力してください");
        int num = sc.nextInt();
        sc.close();

        String str;

        switch(num) {
            case 1:
                str = "Ⅰ";
                break;
            case 2:
                str = "Ⅱ";
                break;
            case 3:
                str = "Ⅲ";
                break;
            case 4:
                str = "Ⅳ";
                break;
            case 5:
                str = "Ⅴ";
                break;
            default:
                str = "unknown";
                break;
        }

        System.out.println(num + " → " + str);
    }

}

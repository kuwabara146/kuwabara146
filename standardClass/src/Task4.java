import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        //指定の文字列を用意
        String str = "ABCDGOPQRSYZ";

        Scanner sc = new Scanner(System.in);
        System.out.print("探したい文字: ");
        String findStr = sc.nextLine();
        sc.close();

        //入力されたアルファベットが文字列に含まれているか判定する処理
        if(str.indexOf(findStr) >= 0) {
            System.out.println(str + "は" + findStr + "を含む");
        }else {
            System.out.println(str + "は" + findStr + "を含まない");
        }

    }

}

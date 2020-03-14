
public class Task3 {

    public static void main(String[] args) {
        //指定の文字列を用意
        String str = "ABCDEFG";
        System.out.println("文字列: " + str);

        //文字列を逆順に表示する処理
        for(int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            System.out.print(ch);
        }
        System.out.println(": 列字文");

    }

}

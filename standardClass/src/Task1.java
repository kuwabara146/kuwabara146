
public class Task1 {

    public static void main(String[] args) {
        //指定の文字列を用意
        String str1 = " tech-compass ";

        //先頭・末尾の空白を削除
        String str2 = str1.trim();

        System.out.println("変換前: " + str1);
        System.out.println("変換後: " + str2.toUpperCase());

    }

}

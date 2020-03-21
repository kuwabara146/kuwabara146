
public class Task1 {

    public static void main(String[] args) {
        //指定の文字列を用意
        String str1 = " tech-compass ";

        //文字列を大文字に変換し、前後の空白を削除
        String str2 = str1.toUpperCase().trim();

        System.out.println("変換前: " + str1);
        System.out.println("変換後: " + str2);

    }

}

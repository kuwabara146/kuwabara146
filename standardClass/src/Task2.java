
public class Task2 {

    public static void main(String[] args) {
        //指定の文字列を用意
        String str = "Java Programming Training";

        //指定の箇所を抽出
        String subStr1 = str.substring(17, 25);
        String subStr2 = str.substring(0, 16);

        System.out.println(subStr1);
        System.out.println(subStr2);
    }

}

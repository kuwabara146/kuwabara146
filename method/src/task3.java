
public class task3 {

    //引数が文字列だけの場合
    public static String add(String str1, String str2) {
        return str1 + str2;
    }
    //引数が整数だけの場合
    public static Integer add(int num1, int num2) {
        return num1 + num2;
    }
    //引数が少数だけの場合
    public static double add(double sNum1, double sNum2) {
        return sNum1 + sNum2;
    }
    //メインメソッド
    public static void main(String[] args) {
        System.out.println("--①文字列だけの場合---");
        System.out.println(add("文字列1", "文字列2"));
        System.out.println("---②整数だけの場合---");
        System.out.println(add(3, 5));
        System.out.println("---③少数だけの場合---");
        System.out.println(add(3.5, 5.5));

    }

}

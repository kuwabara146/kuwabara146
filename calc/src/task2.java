
public class task2 {

    public static void main(String[] args) {
        int num1 = 10, num2 = 12, num3 = 13;
        int total = num1 + num2 + num3;
        int intAve = total / 3;
        double doubleAve = total / 3.0;

        System.out.println("合計:"+ total);
        System.out.println("平均(3で割った時):" + intAve);
        System.out.println("平均(3.0で割った時):" + doubleAve);
    }

}

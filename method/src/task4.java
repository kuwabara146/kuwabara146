
public class task4 {

    public static void main(String[] args) {
        //"null"の含まれない配列を引数にしてメソッドを呼び出した場合
        String[] array1 = {"a", "b", "c"};
        System.out.println("---配列にnullがない場合---");
        System.out.println(nullCheck(array1));

        //"null"を含む配列を引数にしてメソッドを呼び出した場合
        String[] array2 = {"a", null, "c"};
        System.out.println("---配列にnullがある場合---");
        System.out.println(nullCheck(array2));

    }
    public static boolean nullCheck(String[] array) {
        boolean check = false;

        //引数で受け取った配列に"null"がある場合はcheckにtrueを代入
        for(int i = 0; i < array.length; i++) {
            if(array[i] == null) {
                check = true;
            }
        }
        return check;
    }
}

import java.util.ArrayList;

public class task2 {

    public static void main(String[] args) {
        //指定の配列を作成
        int[] aryNum = {21,3,32,6,99,72,78,51,1,26,87,11,48,60};

        //奇数用と偶数用のArrayListを宣言
        ArrayList<Integer> aryOddNum = new ArrayList<>();
        ArrayList<Integer> aryEvenNum = new ArrayList<>();

        //aryNum内の値を奇数と偶数に分ける処理
        for(int i = 0; i < aryNum.length; i++) {

            //奇数の場合aryOddNumに追加
            if(aryNum[i] % 2 != 0) {
                aryOddNum.add(aryNum[i]);

            //偶数の場合aryEvenNumに追加
            }else {
                aryEvenNum.add(aryNum[i]);
            }
        }

        System.out.println("奇数: " + aryOddNum);
        System.out.println("偶数: " + aryEvenNum);
    }

}

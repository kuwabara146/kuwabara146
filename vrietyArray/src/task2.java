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

        //奇数を表示する処理
        System.out.print("奇数: [");
        int aryOddSize = aryOddNum.size();
        for(int j = 0; j < aryOddSize; j++) {
            System.out.print(aryOddNum.get(j));
            if(j < aryOddSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        //偶数を表示する処理
        System.out.print("偶数: [");
        int aryEvenSize = aryEvenNum.size();
        for(int k = 0; k < aryEvenSize; k++) {
            System.out.print(aryEvenNum.get(k));
            if(k < aryEvenSize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}

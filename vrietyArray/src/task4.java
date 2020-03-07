import java.util.ArrayList;
import java.util.HashMap;

public class task4 {

    public static void main(String[] args) {
        //指定の配列を作成
        int[] aryNum = {21,3,32,6,99,72,78,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};

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
        //ArrayListを格納するHashMapの生成
        HashMap<String, ArrayList<Integer>> numbers = new HashMap<>();
        numbers.put("奇数: ", aryOddNum);
        numbers.put("偶数: ", aryEvenNum);

        System.out.println(numbers);
    }

}

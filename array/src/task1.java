
public class task1 {

    public static void main(String[] args) {

        //配列の生成、初期化
        int[] array = {4,9,19,5,8,21,42,64,73,18,2};

        System.out.print("配列: [");

        //配列内の値を表示する処理
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            //最後のループの1周前まで","を表示する処理
            if(i < array.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println("]");

        //配列内の値の合計を求める処理
        int sum = 0;
        for(int j : array) {
            sum += j;
        }

        System.out.println("合計: " + sum);
    }

}

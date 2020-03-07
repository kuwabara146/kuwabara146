import java.util.Random;

public class task3 {

    public static void main(String[] args) {
        Random random = new Random();

        //配列を生成
        int[] intArray = new int[6];

        System.out.print("[");

        //ランダムな値を配列に代入する処理
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(10);
            System.out.print(intArray[i]);

            //最後のループの1周前まで","を表示する処理
            if(i < intArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");

        //配列内の最大値と最小値を求める処理
        int max = intArray[0];
        int min = intArray[0];
        for(int j = 0; j < intArray.length; j++) {

            //maxより大きい値があった場合maxに代入する
            if(max < intArray[j]) {
                max = intArray[j];
            }

            //minより小さい値があった場合minに代入する
            if(min > intArray[j]) {
                min = intArray[j];
            }
        }
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
    }

}

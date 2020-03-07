
public class task2 {

    public static void main(String[] args) {

        //要素数7の配列を生成
        int[] array = new int[7];
        int arrayNum = 7;

        //配列に値を代入する処理
        for(int i = 0; i < array.length; i++) {
            array[i] = arrayNum;
            arrayNum--;
        }

        //代入した値を表示する処理
        for(int j = 0; j < array.length; j++) {
            System.out.print(array[j]);

            //最後のループの1周前まで","を表示する処理
            if(j < array.length - 1) {
                System.out.print(",");
            }
        }

        System.out.println();   //改行

        //代入した値を逆順に表示する処理
        for(int k = array.length - 1; k >= 0; k--) {
            System.out.print(array[k]);

            //最後のループの1周前まで","を表示する処理
            if(k > 0) {
                System.out.print(",");
            }
        }
    }

}

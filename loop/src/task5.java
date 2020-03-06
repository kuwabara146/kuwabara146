
public class task5 {

    public static void main(String[] args) {
        for(int i = 1; i<= 9; i++) {
            for(int j = 1; j<= 9; j++) {            //九九の計算
                int m = i * j;                      //計算結果
                System.out.print(" ");              //" "を表示する
                if(m < 10) System.out.print(" ");   //1桁の場合さらに" "を表示する
                System.out.print(m);
            }

            System.out.println();                   //1段の計算が終わったら改行する
        }
    }

}

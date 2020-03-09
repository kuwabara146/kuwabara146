
public class task5 {

    public static void main(String[] args) {
        //九九の計算をする処理
        for(int i = 1; i<= 9; i++) {
            for(int j = 1; j<= 9; j++) {
                int m = i * j;
                //計算結果が2桁の場合は" "、1桁の場合は" "を表示してから計算結果を表示する
                System.out.print(" ");
                if(m < 10) {
                    System.out.print(" ");
                }
                System.out.print(m);
            }
            //1段分の計算が終わったら改行をする
            System.out.println();
        }
    }

}

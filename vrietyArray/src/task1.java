import java.util.ArrayList;

public class task1 {

    public static void main(String[] args) {

        //ArrayListの宣言
        ArrayList<String> aryArea = new ArrayList<>();

        //ArrayListに文字列の追加
        aryArea.add("北海道");
        aryArea.add("東北");
        aryArea.add("関東");
        aryArea.add("中部");
        aryArea.add("近畿");
        aryArea.add("中国");
        aryArea.add("九州");

        //ArrayList内の文字列を表示
        for(String area : aryArea) {
            System.out.println(area);
        }
    }

}


public class Task5 {

    public static void main(String[] args) {
        //指定の文字列を用意
        String str = "cat_mouse_mouse_cat_cat";

        //文字列を分割して配列化
        String[] strAray = str.split("_");

        //配列内の"cat"と"mouse"を数える処理
        int catCount = 0;
        int mouseCount = 0;

        for(int i = 0; i < strAray.length; i++) {
            //配列内の要素が"cat"の場合はcatCountを加算、違う場合はmouseCountを加算
            if(strAray[i].equals("cat")) {
                catCount++;
            }else {
                mouseCount++;
            }
        }

        //多い方を表示する
        if(catCount > mouseCount) {
            System.out.println("catの方が多い");
        }else {
            System.out.println("mouseの方が多い");
        }

    }

}

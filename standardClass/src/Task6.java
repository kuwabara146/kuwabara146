import java.text.SimpleDateFormat;
import java.util.Date;
public class Task6 {

    public static void main(String[] args) {
        //日付の取得
        Date now = new Date();

        //sdfクラス生成
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日hh時mm分");

        System.out.println(sdf1.format(now));
        System.out.println(sdf2.format(now));

    }

}

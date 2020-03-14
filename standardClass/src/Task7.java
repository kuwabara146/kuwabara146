import java.text.SimpleDateFormat;
import java.util.Calendar;
public class Task7 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日(E)");

        //現在日時の取得・表示
        System.out.println("現在日時: " + sdf.format(cal.getTime()));

        //1週間後の日付を設定
        cal.add(Calendar.DAY_OF_MONTH, 7);
        System.out.println("１週間後: " + sdf.format(cal.getTime()));

        //新しく現在日時を取得する
        Calendar cal2 = Calendar.getInstance();
        //1年後の年を設定
        cal2.set(Calendar.YEAR, 2021);
        System.out.println("１年後　: " + sdf2.format(cal2.getTime()));

    }

}

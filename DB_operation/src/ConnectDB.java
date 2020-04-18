import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

    public static void main(String[] args) {
        Connection con = null;
        try {
            //JDBCドライバの読み込み
            Class.forName("com.mysql.cj.jdbc.Driver");

            //データベースへの接続
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/task1","kuwabara","masahito");

            System.out.println("DB接続が成功しました。");

        }catch (SQLException e){
            //DB接続やSQL処理の失敗時の処理
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            //JDBCドライバが見つからない時の処理
            e.printStackTrace();
        }finally {
            //データベースの切断
            if(con != null) {
                try {
                    con.close();
                }catch (SQLException e) {
                    //データベース切断失敗時の処理
                    e.printStackTrace();
                }
            }
        }
    }

}

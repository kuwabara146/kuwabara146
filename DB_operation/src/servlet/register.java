package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class register extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public register() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //文字コードの指定
        request.setCharacterEncoding("UTF-8");

        //フォームの情報を取得
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String birthday = request.getParameter("birthday");
        String age = request.getParameter("age");
        Date sqlBirthday = Date.valueOf(birthday);

        //データベースへの処理開始
        Connection con = null;
        try {
            //JDBCドライバの読み込み
            Class.forName("com.mysql.cj.jdbc.Driver");

            //データベースへの接続
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/task1", "kuwabara", "masahito");

            //SQL文の実行
            String sql = "INSERT INTO employee (id, name, birthday, age) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            //「？」に値を設定
            ps.setInt(1, Integer.parseInt(id));
            ps.setString(2, name);
            ps.setDate(3, sqlBirthday);
            ps.setInt(4, Integer.parseInt(age));

            int result = ps.executeUpdate();

            //使用が終わったら切断
            ps.close();

        }catch (SQLException e) {
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
                    //データベースの切断失敗時の処理
                    e.printStackTrace();
                }
            }
        }

    }

}

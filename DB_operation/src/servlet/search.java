package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class search extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public search() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //文字コードの指定
        request.setCharacterEncoding("UTF-8");

        //フォームの情報を取得
        String name = request.getParameter("name");

        response.setContentType("text/html; charset = UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset = 'UTF-8'>");
        out.println("<title>検索結果</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("検索結果<br>");

        //データベースへの処理開始
        Connection con = null;
        try {
            //JDBCドライバの読み込み
            Class.forName("com.mysql.cj.jdbc.Driver");

            //データベースへの接続
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/task1", "kuwabara", "masahito");

            //SQL文の実行
            String sql = "SELECT * FROM employee WHERE name LIKE ?";
            PreparedStatement ps = con.prepareStatement(sql);
            //「？」に値を設定
            ps.setString(1, "%" + name + "%");

            //SQL文の結果を取得
            ResultSet rs = ps.executeQuery();

            //結果を表示
            while(rs.next()) {
                out.println("ID:" + rs.getInt("id") + "<br>");
                out.println("名前:" + rs.getString("name") + "<br>");
                out.println("生年月日:" + rs.getDate("birthday") + "<br>");
                out.println("年齢:" + rs.getInt("age") + "<br>");
            }
            //使用が終わったら切断
            rs.close();
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
        out.println("</body>");
        out.println("</html>");
    }

}

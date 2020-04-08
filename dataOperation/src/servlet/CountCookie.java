package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CountCookie")
public class CountCookie extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset = UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset = 'UTF-8'>");
        out.println("<title>CountCookie</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>訪問回数テスト（クッキー）</h1>");

        //クッキーの取得
        Cookie[] cookies = request.getCookies();
        Cookie visitedCookie = null;

        //クッキーがあるかどうかの判定
        if(cookies != null) {
            for(int i = 0; i < cookies.length; i++) {
                //名前がvisitedのクッキーがあった場合はvisitedCookieに代入
                if(cookies[i].getName().equals("visited")) {
                    visitedCookie = cookies[i];
                }
            }
            if(visitedCookie != null) {
                //visitedCookieの値をint型に変換してvisitCountに代入する
                int visitCount = Integer.parseInt(visitedCookie.getValue());
                visitCount++;

                out.println("<p>" + visitCount + "回目の訪問です。</p>");

                //countの値をvisitedCookieの値として設定・保存する
                visitedCookie.setValue(Integer.toString(visitCount));
                visitedCookie.setMaxAge(300);
                response.addCookie(visitedCookie);

            //名前がvisitedのCookieがなかった場合は初めての訪問として処理する
            }else {
                out.println("<p>初めての訪問です</p>");

                Cookie cookie = new Cookie("visited", "1");
                cookie.setMaxAge(300);
                response.addCookie(cookie);
            }
        //クッキーが1つもなかった場合は初めての訪問として処理
        }else {
            out.println("<p>初めての訪問です</p>");

            Cookie cookie = new Cookie("visited", "1");
            cookie.setMaxAge(300);
            response.addCookie(cookie);
        }

        out.println("<a href=\"CountCookie\">画面を再訪問</a>");
        out.println("</body>");
        out.println("</html>");

    }

}

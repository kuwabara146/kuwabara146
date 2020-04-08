package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CountSession")
public class CountSession extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset = UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset = 'UTF-8'>");
        out.println("<title>CountSession</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>訪問回数テスト（セッション）</h1>");

        //セッションの取得
        HttpSession session = request.getSession(false);

        //nullチェック
        if(session == null) {
            out.println("<p>初めての訪問です。</p>");
            //新規のセッションを開始する
            session = request.getSession(true);
            session.setAttribute("visited", 1);
        }else {
            int visitCount = (Integer)session.getAttribute("visited");
            visitCount++;

            out.println("<p>" + visitCount + "回目の訪問です。</p>");

            session.setAttribute("visited", visitCount);
        }
        out.println("<a href=\"CountSession\">画面を再訪問</a>");
        out.println("</body>");
        out.println("</html>");
    }

}

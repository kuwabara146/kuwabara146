package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Result")
public class Result extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //文字コードの指定
        request.setCharacterEncoding("UTF-8");

        //フォームから送信された情報の取得
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String category = request.getParameter("category");
        String content = request.getParameter("content");

        response.setContentType("text/html; charset = UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset = 'UTF-8'>");
        out.println("<title>Result</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>以下の内容でお問い合わせしました。回答をお待ちください。</p>");
        out.println("名前:" + name + "様<br>");
        out.println("性別:" + sex + "<br>");
        out.println("お問い合わせ種類:" + category + "<br>");
        out.println("お問い合わせ内容:" + content);
        out.println("</body>");
        out.println("</html>");
    }

}

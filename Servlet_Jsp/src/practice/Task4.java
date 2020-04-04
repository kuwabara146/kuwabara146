package practice;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/task4")
public class Task4 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String RESULT_PATH = "/WEB-INF/jsp/fortune_result.jsp";
        Random random = new Random();

        //日付を取得
        Date today = new Date();

        //指定の配列を作成
        String[] fortuneArray = {"大吉","中吉","小吉","末吉","凶","大凶"};

        //配列からランダムな占い結果を取得
        String fortune = fortuneArray[random.nextInt(6)];

        //FortuneBeanのインスタンスを作成
        FortuneBean resultData = new FortuneBean();

        //日付と占い結果をリクエストスコープへ設定
        resultData.setToday(today);
        resultData.setFortune(fortune);
        request.setAttribute("result", resultData);

        //fortune_resultへフォワード処理
        request.getRequestDispatcher(RESULT_PATH).forward(request, response);
    }

}

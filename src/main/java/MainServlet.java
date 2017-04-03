import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Created by dkuzmich on 3/28/2017.
 */
@WebServlet("/")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        //PrintWriter pw=resp.getWriter();
        //pw.print("<h1> Hello servlet </h1>");
        req.setAttribute("name", "Dima");

        String login=req.getParameter("login");


        req.setAttribute("Login", login);

        req.setAttribute("Pass", req.getParameter("pass"));

        req.getRequestDispatcher("mypage.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Enumeration;

/**
 * Created by dkuzmich on 3/28/2017.
 */
@WebServlet("/")
public class MainServlet extends HttpServlet {

Mydb mydb=new Mydb();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);
        //PrintWriter pw=resp.getWriter();
        //pw.print("<h1> Hello servlet </h1>");
        req.setAttribute("name", "Dima");

        String login=req.getParameter("login");


        req.setAttribute("Login", login);

        req.setAttribute("Pass", req.getParameter("pass"));
        mydb.contoDB();

        req.getRequestDispatcher("mypage.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String condb=req.getParameter("conDB");
        if("conDB".equals(condb)){
            System.out.println("!!!!!!!! DB Connected!!!!!!!!!!!!");
            resp.setContentType("text/html");
            PrintWriter outp=resp.getWriter();
            outp.print("!!!!!!!! DB Connected!!!!!!!!!!!!");
          //req.setAttribute("dbcon", " DB connected");
           req.getRequestDispatcher("myDB.jsp").forward(req, resp);
        }
    }





}

package servlets_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher("login.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        System.out.println(pass);
        System.out.println(uname);

        if (uname != null && pass != null) {
            if ((uname.equals("admin")) && (pass.equals("password"))) {
                request.getRequestDispatcher("profile.jsp").forward(request, response);
                return;
            } else {
                //if we get here redispatch login.jsp
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }

    }
}
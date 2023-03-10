package servlets_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");


        if (uname != null &&
                pass != null) {
            if ((uname.equals("admin")) &&
                    (pass.equals("password"))) {
                response.sendRedirect("/profile.jsp");
            } else {
                response.sendRedirect("/login.jsp");
            }
        }

    }
}
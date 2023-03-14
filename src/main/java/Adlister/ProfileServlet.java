package Adlister;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ProfileServlet", urlPatterns = "/profile")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession();
        String uname = (String) session.getAttribute("uname");
        if (request.getSession().getAttribute("uname") == null) {
            response.sendRedirect("/login");
            return;
        } else {
            request.getRequestDispatcher("/WEB-INF/ads/profile.jsp").forward(request, response);
            //response.sendRedirect("/profile");

        }


    }

}



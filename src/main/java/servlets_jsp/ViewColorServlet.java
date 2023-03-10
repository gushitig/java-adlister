package servlets_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String color = request.getParameter("color");
        request.setAttribute("bgcolor", color);

        System.out.println(color);

        if (color == null || color.length() == 0) {
            response.sendRedirect("/pickcolor");
            return;
        }

        request.getRequestDispatcher("servlets_jsp/viewcolor.jsp").forward(request, response);

    }


}

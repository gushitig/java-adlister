import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    private int count;
    private String reset;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String reset = request.getParameter("reset");

        if(reset == null) {
            count++;
        } else {
            count = 0;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Count: " + count + "</h1>");


    }

}
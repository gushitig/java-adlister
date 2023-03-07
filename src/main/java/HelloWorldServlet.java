import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


        if(name == null) {
            out.println("<h1>Hello, World!</h1>");
        } else {
            out.println("<h1>Hello, " + name + "!</h1>");
        }


    }

}
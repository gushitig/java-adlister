package Books;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="Books.ShowBooksServlet", urlPatterns = "/books")
public class ShowBooksServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("books", BooksDaoFactory.getBooksDao().all());
        request.getRequestDispatcher("/webapp/books.index.jsp").forward(request, response);



    }
}

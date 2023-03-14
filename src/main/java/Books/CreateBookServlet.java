package Books;

import Adlister.Ad;
import Adlister.AdsDaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="CreateBookServlet", urlPatterns = "/books/create")
public class CreateBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/books/create.jsp")
                .forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book newBook = new Book(
                request.getParameter("title"),
                request.getParameter("author")
        );
        if(BooksDaoFactory.getBooksDao().insert(newBook)){
            response.sendRedirect("/books");
        } else {
            response.sendRedirect("/books/create?error");
        }

    }
}

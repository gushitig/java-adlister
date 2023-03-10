package servlets_jsp;

import DAO.PersonDAOFactory;
import DAO.PersonListDAO;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "personServlet", urlPatterns = "/person")
public class PersonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PersonListDAO dao = PersonDAOFactory.getPersonDAO();

        request.setAttribute("people", dao.all());
        request.getRequestDispatcher("/person/index.jsp").forward(request, response);
    }
}


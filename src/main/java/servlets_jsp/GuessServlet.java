package servlets_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("servlets_jsp/guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String guess = request.getParameter("guess");
        String ans;
        int guessNum = Integer.parseInt(guess);

        Random ran = new Random();
        int random = ran.nextInt((3 - 1) + 1) + 1;


        //enter a try catch here for parseInt if its not a number or the user enters garbage
        if (guessNum == 1 || guessNum == 2 || guessNum == 3) {

            if (guessNum == random) {
                response.sendRedirect("/correct");
            } else {

                response.sendRedirect("/incorrect");
            }

        } else {
            response.sendRedirect("/guess");
        }

    }


}

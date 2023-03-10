package servlets_jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("servlets_jsp/pizza-order.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String crust = request.getParameter("crust");
        if(crust != null){
            System.out.println("Crust: " + crust);
        }

        String sauce = request.getParameter("sauce");
        if(sauce != null){
            System.out.println("Sauce: " + sauce);
        }

        String size = request.getParameter("size");
        if(size != null){
            System.out.println("Size: " + size);
        }

        String Cheese = request.getParameter("Cheese");
        if(Cheese != null){
            System.out.println("Toppings: " + Cheese);
        }

        String Mushrooms = request.getParameter("Mushrooms");
        if(Mushrooms != null){
            System.out.println("Toppings: " + Mushrooms);
        }

        String Bacon = request.getParameter("Bacon");
        if(Bacon != null){
            System.out.println("Toppings: " + Bacon);
        }

        String Pepperoni = request.getParameter("Pepperoni");
        if(Pepperoni != null){
            System.out.println("Toppings: " + Pepperoni);
        }

        String address = request.getParameter("address");
        if(address != null){
            System.out.println("Address: " + address);
        }

        response.sendRedirect("/pizza-order");


    }


}

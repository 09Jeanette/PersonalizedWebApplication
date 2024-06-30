
package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.pojo.Greet;


/**
 *
 * @author Jeanette
 */
public class PersonalizedGreetingServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String name = request.getParameter("name");
       String gender = request.getParameter("gender");
       
       //business logic
       Greet g = new Greet();
       String title = g.greet(gender);
       
        request.setAttribute("name",name );

        request.setAttribute("title",title );
        
        RequestDispatcher disp = request.getRequestDispatcher("output.jsp");
        disp.forward(request, response);
       
    }

}

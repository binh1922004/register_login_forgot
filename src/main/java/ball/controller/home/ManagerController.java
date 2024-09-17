package ball.controller.home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@SuppressWarnings("serial")
@WebServlet("/home/manager")
public class ManagerController extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String username = (String) req.getAttribute("username");
//                String roleid = (String) req.getAttribute("roleid");
                System.out.println(username);
                req.getRequestDispatcher("/view/home.jsp").forward(req, resp);
        }
}

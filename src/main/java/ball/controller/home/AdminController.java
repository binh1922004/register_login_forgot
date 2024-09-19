package ball.controller.home;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//@SuppressWarnings("serial")
@WebServlet("/home/admin")
public class AdminController extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                Cookie[] cookie = req.getCookies();
                for (Cookie c: cookie) {
                        boolean login = false;
                        if (c.getName().equals("username")) {
                                login = true;
                        }
                        if (!login) {
                                resp.sendRedirect(req.getContextPath() + "/login");
                        }
                }
                req.getRequestDispatcher("/view/home.jsp").forward(req, resp);
        }
}

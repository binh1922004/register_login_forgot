package ball.controller.forgot;

import ball.ultils.Constant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/forgot/newpass")
public class NewPassForgotController extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                HttpSession session = req.getSession();
                String pass = (String) session.getAttribute("pass");

                req.setAttribute("pass", pass);
                req.getRequestDispatcher(Constant.FORGOT_PATH + "/newpass.jsp").forward(req, resp);
        }
}

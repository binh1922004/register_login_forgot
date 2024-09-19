package ball.controller.forgot;

import ball.models.UserModel;
import ball.service.IUserService;
import ball.service.impl.UserServiceImpl;
import ball.ultils.Constant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/forgot/recover")

public class EmailVerifyForgotController extends HttpServlet {
        IUserService userService = new UserServiceImpl();
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                req.getRequestDispatcher(Constant.FORGOT_EMAIL).forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String emailRequest = req.getParameter("email");
                HttpSession session = req.getSession();
                String username = (String) session.getAttribute("username");
                String email = (String) session.getAttribute("email");

                System.out.println();

                if (email.equals(emailRequest)){
                        //get random pass
                        String pass = Constant.randomPass();

                        userService.updatePassword(username, pass);

                        //set pass to jsp
                        session.setAttribute("pass", pass);
                        resp.sendRedirect(req.getContextPath() + "/forgot/newpass");
                }
                else{
                        String alertMSG = "Email is not correct";
                        req.setAttribute("alert", alertMSG);
                        req.getRequestDispatcher(Constant.FORGOT_EMAIL).forward(req, resp);
                }
        }
}

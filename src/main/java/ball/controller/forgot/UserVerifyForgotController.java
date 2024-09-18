package ball.controller.forgot;

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

@WebServlet("/forgot/identify")
public class UserVerifyForgotController extends HttpServlet {
        IUserService userService = new UserServiceImpl();

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                req.getRequestDispatcher(Constant.FORGOT_USER).forward(req, resp);
        }


        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String username = req.getParameter("username");
                String alertMSG = "";

                HttpSession session = req.getSession(true);

                if (userService.existedUser(username)){
                        session.setAttribute("username", username);
//                        resp.sendRedirect(req.getContextPath() + "/recover");
                }
                else{
                        alertMSG = "No search results";
                        req.setAttribute("alert", alertMSG);
                        req.getRequestDispatcher(Constant.FORGOT_USER).forward(req, resp);
                }

        }
}

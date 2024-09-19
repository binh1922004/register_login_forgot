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

                UserModel userModel = userService.findByUserName(username);
                if (userModel != null){
                        HttpSession session = req.getSession(true);
                        session.setAttribute("username", username);
                        session.setAttribute("email", userModel.getEmail());
                        resp.sendRedirect(req.getContextPath() + "/forgot/recover");
                }
                else{
                        alertMSG = "No search results";
                        req.setAttribute("alert", alertMSG);
                        req.getRequestDispatcher(Constant.FORGOT_USER).forward(req, resp);
                }

        }
}

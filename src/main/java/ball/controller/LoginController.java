package ball.controller;

import ball.models.UserModel;
import ball.service.IUserService;
import ball.service.impl.UserServiceImpl;
import ball.ultils.Constant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                super.doGet(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

                String username = req.getParameter("username");
                String pass = req.getParameter("password");

                String remember = req.getParameter("remember");

                boolean isRemember = false;
                if ("on".equals(remember))
                        isRemember = true;
                String alertMSG = "";

                if (username.isEmpty() || pass.isEmpty()){
                        alertMSG = "Tai khoan hoac mat khau khong duoc rong";
                        req.setAttribute("alert", alertMSG);
                        req.getRequestDispatcher("/view/login.jsp").forward(req, resp);
                        return;
                }
                IUserService userService = new UserServiceImpl();
                UserModel user = userService.login(username, pass);
                if (user != null){
                        HttpSession session = req.getSession(true);
                        session.setAttribute("account", user);
                        if (isRemember){
                                saveRemeberMe(resp, username);
                        }
                        resp.sendRedirect(req.getContextPath() + "/waiting");
                }
                else{
                        alertMSG = "Tài khoản hoặc mật khẩu không đúng";
                        req.setAttribute("alterMsg", alertMSG);
                        req.getRequestDispatcher("/view/login.jsp").forward(req, resp);
                }
        }
        private void saveRemeberMe(HttpServletResponse response, String
                username){
                Cookie cookie = new Cookie(Constant.COOKIE_REMEMBER,
                        username);
                cookie.setMaxAge(60*30);
                response.addCookie(cookie);
        }
}

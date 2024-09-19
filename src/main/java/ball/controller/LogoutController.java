package ball.controller;

import ball.ultils.Constant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/logout")
public class LogoutController extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                Cookie[] cookies = req.getCookies();
                for (Cookie c: cookies){
                        if (c.getName().equals("username")){
                                c.setMaxAge(0);
                                resp.addCookie(c);
                                break;
                        }
                }
                resp.sendRedirect("/MVC/login");
        }
}

package ball.controller;

import ball.dao.IRoleDao;
import ball.dao.impl.RoleDaoImpl;
import ball.models.UserModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/waiting")
public class WaitingController extends HttpServlet {
        IRoleDao roleDao = new RoleDaoImpl();
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                HttpSession session= req.getSession();
                if(session != null && session.getAttribute("account") != null) {
                        UserModel u=(UserModel) session.getAttribute("account");
                        session.setAttribute("username", u.getUserName());
                        session.setAttribute("roleid", roleDao.findRoleNameById(u.getRoleid()));
                        if(u.getRoleid()==1) {
                                resp.sendRedirect(req.getContextPath()+"/home/admin");
                        }
                        else if(u.getRoleid()== 3) {
                                resp.sendRedirect(req.getContextPath()+"/home/manager");
                        }
                        else {
                                resp.sendRedirect(req.getContextPath()+"/home");
                        }
                }
                else {
                        resp.sendRedirect(req.getContextPath() + "/login");
                }
        }
}

package ball.controller;

import ball.request.UserCreationRequest;
import ball.service.IUserService;
import ball.service.impl.UserServiceImpl;
import ball.ultils.Constant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/register")
public class RegisterController extends HttpServlet {

        IUserService userService = new UserServiceImpl();
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                req.getRequestDispatcher(Constant.REGISTER).forward(req, resp);
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String username = req.getParameter("username");
                String password = req.getParameter("password");
                String fullname = req.getParameter("fullname");
                String email = req.getParameter("email");
                String avtar = "";
                Integer roleid = Integer.valueOf(req.getParameter("role"));
                String phone = req.getParameter("phone");
                LocalDate date = LocalDate.now();



                String alertMSG = "";
                if (userService.existedEmail(email)){
                        alertMSG = "Email existed";
                }
                else if (userService.existedUser(username)){
                        alertMSG = "Username existed";
                }
                else if (userService.existedPhone(phone)){
                        alertMSG = "Phone existed";
                }
                else{
                        UserCreationRequest request = new UserCreationRequest(username, password, fullname, email, avtar,
                                roleid, phone, date);
                        if (!userService.createUser(request)){
                                alertMSG = "Error when register";
                        }
                }

                if (alertMSG.isEmpty()){
                        alertMSG = "Registered successfully";
                        req.setAttribute("alert", alertMSG);
                        req.getRequestDispatcher(Constant.LOGIN).forward(req, resp);
                }
                else{
                        req.setAttribute("alert", alertMSG);
                        req.getRequestDispatcher(Constant.REGISTER).forward(req, resp);
                }

        }
}

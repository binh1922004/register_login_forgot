package ball.controller;

import ball.ultils.Constant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/image")
public class DownloadFileController extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                String fileName = req.getParameter("fname");
                File file = new File(Constant.DEFAULT_FILENAME + "/" + fileName);
                resp.setContentType("image/jpeg");
                if (file.exists()) {
                        IOUtils.copy(new FileInputStream(file), resp.getOutputStream());
                }
        }
}

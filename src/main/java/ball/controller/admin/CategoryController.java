package ball.controller.admin;

import ball.dao.impl.CategoryServiceImpl;
import ball.models.CategoryModel;
import ball.service.ICategoryService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet({"/admin/categories", "/admin/categories/add"})
public class CategoryController extends HttpServlet {
        private static final long serialVersionUID = 1L;

        public ICategoryService categoryService = new CategoryServiceImpl();
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                req.setCharacterEncoding("UTF-8");
                resp.setCharacterEncoding("UTF-8");


                String url = req.getRequestURI();

                if (url.contains("/admin/categories")){
                        List<CategoryModel> list = categoryService.findAll();
                        req.setAttribute("listcate", list);
                        req.getRequestDispatcher("/view/admin/category-list.jsp").forward(req, resp);
                }
                else if (url.contains("/admin/categories/add")){
                        req.getRequestDispatcher("/view/admin/catetory-add.jsp").forward(req, resp);
                }
        }
}

package ball.dao.impl;

import ball.config.DBConnectMySQL;
import ball.dao.ICateogryDao;
import ball.models.CategoryModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CateogryDaoImpl implements ICateogryDao {
        public Connection conn = null;
        public PreparedStatement ps = null;
        public ResultSet rs = null;
        @Override
        public List<CategoryModel> findAll() {
                String sql = "select * from category";
                List<CategoryModel> categoryModelList = new ArrayList<>();
                try{
                        conn = DBConnectMySQL.getDatabaseConnection();
                        ps = conn.prepareStatement(sql);
                        rs = ps.executeQuery();
                        while (rs.next()){
                                int id = rs.getInt(1);
                                String categoryname = rs.getString(2);
                                String img = rs.getString(3);
                                int status = rs.getInt(4);
                                CategoryModel categoryModel = new CategoryModel(id, categoryname, img, status);
                                categoryModelList.add(categoryModel);
                        }

                        conn.close();
                        ps.close();
                        rs.close();
                }
                catch (Exception ex){
                        throw new RuntimeException(ex);
                }
                return categoryModelList;

        }

        @Override
        public CategoryModel findById(int id) {
                String sql = "select * from category where (categoryid = ?)";
                try{
                        conn = DBConnectMySQL.getDatabaseConnection();
                        ps = conn.prepareStatement(sql);
                        ps.setInt(1, id);
                        rs = ps.executeQuery();

                        CategoryModel category = new CategoryModel();
                        while (rs.next()){
                                String categoryname = rs.getString(2);
                                String img = rs.getString(3);
                                int status = rs.getInt(4);
                                category.setCategoryid(id);
                                category.setCategoryname(categoryname);
                                category.setImg(img);
                                category.setStatus(status);
                                return category;
                        }
                        conn.close();
                        ps.close();
                        rs.close();

                }
                catch (Exception ex){
                        throw new RuntimeException(ex);
                }
                return null;
        }

        @Override
        public CategoryModel findByName(String name) {
                String sql = "select * from category where (categoryid = ?)";
                try{
                        conn = DBConnectMySQL.getDatabaseConnection();
                        ps = conn.prepareStatement(sql);
                        ps.setString(1, name);
                        rs = ps.executeQuery();

                        while (rs.next()){
                                CategoryModel category = new CategoryModel();
                                int id = rs.getInt(1);
                                String img = rs.getString(3);
                                int status = rs.getInt(4);
                                
                                category.setCategoryid(id);
                                category.setCategoryname(name);
                                category.setImg(img);
                                category.setStatus(status);
                                return category;
                        }
                        conn.close();
                        ps.close();
                        rs.close();
                }
                catch (Exception ex){
                        throw new RuntimeException(ex);
                }
                return null;
        }

        @Override
        public List<CategoryModel> searchByName(String keyword) {
                String sql = "select * from category where categoryname like ?";
                List<CategoryModel> categoryModelList = new ArrayList<>();
                try{
                        conn = DBConnectMySQL.getDatabaseConnection();
                        ps = conn.prepareStatement(sql);
                        ps.setString(1, "%" + keyword + "%");
                        rs = ps.executeQuery();
                        while (rs.next()){
                                int id = rs.getInt(1);
                                String categoryname = rs.getString(2);
                                String img = rs.getString(3);
                                int status = rs.getInt(4);
                                CategoryModel categoryModel = new CategoryModel(id, categoryname, img, status);
                                categoryModelList.add(categoryModel);
                        }
                        conn.close();
                        ps.close();
                        rs.close();
                }
                catch (Exception ex){
                        throw new RuntimeException(ex);
                }
                return categoryModelList;
        }

        @Override
        public void insert(CategoryModel category) {
                String sql = "insert into category(categoryname, img, status) values(?, ?, ?)";

                try{
                        conn = DBConnectMySQL.getDatabaseConnection();
                        ps = conn.prepareStatement(sql);
                        ps.setString(1, category.getCategoryname());
                        ps.setString(2, category.getImg());
                        ps.setInt(3, category.getStatus());

                        ps.executeUpdate();

                        conn.close();
                        ps.close();
                        rs.close();
                }
                catch (Exception ex){
                        throw new RuntimeException(ex);
                }
        }

        @Override
        public void update(CategoryModel category) {
                String sql = "update category set categoryname = ?, img = ?, status = ? where categoryid = ?";

                try{
                        conn = DBConnectMySQL.getDatabaseConnection();
                        ps = conn.prepareStatement(sql);
                        ps.setString(1, category.getCategoryname());
                        ps.setString(2, category.getImg());
                        ps.setInt(3, category.getStatus());
                        ps.setInt(4, category.getCategoryid());

                        ps.executeUpdate();

                        conn.close();
                        ps.close();
                        rs.close();
                }
                catch (Exception ex){
                        throw new RuntimeException(ex);
                }
        }

        @Override
        public void delete(int id) {
                String sql = "delete  from category where categoryid = ?";

                try{
                        conn = DBConnectMySQL.getDatabaseConnection();
                        ps = conn.prepareStatement(sql);
                        ps.setInt(1, id);

                        ps.executeUpdate();

                        conn.close();
                        ps.close();
                        rs.close();
                }
                catch (Exception ex){
                        throw new RuntimeException(ex);
                }
        }

        @Override
        public void updateStatus(int id, int status) {
                String sql = "update category set status = ? where categoryid = ?";

                try{
                        conn = DBConnectMySQL.getDatabaseConnection();
                        ps = conn.prepareStatement(sql);
                        ps.setInt(1, status);
                        ps.setInt(2, id);

                        ps.executeUpdate();

                        conn.close();
                        ps.close();
                        rs.close();
                }
                catch (Exception ex){
                        throw new RuntimeException(ex);
                }
        }

        public static void main(String[] args) {
                System.out.println(new CateogryDaoImpl().findAll());
        }
}

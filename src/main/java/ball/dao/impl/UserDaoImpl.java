package ball.dao.impl;

import ball.config.DBConnectMySQL;
import ball.dao.IUserDao;
import ball.models.UserModel;
import ball.request.UserCreationRequest;

import java.sql.*;
import java.time.LocalDate;

public class UserDaoImpl implements IUserDao {
        @Override
        public boolean createUser(UserCreationRequest request) {
                String sql = "insert into users(username, users.password, fullname, email, avatar, roleid, phone, createddate) " +
                        "values(?, ?, ?, ?, ?, ?, ?, ?)";
                try{
                        Connection conn = DBConnectMySQL.getDatabaseConnection();
                        PreparedStatement ps =conn.prepareStatement(sql);
                        ps.setString(1, request.getUserName());
                        ps.setString(2, request.getPassWord());
                        ps.setString(3, request.getFullName());
                        ps.setString(4, request.getEmail());
                        ps.setString(5, request.getAvatar());
                        ps.setInt(6, request.getRoleid());
                        ps.setString(7, request.getPhone());
                        ps.setDate(8, Date.valueOf(request.getCreatedDate()));

                        return ps.executeUpdate() > 0;
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }
        }

        @Override
        public void updatePassword(String username, String password) {
                String sql = "UPDATE `demo`.`users` SET password = ? WHERE (username = ?)";
                try{
                        Connection conn = DBConnectMySQL.getDatabaseConnection();
                        PreparedStatement ps = conn.prepareStatement(sql);
                        ps.setString(1, password);
                        ps.setString(2, username);

                        ps.executeUpdate();

                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }
        }

        @Override
        public UserModel findByUsername(String username) {
                String sql = "select * from users where username = ?";
                try{
                        Connection conn = DBConnectMySQL.getDatabaseConnection();
                        PreparedStatement ps = conn.prepareStatement(sql);
                        ps.setString(1, username);
                        ResultSet rs = ps.executeQuery();
                        UserModel userModel = new UserModel();
                        while (rs.next()){
                                userModel.setId(rs.getInt("id"));
                                userModel.setUserName(rs.getString("username"));
                                userModel.setPassWord(rs.getString("password"));
                                userModel.setEmail(rs.getString("email"));
                                userModel.setFullName(rs.getString("fullname"));
                                userModel.setPhone(rs.getString("phone"));
                                userModel.setAvatar(rs.getString("avatar"));
                                userModel.setRoleid(rs.getInt("roleid"));
                                userModel.setCreatedDate(rs.getDate("createddate"));
                        }
                        return userModel;
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }
        }

        @Override
        public boolean existedUser(String username) {
                String sql = "select * from users where username = ?";
                try{
                        Connection conn = DBConnectMySQL.getDatabaseConnection();
                        PreparedStatement ps = conn.prepareStatement(sql);
                        ps.setString(1, username);
                        ResultSet rs = ps.executeQuery();
                        UserModel userModel = new UserModel();
                        while (rs.next()){
                                return true;
                        }
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }
                return false;
        }

        @Override
        public boolean existedEmail(String email) {
                String sql = "select * from users where email = ?";
                try{
                        Connection conn = DBConnectMySQL.getDatabaseConnection();
                        PreparedStatement ps = conn.prepareStatement(sql);
                        ps.setString(1, email);
                        ResultSet rs = ps.executeQuery();
                        UserModel userModel = new UserModel();
                        while (rs.next()){
                                return true;
                        }
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }
                return false;
        }

        @Override
        public boolean existedPhone(String phone) {
                String sql = "select * from users where phone = ?";
                try{
                        Connection conn = DBConnectMySQL.getDatabaseConnection();
                        PreparedStatement ps = conn.prepareStatement(sql);
                        ps.setString(1, phone);
                        ResultSet rs = ps.executeQuery();
                        UserModel userModel = new UserModel();
                        while (rs.next()){
                                return true;
                        }
                } catch (SQLException e) {
                        throw new RuntimeException(e);
                }
                return false;
        }

        public static void main(String[] args) {
                System.out.println(new UserDaoImpl().existedEmail("binh@gmail.com"));
        }
}

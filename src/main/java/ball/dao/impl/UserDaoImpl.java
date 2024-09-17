package ball.dao.impl;

import ball.config.DBConnectMySQL;
import ball.dao.IUserDao;
import ball.models.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDao {
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
}

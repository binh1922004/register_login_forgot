package ball.dao.impl;

import ball.config.DBConnectMySQL;
import ball.dao.IRoleDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RoleDaoImpl implements IRoleDao {
        @Override
        public String findRoleNameById(int roleid) {
                String sql = "select * from roles where roleid = ?";
                String rolename = "";
                try{
                        Connection conn = DBConnectMySQL.getDatabaseConnection();
                        PreparedStatement ps = conn.prepareStatement(sql);
                        ps.setInt(1, roleid);
                        ResultSet rs = ps.executeQuery();
                        while (rs.next()){
                                rolename = rs.getString(2);
                        }
                }
                catch (Exception e){
                        throw new RuntimeException(e);
                }
                return rolename;
        }
}

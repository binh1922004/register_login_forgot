package ball.service.impl;

import ball.dao.impl.UserDaoImpl;
import ball.models.UserModel;
import ball.service.IUserService;

public class UserServiceImpl implements IUserService {
        UserDaoImpl userDao = new UserDaoImpl();
        @Override
        public UserModel findByUserName(String username) {
                return userDao.findByUsername(username);
        }

        @Override
        public UserModel login(String username, String password) {
                UserModel user = this.findByUserName(username);
                if (user != null && password.equals(user.getPassWord()))
                        return user;
                return null;
        }

        public static void main(String[] args) {
                System.out.println(new UserServiceImpl().login("binh", "123"));
        }
}

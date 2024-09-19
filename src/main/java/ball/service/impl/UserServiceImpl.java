package ball.service.impl;

import ball.dao.impl.UserDaoImpl;
import ball.models.UserModel;
import ball.request.UserCreationRequest;
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

        @Override
        public void updatePassword(String username, String newpass) {
                userDao.updatePassword(username, newpass);
        }


        @Override
        public boolean createUser(UserCreationRequest request) {
                return userDao.createUser(request);
        }

        @Override
        public boolean existedUser(String username) {
                return userDao.existedUser(username);
        }

        @Override
        public boolean existedEmail(String email) {
                return userDao.existedEmail(email);
        }

        @Override
        public boolean existedPhone(String phone) {
                return userDao.existedPhone(phone);
        }

}

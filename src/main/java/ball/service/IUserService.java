package ball.service;

import ball.models.UserModel;

public interface IUserService {
        UserModel findByUserName(String username);
        UserModel login(String username, String password);
}

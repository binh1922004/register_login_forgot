package ball.service;

import ball.models.UserModel;
import ball.request.UserCreationRequest;

public interface IUserService {
        UserModel findByUserName(String username);
        UserModel login(String username, String password);
        boolean createUser(UserCreationRequest request);
}

package ball.service;

import ball.models.UserModel;
import ball.request.UserCreationRequest;

public interface IUserService {
        UserModel findByUserName(String username);
        UserModel login(String username, String password);
        void updatePassword(String username, String newpass);
        boolean createUser(UserCreationRequest request);
        boolean existedUser(String username);
        boolean existedEmail(String email);
        boolean existedPhone(String phone);
}

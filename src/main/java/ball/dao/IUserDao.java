package ball.dao;

import ball.models.UserModel;
import ball.request.UserCreationRequest;

public interface IUserDao {
        boolean createUser(UserCreationRequest request);
        UserModel findByUsername(String username);
        boolean existedUser(String username);
        boolean existedEmail(String email);
        boolean existedPhone(String phone);
}

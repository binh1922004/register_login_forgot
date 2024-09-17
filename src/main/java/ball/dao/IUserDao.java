package ball.dao;

import ball.models.UserModel;

public interface IUserDao {
        UserModel findByUsername(String username);
}

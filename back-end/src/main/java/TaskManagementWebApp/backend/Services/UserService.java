package TaskManagementWebApp.backend.Services;

import TaskManagementWebApp.backend.Models.User;

public interface UserService {
    User createUser();

    User readUser(Integer userId);

    User updateUser(User user);

    String deleteUser(Integer userId);
}

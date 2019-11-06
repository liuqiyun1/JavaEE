package mybatis;

import pojo.User;

import java.util.List;

public interface UserMapper {
    public User addUser(User user);
    public void deleteUserById(Integer userId);
    public User findUserById(Integer userId);
}

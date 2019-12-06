package mapper;

import pojo.User;

import java.util.List;

public interface UserMapper {
    public User selectUserById(int id);
    public User selectUserByOrder_id(int order_id);
    public List<User> selectUsersById( int[] id);
    public List<User> selectUserLikeName(String name);
    public int insert(User user);
    public int delete(int id);
    public int update(User user);
}

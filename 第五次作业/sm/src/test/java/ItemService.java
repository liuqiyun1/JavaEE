import mapper.ItemMapper;
import mapper.OrderMapper;
import mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Item;
import pojo.User;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ItemService {
    @Autowired
    ItemMapper itemMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    OrderMapper orderMapper;
@Test
    public void insert() {
        Item item =new Item();
        item.setId(3);
        item.setName("aaa");
        item.setPrice(1.1f);
        item.setCreatetime(new Date());
        itemMapper.insert(item);
    }
    @Test
    public void selectItem(){
        Item item = itemMapper.select("aaa");
        System.out.println(item);
    }
    @Test
    public void selectUsers(){
        int[] id={1,2222};
        List<User> users = userMapper.selectUsersById(id);
        System.out.println(users);
    }
    @Test
    public void selectUserByOrder_id(){
        System.out.println(userMapper.selectUserByOrder_id(1));
    }
    @Test
    public void addUser(){
        User user=new User();
        user.setId(1);
        System.out.println(userMapper.insert(user));
    }
    @Test
    public void updateUser(){
    User user=new User();
    user.setId(1);
    user.setName("老王");
    userMapper.update(user);
    }

    @Test
    public void selectOrderByUser_id(){
        System.out.println(orderMapper.selectOrderByUser_id(1));
    }

    @Test
    public void selectItemsByUser_name(){
        System.out.println(itemMapper.selectItemsByUser_name("老王"));
    }
}

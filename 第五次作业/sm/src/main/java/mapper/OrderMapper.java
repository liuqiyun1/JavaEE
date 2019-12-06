package mapper;


import pojo.Order;
public interface OrderMapper {
    public Order selectOrderByUser_id(int user_id);

}

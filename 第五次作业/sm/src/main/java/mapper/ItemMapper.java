package mapper;

import pojo.Item;

import java.util.List;

public interface ItemMapper {
    public void insert(Item item);
    public void delete(Integer id);
    public Item select(String  name);
    public void update(Item item);
    public List<Item> selectItemsByUser_name(String name);
}

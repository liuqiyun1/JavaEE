package pojo;

import java.util.Date;
import java.util.List;

public class Order {
    private Integer id;
    private String user_id;
    private List<Item> itemList;
    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", itemList=" + itemList +
                ", createtime=" + createtime +
                '}';
    }
}

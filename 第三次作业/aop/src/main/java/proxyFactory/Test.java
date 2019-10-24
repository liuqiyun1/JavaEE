package proxyFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        String path="proxyFactory.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(path);

        UserDao userDao=(UserDao)applicationContext.getBean("userDaoProxy");

        userDao.addUser();


    }
}

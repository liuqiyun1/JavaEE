package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application.xml");

        UserDaoImpl userDao = (UserDaoImpl) applicationContext.getBean("userDao");
        userDao.transfer(1,2,3.5f);
    }
}

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MeetingService;

public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        MeetingService meetingService=(MeetingService) applicationContext.getBean("meetingService");
        meetingService.showMeeting();
    }
}

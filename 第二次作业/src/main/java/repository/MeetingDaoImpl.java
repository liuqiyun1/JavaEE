package repository;

import bean.Boss;
import bean.Car;
import bean.Meeting;

import java.util.LinkedList;

public class MeetingDaoImpl implements MeetingDao{

    public Meeting makeMeeting() {
        Meeting meeting=new Meeting("全国财贸工会工作会议",new LinkedList<Boss>());
        for (int i=1;i<=5;i++){
            Boss boss=new Boss("姓名"+i,"公司名"+i,"爱好"+i,new Car("颜色"+i,"品牌"+i,i));
            meeting.getBossList().add(boss);
        }
        return meeting;
    }
}

package service;


import bean.Meeting;
import repository.MeetingDao;

public class MeetingServiceImpl implements MeetingService {

    private MeetingDao meetingDao;

    public void setMeetingDao(MeetingDao meetingDao) {
        this.meetingDao = meetingDao;
    }

    public void showMeeting() {
        Meeting meeting=meetingDao.makeMeeting();
        System.out.println(meeting);
    }
}

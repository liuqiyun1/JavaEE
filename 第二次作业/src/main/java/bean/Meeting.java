package bean;

import java.util.LinkedList;

public class Meeting {
    private String theme;
    private LinkedList<Boss> bossList;

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public LinkedList<Boss> getBossList() {
        return bossList;
    }

    public void setBossList(LinkedList<Boss> bossList) {
        this.bossList = bossList;
    }

    public Meeting() {
    }

    public Meeting(String theme, LinkedList<Boss> bossList) {
        this.theme = theme;
        this.bossList = bossList;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", bossList=" + bossList +
                '}';
    }
}

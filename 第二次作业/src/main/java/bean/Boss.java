package bean;

public class Boss {
    private String name;
    private String company;
    private String hobby;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Boss() {
    }

    public Boss(String name, String company, String hobby, Car car) {
        this.name = name;
        this.company = company;
        this.hobby = hobby;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", hobby='" + hobby + '\'' +
                ", car=" + car +
                '}';
    }
}

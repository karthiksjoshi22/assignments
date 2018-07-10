package pro6;

import java.util.Date;

public class Employee {
    private int num;
    private String name;
    private Date date;


    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date=date;
    }

    public Date getDate() {
        return date;
    }

}
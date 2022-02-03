package Ex01_5;

import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        Date myDate = new Date();
        System.out.println("In main - before call function – myDate=" + myDate);
        changeDate(myDate);
        System.out.println("In main - after call function - myDate=" + myDate);
    }
    public static void changeDate(Date date) {
        System.out.println("In changeDate - before change - date=" + date);
        date.setYear(2999 - 1900);
        System.out.println("In changeDate - after change - date=" + date);
    }
}
/**
 * Created by jiash on 2017-04-20.
 */
import java.util.*;
class DateS{
    int year;
    int month;
    int day;
}

public class Datetest {
    static void ShowYear(DateS d){
        System.out.println("Year:" + d.year);
    }
    static void ShowMonth(DateS d){
        System.out.println("Month:" + d.month);
    }
    static void ShowDay(DateS d){
        System.out.println("Day:" + d.day);
    }

    public static void main(String[] args){
        System.out.print("Now it's:");
        System.out.println(new Date());
        DateS aDate = new DateS();
        aDate.year=2017;
        aDate.month=4;
        aDate.day=20;
        ShowYear(aDate);
        ShowMonth(aDate);
        ShowDay(aDate);
    }
}


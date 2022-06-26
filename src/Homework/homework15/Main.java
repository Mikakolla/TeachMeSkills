package Homework.homework15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        Main main = new Main();

        main.printNameDayOfWeek("02-01-2022");
        main.printDayNextTuesday();

        Service service = new Service();
        service.main();
    }

    public void printNameDayOfWeek(String dateStr) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date = simpleDateFormat.parse(dateStr);

        String dayWeekName = new SimpleDateFormat("EEEE").format(date);

        System.out.println("День недели: " + dayWeekName);

    }

    public void printDayNextTuesday() {

        LocalDate localDate = LocalDate.now();

        localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));

        System.out.println("localDate = " + localDate);
        
    }

}

package exceptionHandling.G2;

import java.time.Duration;
import java.time.LocalTime;

public class Timeee {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.parse("09:50");
        LocalTime time2 = LocalTime.parse("10:10");


        Duration duration = Duration.between(time1, time2);


        long hours = duration.toHours();
        long minutes = duration.toMinutes();


        System.out.println("Time difference: " + hours + " hrs " + minutes + " min");
    }
}

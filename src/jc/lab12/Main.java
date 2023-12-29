package jc.lab12;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //Зміна часової зони для поточної дати/часу
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime switchedCurrent = switchTimeZone(currentDateTime, "America/New_York", -5);
        System.out.println("Поточний час у Нью-Йорку: " + switchedCurrent.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        //Зміна часової зони для конкретної дати/часу
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 1, 1, 12, 0);
        LocalDateTime switchedSpecific = switchTimeZone(specificDateTime, "Asia/Tokyo", 9);
        System.out.println(specificDateTime + " у Токіо: " + switchedSpecific.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

    public static LocalDateTime switchTimeZone(LocalDateTime dateTime, String timeZone, int offsetHours) {
        ZoneId zone = ZoneId.of(timeZone);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zone).plusHours(offsetHours);
        return zonedDateTime.toLocalDateTime();
    }
}
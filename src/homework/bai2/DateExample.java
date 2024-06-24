package homework.bai2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateExample {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);
        //tokyo
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Tokyo: " + tokyo);
        // Ngày hiện tại tại Australia/Sydney
        ZonedDateTime sydneyDate = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Ngày hiện tại tại Sydney: " + sydneyDate.toLocalDate());

        // Ngày hiện tại tại America/Sao_Paulo
        ZonedDateTime saoPauloDate = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Ngày hiện tại tại Sao Paulo: " + saoPauloDate.toLocalDate());
    }
}

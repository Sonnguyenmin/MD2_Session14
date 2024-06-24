package homework.bai2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AddSubtractDateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        // Thêm 5 ngày
        LocalDate newDate = date.plusDays(5);
        System.out.println("Thêm 5 ngày: " + newDate);

        // Bớt 2 giờ
        LocalTime newTime = time.minusHours(2);
        System.out.println("Bớt 2 giờ: " + newTime);

        // Thêm 30 phút
        LocalDateTime newDateTime = dateTime.plusMinutes(30);
        System.out.println("Thêm 30 phút: " + newDateTime);
    }
}
package homework.bai2;

import java.time.LocalDate;

public class NextPreviousDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        // Ngày tiếp theo
        LocalDate nextDate = date.plusDays(1);
        System.out.println("Ngày tiếp theo: " + nextDate);

        // Ngày trước đó
        LocalDate previousDate = date.minusDays(1);
        System.out.println("Ngày trước đó: " + previousDate);
    }
}
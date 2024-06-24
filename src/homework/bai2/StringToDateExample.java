package homework.bai2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDateExample {
    public static void main(String[] args) {
        String dateString = "21/06/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        System.out.println("Chuỗi ngày chuyển sang LocalDate: " + date);
    }
}

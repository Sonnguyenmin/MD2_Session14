package homework.bai2;

import java.time.Year;

public class DaysInYearExample {
    public static void main(String[] args) {
        Year currentYear = Year.now();
        int daysInYear = currentYear.length();
        System.out.println("Số ngày trong năm hiện tại: " + daysInYear);
    }
}
package homework.bai2;

import java.time.YearMonth;

public class DaysInMonthExample {
    public static void main(String[] args) {
        YearMonth currentMonth = YearMonth.now();
        int daysInMonth = currentMonth.lengthOfMonth();
        System.out.println("Days in month: " + daysInMonth);
    }
}

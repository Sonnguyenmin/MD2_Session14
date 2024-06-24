package homework.bai2;

import java.time.LocalDate;

public class CompareDatesExample {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2018, 1, 1);
        LocalDate date2 = LocalDate.of(2019, 2, 3);

        int compare = date2.compareTo(date1);
        System.out.println("Kết quả so sánh hai ngày: " + compare);
    }
}


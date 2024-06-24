package homework.bai2;

import java.time.LocalTime;

public class CompareTimesExample {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(10, 30, 0);
        LocalTime time2 = LocalTime.of(12, 45, 0);

        int comparison = time1.compareTo(time2);
        System.out.println("Kết quả so sánh hai thời gian: " + comparison);
    }
}
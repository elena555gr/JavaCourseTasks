import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Java8Task5 {
    public static void main(String[] args) {
        LocalDateTime currDate = LocalDateTime.now();
        LocalDateTime t = currDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(t.format(DateTimeFormatter.ofPattern("YYYY-mm-dd")));
    }
}

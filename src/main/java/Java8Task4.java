import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Java8Task4 {
    public static void main(String[] args) {
        //var1
        String formatDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println(formatDate);
        //var2
        String formatter = new SimpleDateFormat("EEEE").format(new Date());
        System.out.println(formatter);
    }
}

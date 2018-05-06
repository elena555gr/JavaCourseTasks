import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask2 {
    public static void main(String[] args) {

        String pattern = "\\w{3,15}";
        Pattern p = Pattern.compile(pattern);

        for (int i = 0; i<args.length; i++){

            Matcher m = p.matcher(args[i]);

            if (m.matches()){
                System.out.println("ok");
            }
            else {
                System.out.println("not ok");
            }
        }
    }
}

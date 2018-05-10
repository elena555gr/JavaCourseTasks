import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegexTask1 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                System.out.print("Enter Surname, Name and Patronimic : ");
                String input = br.readLine();
                if ("q".equals(input)) {
                    System.out.println("Exit!");
                    System.exit(0);
                }
                String[] parts = input.split(" ");
                String surname = parts[0];
                String name = parts[1];
                String patronimic = parts[2];
                char initial1 = name.charAt(0);
                char initial2 = patronimic.charAt(0);

                System.out.println(surname + " " + initial1 + " "+ initial2);
                System.out.println(name);
                System.out.println(name + " " + patronimic + " " + surname);
                System.out.println("-----------\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class RegexTask4 {
    public static void main(String[] args) {
        String str = "I     am learning      Java            Core";
            String newStr = str.replaceAll("\\s{2,}"," ");
            System.out.println(newStr);
        }
    }
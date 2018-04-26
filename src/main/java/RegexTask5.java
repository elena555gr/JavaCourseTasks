/*
Implement a pattern for US currency: the first symbol "$", then any number of digits, dot and
two digits after the dot. Enter the text from the console that contains several occurrences of US
currency. Display all occurrences on the screen.

Question: how to match in full $2000.453. How to not take into account if the match is not full.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTask5 {
    public static void main(String[] args) {


       String str = "$200000 and $0.45 equals to $2000.45 and not $0.456, not $89,98 $df45.gf $89.89 $0.45 ";

       String pattern = "\\$[0-9]+(\\.[0-9]{0,2}[^0-9])";
       Pattern p = Pattern.compile(pattern);
       Matcher m = p.matcher(str);
       while (m.find()){
           System.out.println(m.group(0));
           }
       }
    }


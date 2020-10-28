import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTaskManager {
        public String RunSecondTask(String text, int lengthOfWord) {
            StringBuffer sb = new StringBuffer();
            Matcher m = Pattern.compile("(?i)\\b([a-z])(.+?)\\b").matcher(text);
            while (m.find()) {
                if (m.group(2).length() == lengthOfWord - 1 && IsConsonant(m)) {
                    m.appendReplacement(sb, "");
                }
            }
            m.appendTail(sb);
        return sb.toString();
        }
        public boolean IsConsonant(Matcher m) {
            char[] chars = "bcdfghjklmnpqrstvwxyz".toCharArray();
            for(char c:chars) {
                if(c==m.group(1).toLowerCase().charAt(0)){
                    return true;
                }
            }
            return false;
        }
    }

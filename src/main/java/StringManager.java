import java.util.ArrayList;

public class StringManager {
   public void getCorrectEmail (ArrayList<String> allEmails, ArrayList<String> correctEmails) {
       for(String s:allEmails) {
           boolean isCorrect=true;
           int indexOfAtSign=s.indexOf('@');
           int countOfDot=0;
           String s_low=s.toLowerCase();
           for(int i=0;i<indexOfAtSign;i++) {
               char c=s_low.charAt(i);
               if((c<'a'||c>'z')&&(c<'0'||c>'9')&& c!='.'&& c!='_') {
                   isCorrect=false;
                   break;
               }
               if((i==0||i==indexOfAtSign-1)&&c=='.') {
                   isCorrect=false;
                   break;
               }
           }
           for(int i=indexOfAtSign+1; i<s.length();i++) {
               char c=s.charAt(i);
               if(c=='.'){
                   countOfDot++;
               }
               if((c<'a'|| c>'z') &&c!='.') {
                   isCorrect=false;
                   break;
               }
               if(c=='.'&&(i==s.length()-1||i==indexOfAtSign+1)){
                   isCorrect=false;
                   break;
               }
           }
           if(countOfDot!=1) {
               isCorrect=false;
           }
           if(isCorrect) {
               correctEmails.add(s);
           }

       }
   }
}

import java.io.IOException;
import java.util.ArrayList;

public class FirstTaskManager {
    public void RunFirstTask() throws IOException {
        ScanningFromFile scanningFromFile=new ScanningFromFile();
        String text= scanningFromFile.readFromFile("C:\\\\Users\\\\Admin\\\\Desktop\\\\text.txt");
        String delimiterForSentence=",";
        String delimiterForWords=" ";
        String [] sentences;
        String [] words;
        ArrayList<String> neededSentence=new ArrayList<>();

        System.out.println("Text is:\n"+text);
        sentences=text.split(delimiterForSentence);
        words = text.split(delimiterForWords);
        for(String s:sentences) {
            neededSentence.add(s);
        }


        ArrayList<String> canBeEmail= new ArrayList<>();
        for(String s:words)
            if (s.indexOf('@') != -1) {
                canBeEmail.add(s);
            }

        StringManager stringManager=new StringManager();

        System.out.println("Can be e-mails: "+canBeEmail);
        ArrayList<String> correctEmails=new ArrayList<>();
        stringManager.getCorrectEmail(canBeEmail,correctEmails);
        System.out.println("Correct e-mails: "+correctEmails);

        int index=0;
        for(String s:sentences) {
            for(String correctEmail:correctEmails) {
                if(s.contains(correctEmail)) {
                    neededSentence.remove(s);
                    neededSentence.add(index,neededSentence.get(sentences.length-2));
                }
            }
            index++;
        }
        System.out.println("Final text: "+neededSentence);
    }
}

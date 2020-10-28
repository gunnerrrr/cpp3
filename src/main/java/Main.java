import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FirstTaskManager firstTaskManager=new FirstTaskManager();
        firstTaskManager.RunFirstTask();
        SecondTaskManager secondTaskManager=new SecondTaskManager();
        System.out.println("Enter your text:\n");
        Scanner scanner=new Scanner(System.in);
        String text= scanner.nextLine();
        System.out.println("Enter your length:\n");
        scanner=new Scanner(System.in);
        int lengthOfWord=scanner.nextInt();
        String resultText=secondTaskManager.RunSecondTask(text,lengthOfWord);
        System.out.println("Text is:\n"+resultText);
    }
}

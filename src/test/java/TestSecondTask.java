import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestSecondTask {
@Test
    public void testSecondTaskEasy() {
    SecondTaskManager secondTaskManager = new SecondTaskManager();
    String text="Hello darkness my old friend! I try to talk with you again.";
    int length=3;
    String needText="Hello darkness my old friend! I  to talk with  again.";
      assertEquals(needText,secondTaskManager.RunSecondTask(text,length));
}
    @Test
    public void testSecondTaskHard()  {
        SecondTaskManager secondTaskManager = new SecondTaskManager();
        String text="Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
                " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
                " when an unknown printer took a galley of type and scrambled it to make " +
                "a type specimen book. It has survived not only five centuries, but also the " +
                "leap into electronic typesetting, remaining essentially unchanged. It was popularised" +
                " in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and more recently with desktop publishing software like Aldus PageMaker including " +
                "versions of Lorem Ipsum.";
        int length=4;
        String needText="Lorem Ipsum is simply dummy  of the printing and typesetting industry." +
                " Lorem Ipsum has  the industry's standard dummy  ever since the 1500s," +
                "  an unknown printer  a galley of  and scrambled it to  " +
                "a  specimen . It has survived not only  centuries, but also the " +
                " into electronic typesetting, remaining essentially unchanged. It was popularised" +
                " in the 1960s  the release of Letraset sheets containing Lorem Ipsum passages, " +
                "and  recently  desktop publishing software  Aldus PageMaker including " +
                "versions of Lorem Ipsum.";
        assertEquals(needText,secondTaskManager.RunSecondTask(text,length));
    }
}

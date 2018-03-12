package app;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppLabTest{
    public AppLabTest() { }
    /**
    * Test oflerJSONmethod, of class AppLab.
    */
    @Test
    public void testLerJSON() throws Exception{
        System.out.println("lerJSON");
        String url= "http://time.jsontest.com/"; // esta URL gera um conteúdo JSON
        String result= AppLab.lerJSON(url);
        assertTrue(result.length() > 0);
    }
}
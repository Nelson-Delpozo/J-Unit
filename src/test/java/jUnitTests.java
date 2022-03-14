import org.junit.Test;
import static org.junit.Assert.*;

public class jUnitTests {

    @Test
    public void testIfNameIsNelson(){
        String expected = "Nelson";
        String actual = "Cindy";

        assertEquals(expected, actual);
    }



    public static void main(String[] args) {
    }//END OF MAIN

}//END OF CLASS

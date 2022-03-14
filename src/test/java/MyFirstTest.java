import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void testIfStringsAreEqual() {
        String string1 = "Codeup";
        String string2 = "codeup";

        assertEquals(string1, string2);
    }


    @Test
    public void testIfArraysAreNotEqual(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);


    }



}//END OF CLASS

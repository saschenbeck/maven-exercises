import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class MyFirstTest {
    @Test
    public void testIfNameIsCodeUp(){
        String expected = "CodeUp";
        String actual = "CodeUp";

        assertEquals(expected,actual);
        assertNotEquals(expected, "notCodeUp");
    }

    @Test
    public void testIfArrayListsAreTheSame(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages,moreLanguages);
    }

    @Test
    public void testIfArraysAreEqual(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers,otherNumbers);

    }

    @Test
    public void testIfStringContainsCharacter(){
        String language = "PHP";
        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }
}

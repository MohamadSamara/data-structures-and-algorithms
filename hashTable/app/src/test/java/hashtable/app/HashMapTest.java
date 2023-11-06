package hashtable.app;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class HashMapTest {
    @Test
    public void testGetAndSet() {
        HashMap<String, Integer> hashMap = new HashMap<>(5);
        hashMap.set("Mohamad", 1);
        hashMap.set("Samara", 2);
        assertEquals(1, hashMap.get("Mohamad"));
        assertEquals(2, hashMap.get("Samara"));
    }

    @Test
    public void testHas() {
        HashMap<String, Integer> hashMap = new HashMap<>(5);
        hashMap.set("Mohamad", 1);
        assertTrue(hashMap.has("Mohamad"));
        assertFalse(hashMap.has("Samara"));
    }

    @Test
    public void testKeys() {
        HashMap<String, Integer> hashMap = new HashMap<>(5);
        hashMap.set("Mohamad", 1);
        hashMap.set("Samara", 2);
        assertEquals(List.of("Mohamad", "Samara"), hashMap.keys());
    }


    // ******************* CC31 ******************
    @Test
    void testRepeatedWordWithRepeatedWord() {
        RepeatedWord repeatedWord = new RepeatedWord();
        String input = "Once upon a time, there was a brave princess who...";
        assertEquals("a", repeatedWord.repeatedWord(input));
    }

    @Test
    void testRepeatedWordWithRepeatedWord2() {
        RepeatedWord repeatedWord = new RepeatedWord();
        String input = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."	;
        assertEquals("summer", repeatedWord.repeatedWord(input));
    }

    @Test
    void testRepeatedWordWithRepeatedWord3() {
        RepeatedWord repeatedWord = new RepeatedWord();
        String input = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."	;
        assertEquals("it", repeatedWord.repeatedWord(input));
    }

    @Test
    void testRepeatedWordWithNoRepeatedWord() {
        RepeatedWord repeatedWord = new RepeatedWord();
        String input = "Hello world"	;
        assertEquals("No repeated word", repeatedWord.repeatedWord(input));
    }
}

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
}

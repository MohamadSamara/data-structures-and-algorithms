package hashtable.app;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LeftJoinTest {

    @Test
    public void leftJoinTest() {
        HashMap<String, String> synonymsHashmap = new HashMap<>(5);
        synonymsHashmap.set("diligent", "employed");
        synonymsHashmap.set("fond", "enamored");
        synonymsHashmap.set("guide", "usher");
        synonymsHashmap.set("outfit", "garb");
        synonymsHashmap.set("wrath", "anger");

        HashMap<String, String> antonymsHashmap = new HashMap<>(5);
        antonymsHashmap.set("diligent", "idle");
        antonymsHashmap.set("fond", "averse");
        antonymsHashmap.set("guide", "follow");
        antonymsHashmap.set("flow", "jam");
        antonymsHashmap.set("wrath", "delight");

        List<List<String>> result = LeftJoin.leftJoin(synonymsHashmap, antonymsHashmap);

        assertEquals(5, result.size());
        assertEquals(Arrays.asList("diligent", "employed", "idle"), result.get(0));
        assertEquals(Arrays.asList("wrath", "anger", "delight"), result.get(1));
        assertEquals(Arrays.asList("guide", "usher", "follow"), result.get(2));
        assertEquals(Arrays.asList("fond", "enamored", "averse"), result.get(3));
        assertEquals(Arrays.asList("outfit", "garb", null), result.get(4));
    }
    @Test
    public void leftJoinTestEmptyHashMaps() {
        HashMap<String, String> synonymsHashmap = new HashMap<>(5);
        HashMap<String, String> antonymsHashmap = new HashMap<>(5);

        List<List<String>> result = LeftJoin.leftJoin(synonymsHashmap, antonymsHashmap);

        assertEquals(0, result.size());
    }

    @Test
    public void leftJoinTestMatches() {
        HashMap<String, String> synonymsHashmap = new HashMap<>(5);
        synonymsHashmap.set("diligent", "employed");
        synonymsHashmap.set("guide", "usher");

        HashMap<String, String> antonymsHashmap = new HashMap<>(5);
        antonymsHashmap.set("diligent", "idle");
        antonymsHashmap.set("guide", "follow");

        List<List<String>> result = LeftJoin.leftJoin(synonymsHashmap, antonymsHashmap);

        assertEquals(2, result.size());
        assertEquals(List.of("diligent", "employed", "idle"), result.get(0));
        assertEquals(List.of("guide", "usher", "follow"), result.get(1));
    }



}

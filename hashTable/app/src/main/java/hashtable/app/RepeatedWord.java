package hashtable.app;

import java.util.List;

public class RepeatedWord {

    public String repeatedWord(String input) {
        if (input == null || input.isEmpty()) {
            return "No repeated word";
        }

        String[] words = input.toLowerCase().split("\\W+");
        HashMap<String, Integer> wordCountMap = new HashMap<>(20);

        for (String word : words) {
            if (wordCountMap.has(word)) {
                return word;
            } else {
                wordCountMap.set(word, 1);
            }
        }

        return "No repeated word";

    }
}

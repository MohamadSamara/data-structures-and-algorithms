package hashtable.app;

public class App {
    public static void main(String[] args) {


//        HashMap<String, Integer> hashMap = new HashMap<>(10);
//
//        hashMap.set("one", 1);
//        hashMap.set("two", 2);
//        hashMap.set("three", 3);
//        hashMap.set("four", 4);
//        hashMap.set("five", 5);
//
//        System.out.println("Value for 'one': " + hashMap.get("one"));
//        System.out.println("Value for 'three': " + hashMap.get("three"));
//        System.out.println("Value for 'six': " + hashMap.get("six"));
//
//        System.out.println("Does 'two' exist? " + hashMap.has("two"));
//        System.out.println("Does 'seven' exist? " + hashMap.has("seven"));
//
//        System.out.println("Unique keys: " + hashMap.keys());



        // ***************  Repeated Word **************

//        RepeatedWord repeatedWord = new RepeatedWord();
//
//        String input1 = "Once upon a time, there was a brave princess who...";
//        String input2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."	;
//        String input3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."	;
//
//        String result1 = repeatedWord.repeatedWord(input1);
//        String result2 = repeatedWord.repeatedWord(input2);
//        String result3 = repeatedWord.repeatedWord(input3);
//
//        System.out.println("Repeated word: " + result1);
//        System.out.println("Repeated word: " + result2);
//        System.out.println("Repeated word: " + result3);


//        // ***************  TreeIntersection **************
//
//        TreeIntersection  treeIntersection = new TreeIntersection();
//        BinaryTree binaryTree
//
//        String input1 = "Once upon a time, there was a brave princess who...";
//        String input2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."	;
//        String input3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."	;
//
//        String result1 = repeatedWord.repeatedWord(input1);
//        String result2 = repeatedWord.repeatedWord(input2);
//        String result3 = repeatedWord.repeatedWord(input3);
//
//        System.out.println("Repeated word: " + result1);
//        System.out.println("Repeated word: " + result2);
//        System.out.println("Repeated word: " + result3);


// ************** Left Join ************

//        HashMap<String, String> synonymsHashmap = new HashMap<>(5);
//        synonymsHashmap.set("diligent", "employed");
//        synonymsHashmap.set("fond", "enamored");
//        synonymsHashmap.set("guide", "usher");
//        synonymsHashmap.set("outfit", "garb");
//        synonymsHashmap.set("wrath", "anger");
//
//        HashMap<String, String> antonymsHashmap = new HashMap<>(5);
//        antonymsHashmap.set("diligent", "idle");
//        antonymsHashmap.set("fond", "averse");
//        antonymsHashmap.set("guide", "follow");
//        antonymsHashmap.set("flow", "jam");
//        antonymsHashmap.set("wrath", "delight");
//
//        List<List<String>> result = leftJoin(synonymsHashmap, antonymsHashmap);
//        System.out.println(result);

//      ************* For InterView *********

        HashMap<Character, Boolean> charMap = new HashMap<>(5);
        String input1 = "The quick brown fox jumps over the lazy dog";
        String input2 = "I love cats";
        String input3 = " ";

        System.out.println("Input 1: " + charMap.isUnique(input1));
        System.out.println("Input 2: " + charMap.isUnique(input2));
        System.out.println("Input 3: " + charMap.isUnique(input3));



    }




}

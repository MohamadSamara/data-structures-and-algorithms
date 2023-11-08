package hashtable.app;

public class App {
    public static void main(String[] args) {


        HashMap<String, Integer> hashMap = new HashMap<>(10);

        hashMap.set("one", 1);
        hashMap.set("two", 2);
        hashMap.set("three", 3);
        hashMap.set("four", 4);
        hashMap.set("five", 5);

        System.out.println("Value for 'one': " + hashMap.get("one"));
        System.out.println("Value for 'three': " + hashMap.get("three"));
        System.out.println("Value for 'six': " + hashMap.get("six"));

        System.out.println("Does 'two' exist? " + hashMap.has("two"));
        System.out.println("Does 'seven' exist? " + hashMap.has("seven"));

        System.out.println("Unique keys: " + hashMap.keys());



        // ***************  Repeated Word **************

        RepeatedWord repeatedWord = new RepeatedWord();

        String input1 = "Once upon a time, there was a brave princess who...";
        String input2 = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."	;
        String input3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York..."	;

        String result1 = repeatedWord.repeatedWord(input1);
        String result2 = repeatedWord.repeatedWord(input2);
        String result3 = repeatedWord.repeatedWord(input3);

        System.out.println("Repeated word: " + result1);
        System.out.println("Repeated word: " + result2);
        System.out.println("Repeated word: " + result3);


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



    }




}

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
    }



}

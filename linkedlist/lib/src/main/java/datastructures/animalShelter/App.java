package datastructures.animalShelter;
public class App {
    public static void main(String[] args) {

        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Animal("dog", "dog1"));
        shelter.enqueue(new Animal("dog", "dog2"));
        shelter.enqueue(new Animal("cat", "cat1"));
        shelter.enqueue(new Animal("cat", "cat2"));
        shelter.enqueue(new Animal("dog", "dog3"));

        System.out.println(shelter.dequeue("dog").getName());
        System.out.println(shelter.dequeue("dog").getName());
        System.out.println(shelter.dequeue("cat").getName());
        System.out.println(shelter.dequeue("cat").getName());
        System.out.println(shelter.dequeue("lion")); //null
    }
}

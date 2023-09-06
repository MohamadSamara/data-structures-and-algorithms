package datastructures.animalShelter;
import datastructures.queue.Queue;
public class AnimalShelter {
    private Queue<Animal> dogQueue;
    private Queue<Animal> catQueue;
    public AnimalShelter() {
        this.dogQueue = new Queue<>();
        this.catQueue = new Queue<>();
    }
    public void enqueue(Animal animal) {

//        if (animal instanceof Cat) {
//            dogQueue.enqueue(animal);
//        } else if (animal instanceof Dog) {
//            catQueue.enqueue(animal);
//        }
        if ("dog".equals(animal.getSpecies())) {
            dogQueue.enqueue(animal);
        } else if ("cat".equals(animal.getSpecies())) {
            catQueue.enqueue(animal);
        }
    }
    public Animal dequeue(String pref) {
        if ("dog".equals(pref) && !dogQueue.isEmpty()) {
            return dogQueue.dequeue();
        } else if ("cat".equals(pref) && !catQueue.isEmpty()) {
            return catQueue.dequeue();
        }
        return null;
    }

}
package trees.queue;

public class QueueNode<T> {
    QueueNode<T> next;
    T value;

    public QueueNode(T value){
        this.value = value;
    }

}

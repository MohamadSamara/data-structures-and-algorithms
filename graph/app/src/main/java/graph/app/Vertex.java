package graph.app;

import java.util.HashSet;

public class Vertex<V> {
    private V value;

    /**
     * i use the hash set to handel edges or Neighbors  because
     * and i use hash set beouse we dont have deplicate edges such as
     * a - b and  a - b
      */

    private HashSet<Edges<V>> edges = new HashSet<>();


    public Vertex(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    // i create this method to add edges with weight

    public void addEdges(Vertex<V> to, int weight ) {
        edges.add(new Edges<>(this, to, weight ));
    }


    // i create this method to add edges without weight
    public void addEdges(Vertex<V> to) {
        edges.add(new Edges<>(this, to, 0));
    }

    @Override
    public String toString() {

        return  this.value+" edges -> " + edges;
    }

    public HashSet<Edges<V>> getEdges() {
        return edges;
    }

    public void setEdges(HashSet<Edges<V>> edges) {
        this.edges = edges;
    }
}
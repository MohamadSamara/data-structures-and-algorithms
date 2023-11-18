package graph.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Graph<V> {

    /// this variable handle the size of graph
    private int size;

    // this hash map handel  all the vertex in graph and the value as key
    private final HashMap<V, Vertex<V>> vertex = new HashMap<>();

    public Graph() {
    }


    public Vertex<V> addVertex(V value) {
        // first create a new vertex
        Vertex<V> newVertex = new Vertex<>(value);
        // put the vertex if not exist in hashmap
        vertex.putIfAbsent(value, newVertex);
        //increment size
        size++;
        return newVertex;
    }

    /// add edge with weight
    public void addEdge(Vertex<V> vertex1, Vertex<V> vertex2, int weight) {
        if (vertex.get(vertex2.getValue()) == null || vertex.get(vertex2.getValue()) == null)
            throw new IllegalArgumentException();
        vertex.get(vertex1.getValue()).addEdges(vertex2, weight);
        vertex.get(vertex2.getValue()).addEdges(vertex1, weight);
    }

    /// add edge without  weight

    public void addEdge(Vertex<V> vertex1, Vertex<V> vertex2) {
        if (vertex.get(vertex2.getValue()) == null || vertex.get(vertex2.getValue()) == null)
            throw new IllegalArgumentException();
        vertex.get(vertex1.getValue()).addEdges(vertex2);
        vertex.get(vertex2.getValue()).addEdges(vertex1);
    }

    // return all vertices in graph
    public Collection<Vertex<V>> getVertices() {
        return vertex.values();
    }

    // get connected on  Neighbors vertex
    public HashSet<Edges<V>> getNeighbors(Vertex<V> vertex) {
        if (this.vertex.containsKey(vertex.getValue()))
            return this.vertex.get(vertex.getValue()).getEdges();
        return null;
    }

    public int size() {
        return this.size;
    }

    /**
     * I create these methods to make testing easy
     */

    public boolean isContainVertex(Vertex<V> vertex) {
        return this.vertex.containsKey(vertex.getValue());
    }

    public boolean isContainValue(V value) {
        return vertex.containsKey(value);
    }

    // get the vertex and  Iterator for Edges and then check if and edges connected
    // to vertex 2
    public boolean isConnected(Vertex<V> vertex, Vertex<V> connectedVertex) {
        for (Edges<V> e : this.vertex.get(vertex.getValue()).getEdges()) {
            if (e.getTo().getValue().equals(connectedVertex.getValue())) return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "size=" + size +
                ", vertexes=" + vertex +
                '}';
    }
}
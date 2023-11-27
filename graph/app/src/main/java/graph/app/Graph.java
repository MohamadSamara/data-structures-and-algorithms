package graph.app;

import java.util.*;

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

    // ******** For CC 36 *********
    public List<V> breadthFirst(Vertex<V> root) {
        List<V> out = new ArrayList<>();
        Set<Vertex<V>> visited = new HashSet<>();
        Queue<Vertex<V>> queue = new ArrayDeque<>();
        if (vertex.get(root.getValue()) == null)
            return out;
        queue.add(vertex.get(root.getValue()));
        while (!queue.isEmpty()) {
            Vertex<V> node = queue.remove();
            if (visited.contains(node)) {
                continue;
            }
            out.add(node.getValue());
            visited.add(node);
            for (Edges<V> e : node.getEdges()) {
                if (!visited.contains(e.getTo()))
                    queue.add(vertex.get(e.getTo().getValue()));
            }
        }

        return out;
    }


    public Integer businessTrip(Graph<String> graph, String[] cityNames) {
        if (cityNames.length < 2) {
            return null;
        }

        int totalCost = 0;

        for (int i = 0; i < cityNames.length - 1; i++) {
            String currentCity = cityNames[i];
            String nextCity = cityNames[i + 1];

            boolean isConnected = false;
            for (Edges<String> edge : graph.getNeighbors(graph.addVertex(currentCity))) {
                if (edge.getTo().getValue().equals(nextCity)) {
                    totalCost += edge.getWeight();
                    isConnected = true;
                    break;
                }
            }
            if (!isConnected) {
                return null;
            }
        }
        return totalCost;
    }



//     ****************** For CC 38 ******************

//    public List<Vertex<V>> depthFirst(Vertex<V> node) {
//        return depthFirst(vertex.get(node.getValue()), new HashSet<>(), new ArrayList<>());
//    }
//
//    private List<Vertex<V>> depthFirst(Vertex<V> node, Set<Vertex<V>> visited, List<Vertex<V>> out) {
//        if (node == null)
//            return out;
//        visited.add(vertex.get(node.getValue()));
//        out.add(node);
//        for (Edges<V> edges : node.getEdges()) {
//            if (!visited.contains(vertex.get(edges.getTo().getValue())))
//                return depthFirst(vertex.get(edges.getTo().getValue()), visited, out);
//        }
//        return out;
//    }

    public List<Vertex<V>> depthFirst(Vertex<V> node) {
        return depthFirstHelper(vertex.get(node.getValue()), new HashSet<>(), new ArrayList<>());
    }

    private List<Vertex<V>> depthFirstHelper(Vertex<V> node, Set<Vertex<V>> visited, List<Vertex<V>> out) {
        if (node == null || visited.contains(node)) {
            return out;
        }

        visited.add(node);
        out.add(node);

        for (Edges<V> edges : node.getEdges()) {
            if (!visited.contains(edges.getTo())) {
                depthFirstHelper(edges.getTo(), visited, out);
            }
        }

        return out;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "size=" + size +
                ", vertexes=" + vertex +
                '}';
    }

}
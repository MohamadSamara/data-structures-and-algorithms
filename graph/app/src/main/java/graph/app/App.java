package graph.app;

import java.util.Collection;

public class App {
    public static void main(String[] args) {

// String Graph

        System.out.println("Test 1 For String Graph");


        Graph<String> stringGraph = new Graph<>();
        Vertex<String> vertex = new Vertex<>("A");
        Vertex<String> vertex2 = new Vertex<>("B");
        Vertex<String> vertex3 = new Vertex<>("C");
        stringGraph.addVertex("A");
        stringGraph.addVertex("B");
        stringGraph.addVertex("C");
        stringGraph.addEdge(vertex,vertex2);
        stringGraph.addEdge(vertex,vertex3,5);

        System.out.println(stringGraph.getNeighbors(vertex));
        System.out.println("**************************************");
        System.out.println(stringGraph.isConnected(vertex2,vertex3));


        System.out.println("Test 2 For Integer Graph");

// Integer Graph
        Graph<Integer> integerGraph = new Graph<>();

        Vertex<Integer> v1 = integerGraph.addVertex(1);
        Vertex<Integer> v2 = integerGraph.addVertex(2);
        Vertex<Integer> v3 = integerGraph.addVertex(3);

        integerGraph.addEdge(v1, v2, 4);
        integerGraph.addEdge(v2, v3, 5);

        System.out.println(integerGraph.isContainVertex(v1));
        System.out.println("**************************************");
        System.out.println(integerGraph.isConnected(v1, v2));
        System.out.println("**************************************");
        Collection<Vertex<Integer>> vertices = integerGraph.getVertices();
        System.out.println(vertices);
    }
}

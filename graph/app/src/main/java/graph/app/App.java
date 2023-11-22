package graph.app;

import java.util.Collection;

public class App {
    public static void main(String[] args) {



        Graph<String> stringGraph = new Graph<>();
        Vertex<String> node = new Vertex<>("Pandora");
        Vertex<String> node2 = new Vertex<>("Arendelle");
        Vertex<String> node3 = new Vertex<>("Metroville");
        Vertex<String> node4 = new Vertex<>("Monstroplolis");
        Vertex<String> node5 = new Vertex<>("Narnia");
        Vertex<String> node6 = new Vertex<>("Naboo");
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Arendelle");
        stringGraph.addVertex("Metroville");
        stringGraph.addVertex("Monstroplolis");
        stringGraph.addVertex("Narnia");
        stringGraph.addVertex("Naboo");


        stringGraph.addEdge(node, node2,50);
        stringGraph.addEdge(node2, node3,20);
        stringGraph.addEdge(node4, node3);
        stringGraph.addEdge(node4, node6);
        stringGraph.addEdge(node3, node6);
        stringGraph.addEdge(node3, node5);

        System.out.println(stringGraph.businessTrip(stringGraph,new String[]{"Pandora","Naboo"}));
        System.out.println(stringGraph.businessTrip(stringGraph, new String[]{"Pandora", "Arendelle", "Metroville"}));


// String Graph

//        System.out.println("Test 1 For String Graph");
//
//
//        Graph<String> stringGraph = new Graph<>();
//        Vertex<String> vertex = new Vertex<>("A");
//        Vertex<String> vertex2 = new Vertex<>("B");
//        Vertex<String> vertex3 = new Vertex<>("C");
//        stringGraph.addVertex("A");
//        stringGraph.addVertex("B");
//        stringGraph.addVertex("C");
//        stringGraph.addEdge(vertex,vertex2);
//        stringGraph.addEdge(vertex,vertex3,5);

//        System.out.println(stringGraph.getNeighbors(vertex));
//        System.out.println("**************************************");
//        System.out.println(stringGraph.isConnected(vertex2,vertex3));
//
//
//        System.out.println("Test 2 For Integer Graph");

// Integer Graph
//        Graph<Integer> integerGraph = new Graph<>();
//
//        Vertex<Integer> v1 = integerGraph.addVertex(1);
//        Vertex<Integer> v2 = integerGraph.addVertex(2);
//        Vertex<Integer> v3 = integerGraph.addVertex(3);
//
//        integerGraph.addEdge(v1, v2, 4);
//        integerGraph.addEdge(v2, v3, 5);

//        System.out.println(integerGraph.isContainVertex(v1));
//        System.out.println("**************************************");
//        System.out.println(integerGraph.isConnected(v1, v2));
//        System.out.println("**************************************");
//        Collection<Vertex<Integer>> vertices = integerGraph.getVertices();
//        System.out.println(vertices);


//        System.out.println(stringGraph.breadthFirst(vertex));
//
//        System.out.println("*********** Test 2 *********88");
//
//        Graph<String> graph = new Graph<>();
//        Vertex<String> root = graph.addVertex("A");
//        graph.addVertex("B");
//        graph.addVertex("C");
//        graph.addVertex("D");
//        graph.addEdge(root, graph.addVertex("E"));
//        graph.addEdge(root, graph.addVertex("F"));
//        graph.addEdge(graph.addVertex("G"), root);
//
//        System.out.println(graph.breadthFirst(root));



    }
}

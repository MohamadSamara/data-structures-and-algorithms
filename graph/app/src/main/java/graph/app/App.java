package graph.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {


//        Graph<String> stringGraph = new Graph<>();
//        Vertex<String> node = new Vertex<>("Pandora");
//        Vertex<String> node2 = new Vertex<>("Arendelle");
//        Vertex<String> node3 = new Vertex<>("Metroville");
//        Vertex<String> node4 = new Vertex<>("Monstroplolis");
//        Vertex<String> node5 = new Vertex<>("Narnia");
//        Vertex<String> node6 = new Vertex<>("Naboo");
//        stringGraph.addVertex("Pandora");
//        stringGraph.addVertex("Arendelle");
//        stringGraph.addVertex("Metroville");
//        stringGraph.addVertex("Monstroplolis");
//        stringGraph.addVertex("Narnia");
//        stringGraph.addVertex("Naboo");
//
//
//        stringGraph.addEdge(node, node2,50);
//        stringGraph.addEdge(node2, node3,20);
//        stringGraph.addEdge(node4, node3);
//        stringGraph.addEdge(node4, node6);
//        stringGraph.addEdge(node3, node6);
//        stringGraph.addEdge(node3, node5);
//
//        System.out.println(stringGraph.businessTrip(stringGraph,new String[]{"Pandora","Naboo"}));
//        System.out.println(stringGraph.businessTrip(stringGraph, new String[]{"Pandora", "Arendelle", "Metroville"}));


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


        // Test CC 38
//
//        Graph<String> graph = new Graph<>();
//        Vertex<String> A = graph.addVertex("A");
//        Vertex<String> B = graph.addVertex("B");
//        Vertex<String> C = graph.addVertex("C");
//        Vertex<String> D = graph.addVertex("D");
//        Vertex<String> E = graph.addVertex("E");
//        Vertex<String> F = graph.addVertex("F");
//        Vertex<String> G = graph.addVertex("G");
//        Vertex<String> H = graph.addVertex("H");
//
//        graph.addEdge(A,B);
//        graph.addEdge(A,D);
//
//        graph.addEdge(B,D);
//        graph.addEdge(B,C);
//
//        graph.addEdge(C,G);
//
//        graph.addEdge(D,E);
//        graph.addEdge(D,H);
//        graph.addEdge(D,F);
//
//        graph.addEdge(F,H);
//        graph.addEdge(F,H);
//
//        System.out.println(graph.depthFirst(A));



        // Test For CC 39
        String[] nodes = {"a", "b", "c", "d", "e"};
        boolean[][] adjacencyMatrix = {
                {false, true, false, false, true},
                {true, false, true, true, false},
                {false, true, false, true, false},
                {false, true, true, false, true},
                {true, false, false, true, false}
        };

        Map<String, List<String>> adjacencyList = AdjacencyList.convertAdjacencyMatrixToAdjacencyList(nodes, adjacencyMatrix);
        AdjacencyList.printAdjacencyList(adjacencyList);
    }

    // For CC39 ( Interview )
    static class AdjacencyList {

        public static Map<String, List<String>> convertAdjacencyMatrixToAdjacencyList(String[] nodes, boolean[][] adjacencyMatrix) {
            Map<String, List<String>> adjacencyList = new HashMap<>();
            for (int i = 0; i < nodes.length; i++) {
                List<String> neighbors = new ArrayList<>();
                for (int j = 0; j < nodes.length; j++) {
                    if (adjacencyMatrix[i][j]) {
                        neighbors.add(nodes[j]);
                    }
                }
                adjacencyList.put(nodes[i], neighbors);
            }
            return adjacencyList;
        }
        public static void printAdjacencyList(Map<String, List<String>> adjacencyList) {
            for (String node : adjacencyList.keySet()) {
                System.out.print(node + "|->");
                for (String neighbor : adjacencyList.get(node)) {
                    System.out.print(neighbor + " ");
                }
                System.out.println();
            }
        }
    }
}


package graph.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    Graph<String> stringGraph;
    Graph<Integer> integerGraph;

    @BeforeEach
    void createGraph() {
        stringGraph = new Graph<>();
        integerGraph = new Graph<>();
    }

    @Test
    void assertAddVertex(){
        stringGraph.addVertex("Mohammed");
        assertTrue(stringGraph.isContainValue("Mohammed"));
        // to make sure is isContainValue is work
        assertFalse(stringGraph.isContainValue("Mohammed22"));
    }

    @Test
    void assertAddVertex2(){
        integerGraph.addVertex(20);
        assertTrue(integerGraph.isContainValue(20));
        // to make sure is isContainValue is work
        assertFalse(integerGraph.isContainValue(30));
    }

    @Test
    void assertAddEdges(){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        Vertex<Integer> vertex2 = new Vertex<>(20);
        Vertex<Integer> vertex3 = new Vertex<>(30);

        integerGraph.addVertex(vertex1.getValue());
        integerGraph.addVertex(vertex2.getValue());
        integerGraph.addVertex(vertex3.getValue());
        integerGraph.addEdge(vertex1,vertex2);
        assertTrue(integerGraph.isConnected(vertex1,vertex2));
        // to make sure is isContainValue is work
        assertFalse(integerGraph.isConnected(vertex1,vertex3));
    }

    @Test
    void assertAllVertexes(){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        Vertex<Integer> vertex2 = new Vertex<>(20);
        Vertex<Integer> vertex3 = new Vertex<>(30);
        integerGraph.addVertex(vertex1.getValue());
        integerGraph.addVertex(vertex2.getValue());
        integerGraph.addVertex(vertex3.getValue());
        integerGraph.addEdge(vertex1,vertex2);
        integerGraph.addEdge(vertex1,vertex3);
        //// Neighbors are returned with the weight between vertexes included
        String excepted ="[10  connected to 30 weight: 0, 10  connected to 20 weight: 0]";
        assertEquals(excepted,integerGraph.getNeighbors(vertex1).toString());

    }

    @Test
    void assertAllNeighbors (){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        Vertex<Integer> vertex2 = new Vertex<>(20);
        Vertex<Integer> vertex3 = new Vertex<>(30);
        integerGraph.addVertex(vertex1.getValue());
        integerGraph.addVertex(vertex2.getValue());
        integerGraph.addVertex(vertex3.getValue());
        assertNotEquals(0,integerGraph.getVertices().size());

    }

    @Test
    void size(){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        Vertex<Integer> vertex2 = new Vertex<>(20);
        Vertex<Integer> vertex3 = new Vertex<>(30);
        integerGraph.addVertex(vertex1.getValue());
        integerGraph.addVertex(vertex2.getValue());
        integerGraph.addVertex(vertex3.getValue());
        assertEquals(3,integerGraph.size());

    }
    /// A graph with only one vertex and edge can be properly returned
    @Test
    void testOnVertex(){
        Vertex<Integer> vertex1 = new Vertex<>(10);
        integerGraph.addVertex(vertex1.getValue());
        String excepted ="Graph{size=1, vertexes={10=10 edges -> []}}";
        assertEquals(excepted,integerGraph.toString());
    }


 // *********** For CC 36 ***********

    @Test
    void testHappyPath() {
        //  create vertex
        Vertex<String> vertex = new Vertex<>("Pandora");
        Vertex<String> vertex2 = new Vertex<>("Arendelle");
        Vertex<String> vertex3 = new Vertex<>("Metroville");
        Vertex<String> vertex4 = new Vertex<>("Monstroplolis");
        Vertex<String> vertex5 = new Vertex<>("Narnia");
        Vertex<String> vertex6 = new Vertex<>("Naboo");
        // add vertexes
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Arendelle");
        stringGraph.addVertex("Metroville");
        stringGraph.addVertex("Monstroplolis");
        stringGraph.addVertex("Narnia");
        stringGraph.addVertex("Naboo");

        // add edges
        stringGraph.addEdge(vertex, vertex2);
        stringGraph.addEdge(vertex2, vertex3);
        stringGraph.addEdge(vertex4, vertex3);
        stringGraph.addEdge(vertex4, vertex6);
        stringGraph.addEdge(vertex3, vertex6);
        stringGraph.addEdge(vertex3, vertex5);

        List<String> expected = Arrays.asList("Pandora", "Arendelle", "Metroville", "Monstroplolis" , "Narnia", "Naboo");
        assertEquals(expected, stringGraph.breadthFirst(vertex));
    }


    @Test
    void testEdgeCase() {

        //  create Vertex
        Vertex<String> vertex = new Vertex<>("Pandora");
        Vertex<String> vertex2 = new Vertex<>("Arendelle");
        Vertex<String> vertex3 = new Vertex<>("Metroville");
        Vertex<String> vertex4 = new Vertex<>("Monstroplolis");
        Vertex<String> vertex5 = new Vertex<>("Narnia");
        Vertex<String> vertex6 = new Vertex<>("Naboo");
        // add vertexes
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Arendelle");
        stringGraph.addVertex("Metroville");
        stringGraph.addVertex("Monstroplolis");
        stringGraph.addVertex("Narnia");
        stringGraph.addVertex("Naboo");

        // No edges

        List<String> expected = List.of("Pandora");
        assertEquals(expected, stringGraph.breadthFirst(vertex));
    }

    @Test
    void testExpectedFailure() {

        //  create Vertex
        Vertex<String> vertex = new Vertex<>("Pandora");
        Vertex<String> vertex2 = new Vertex<>("Pandora");
        Vertex<String> vertex3 = new Vertex<>("Pandora");
        Vertex<String> vertex4 = new Vertex<>("Pandora");
        Vertex<String> vertex5 = new Vertex<>("Pandora");
        Vertex<String> vertex6 = new Vertex<>("Pandora");
        // add Vertex's
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Pandora");
        stringGraph.addVertex("Pandora");

        // No edges
        stringGraph.addEdge(vertex, vertex2);
        stringGraph.addEdge(vertex2, vertex3);
        stringGraph.addEdge(vertex4, vertex3);
        stringGraph.addEdge(vertex4, vertex6);
        stringGraph.addEdge(vertex3, vertex6);
        stringGraph.addEdge(vertex3, vertex5);

        List<String> expected = List.of("Pandora");
        assertEquals(expected, stringGraph.breadthFirst(vertex));
    }

// **************** For CC 37 ****************

    @Test
    void testGraphBusinessTrip() {
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

        stringGraph.addEdge(node, node2, 50);
        stringGraph.addEdge(node2, node3, 20);
        stringGraph.addEdge(node4, node3);
        stringGraph.addEdge(node4, node6);
        stringGraph.addEdge(node3, node6);
        stringGraph.addEdge(node3, node5);

        // Test 1
         assertEquals(50, stringGraph.businessTrip(stringGraph, new String[]{"Pandora", "Arendelle"}));

        // Test 2
         assertEquals(70, stringGraph.businessTrip(stringGraph, new String[]{"Pandora", "Arendelle", "Metroville"}));

         // Test 3
        assertNull(stringGraph.businessTrip(stringGraph, new String[]{"Arendelle", "Monstroplolis", "Naboo"}));

        // Test 4
         assertEquals(0, stringGraph.businessTrip(stringGraph, new String[]{"Narnia", "Metroville", "Monstroplolis", "Naboo"}));

        // Test 5
        assertNull(stringGraph.businessTrip(stringGraph, new String[]{}));
    }
}